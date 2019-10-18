package jp.co.alp.service;

import java.util.List;
import java.util.Optional;

import jp.co.alp.model.BikeImage;

public interface BikeImageService {
	List<BikeImage> findAllBikeImage();

	Optional<BikeImage> findById(Integer id);

	void save(BikeImage bikeImage);

	void remove(BikeImage bikeImage);
}
