package jp.co.alp.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.alp.model.App;
import jp.co.alp.repository.AppRepository;
import jp.co.alp.service.AppService;

@Service
public class AppServiceImpl implements AppService {
	private AppRepository appRepository;
	@Autowired
    public AppServiceImpl (AppRepository appRepository){
        this.appRepository = appRepository;
    }

	@Override
	public List<App> findAllApp() {
		return (List<App>) appRepository.findAll();
	}

	@Override
	public Optional<App> findById(Integer id) {
		return appRepository.findById(id);
	}

	@Override
	public void save(App app) {
		appRepository.save(app);
	}

	@Override
	public void remove(App app) {
		appRepository.delete(app);
	}
}
