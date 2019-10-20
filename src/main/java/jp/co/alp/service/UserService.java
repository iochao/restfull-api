package jp.co.alp.service;

import java.util.List;
import java.util.Optional;

import jp.co.alp.model.User;

public interface UserService {
	List<User> findAllUser();

	Optional<User> findById(Integer id);

	User findByUsername(String username);

	void save(User user);

	void remove(User user);
}
