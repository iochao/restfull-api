package jp.co.alp.service;

import java.util.List;
import java.util.Optional;

import jp.co.alp.model.App;

public interface AppService {
	List<App> findAllApp();

	Optional<App> findById(Integer id);

	void save(App app);

	void remove(App app);
}
