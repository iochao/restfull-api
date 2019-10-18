package jp.co.alp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import jp.co.alp.model.App;
import jp.co.alp.service.AppService;

@RestController
public class AppManagerController {
	private AppService appService;

	@Autowired
	public AppManagerController(AppService appService) {
		this.appService = appService;
	}

	@RequestMapping(value = "/apps", method = RequestMethod.GET)
	public ResponseEntity<List<App>> findAllApp() {
		List<App> apps = appService.findAllApp();
		if (apps.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(apps, HttpStatus.OK);
	}

	@RequestMapping(value = "/apps/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<App> getAppById(@PathVariable("id") Integer id) {
		Optional<App> app = appService.findById(id);

		if (!app.isPresent()) {
			return new ResponseEntity<>(app.get(), HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(app.get(), HttpStatus.OK);
	}

	@RequestMapping(value = "/apps", method = RequestMethod.POST)
	public ResponseEntity<App> createApp(@RequestBody App app, UriComponentsBuilder builder) {
		appService.save(app);
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(builder.path("/apps/{id}").buildAndExpand(app.getId()).toUri());
		return new ResponseEntity<>(app, HttpStatus.CREATED);
	}

	@RequestMapping(value = "/apps/{id}", method = RequestMethod.PUT)
	public ResponseEntity<App> updateApp(@PathVariable("id") Integer id, @RequestBody App app) {
		Optional<App> currentApp = appService.findById(id);

		if (!currentApp.isPresent()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}

		currentApp.get().setAppId(app.getAppId());
		currentApp.get().setToken(app.getToken());
		currentApp.get().setDomain(app.getDomain());

		appService.save(currentApp.get());
		return new ResponseEntity<>(currentApp.get(), HttpStatus.OK);
	}

	@RequestMapping(value = "/apps/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<App> deleteApp(@PathVariable("id") Integer id) {
		Optional<App> app = appService.findById(id);
		if (!app.isPresent()) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		appService.remove(app.get());
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}
