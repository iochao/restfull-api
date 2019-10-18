package jp.co.alp.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.alp.model.User;
import jp.co.alp.repository.UserRepository;
import jp.co.alp.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	private UserRepository userRepository;
	@Autowired
    public UserServiceImpl (UserRepository userRepository){
        this.userRepository = userRepository;
    }

	@Override
	public List<User> findAllUser() {
		return (List<User>) userRepository.findAll();
	}

	@Override
	public Optional<User> findById(Integer id) {
		return userRepository.findById(id);
	}

	@Override
	public void save(User user) {
		userRepository.save(user);
	}

	@Override
	public void remove(User user) {
		userRepository.delete(user);
	}
}
