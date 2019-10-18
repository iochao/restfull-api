package jp.co.alp.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.alp.model.BikeImage;
import jp.co.alp.repository.BikeImageRepository;
import jp.co.alp.service.BikeImageService;

@Service
public class BikeImageServiceImpl implements BikeImageService {
	private BikeImageRepository bikeImageRepository;
	@Autowired
    public BikeImageServiceImpl (BikeImageRepository bikeImageRepository){
        this.bikeImageRepository = bikeImageRepository;
    }

	@Override
	public List<BikeImage> findAllBikeImage() {
		return (List<BikeImage>) bikeImageRepository.findAll();
	}

	@Override
	public Optional<BikeImage> findById(Integer id) {
		return bikeImageRepository.findById(id);
	}

	@Override
	public void save(BikeImage bikeImage) {
		bikeImageRepository.save(bikeImage);
	}

	@Override
	public void remove(BikeImage bikeImage) {
		bikeImageRepository.delete(bikeImage);
	}
}
