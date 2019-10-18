package jp.co.alp.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.alp.model.Owner;
import jp.co.alp.repository.OwnerRepository;
import jp.co.alp.service.OwnerService;

@Service
public class OwnerServiceImpl implements OwnerService {
	private OwnerRepository ownerRepository;
	@Autowired
    public OwnerServiceImpl (OwnerRepository ownerRepository){
        this.ownerRepository = ownerRepository;
    }

	@Override
	public List<Owner> findAllOwner() {
		return (List<Owner>) ownerRepository.findAll();
	}

	@Override
	public Optional<Owner> findById(Integer id) {
		return ownerRepository.findById(id);
	}

	@Override
	public void save(Owner owner) {
		ownerRepository.save(owner);
	}

	@Override
	public void remove(Owner owner) {
		ownerRepository.delete(owner);
	}
}
