package jp.co.alp.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.alp.model.Admin;
import jp.co.alp.repository.AdminRepository;
import jp.co.alp.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {
	private AdminRepository adminRepository;
	@Autowired
    public AdminServiceImpl (AdminRepository adminRepository){
        this.adminRepository = adminRepository;
    }

	@Override
	public List<Admin> findAllProduct() {
		return (List<Admin>) adminRepository.findAll();
	}

	@Override
	public Optional<Admin> findById(Integer id) {
		return adminRepository.findById(id);
	}

	@Override
	public void save(Admin admin) {
		adminRepository.save(admin);
	}

	@Override
	public void remove(Admin admin) {
		adminRepository.delete(admin);
	}
}
