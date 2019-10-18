package jp.co.alp.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.alp.model.BikeInfo;
import jp.co.alp.repository.BikeInfoRepository;
import jp.co.alp.service.BikeInfoService;

@Service
public class BikeInfoServiceImpl implements BikeInfoService {
	private BikeInfoRepository bikeInfoRepository;
	@Autowired
    public BikeInfoServiceImpl (BikeInfoRepository bikeInfoRepository){
        this.bikeInfoRepository = bikeInfoRepository;
    }

	@Override
	public List<BikeInfo> findAllBikeInfo() {
		return (List<BikeInfo>) bikeInfoRepository.findAll();
	}

	@Override
	public Optional<BikeInfo> findById(Integer id) {
		return bikeInfoRepository.findById(id);
	}

	@Override
	public void save(BikeInfo bikeInfo) {
		bikeInfoRepository.save(bikeInfo);
	}

	@Override
	public void remove(BikeInfo bikeInfo) {
		bikeInfoRepository.delete(bikeInfo);
	}
}
