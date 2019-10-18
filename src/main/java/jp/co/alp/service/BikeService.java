package jp.co.alp.service;

import java.util.List;
import java.util.Optional;

import jp.co.alp.model.Bike;

public interface BikeService {
	List<Bike> findAllBike();

	Optional<Bike> findById(Integer id);

	void save(Bike bike);

	void remove(Bike bike);
}
