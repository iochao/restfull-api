package jp.co.alp.service;

import java.util.List;
import java.util.Optional;

import jp.co.alp.model.Admin;

public interface AdminService {
	List<Admin> findAllProduct();

	Optional<Admin> findById(Integer id);

	void save(Admin admin);

	void remove(Admin admin);
}
