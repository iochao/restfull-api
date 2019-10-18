package jp.co.alp.service;

import java.util.List;
import java.util.Optional;

import jp.co.alp.model.BikeInfo;

public interface BikeInfoService {
	List<BikeInfo> findAllBikeInfo();

	Optional<BikeInfo> findById(Integer id);

	void save(BikeInfo bikeInfo);

	void remove(BikeInfo bikeInfo);
}
