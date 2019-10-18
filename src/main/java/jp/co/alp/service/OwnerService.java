package jp.co.alp.service;

import java.util.List;
import java.util.Optional;

import jp.co.alp.model.Owner;

public interface OwnerService {
	List<Owner> findAllOwner();

	Optional<Owner> findById(Integer id);

	void save(Owner owner);

	void remove(Owner owner);
}
