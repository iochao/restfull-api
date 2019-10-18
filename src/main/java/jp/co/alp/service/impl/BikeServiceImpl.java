package jp.co.alp.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.alp.model.Bike;
import jp.co.alp.repository.BikeRepository;
import jp.co.alp.service.BikeService;

@Service
public class BikeServiceImpl implements BikeService {
	private BikeRepository bikeRepository;
	@Autowired
    public BikeServiceImpl (BikeRepository bikeRepository){
        this.bikeRepository = bikeRepository;
    }

	@Override
	public List<Bike> findAllBike() {
		return (List<Bike>) bikeRepository.findAll();
	}

	@Override
	public Optional<Bike> findById(Integer id) {
		return bikeRepository.findById(id);
	}

	@Override
	public void save(Bike bike) {
		bikeRepository.save(bike);
	}

	@Override
	public void remove(Bike bike) {
		bikeRepository.delete(bike);
	}
}
