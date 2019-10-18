package jp.co.alp.repository;

import org.springframework.data.repository.CrudRepository;

import jp.co.alp.model.User;

public interface UserRepository extends CrudRepository<User, Integer>{

}
