package jp.co.alp.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import jp.co.alp.model.Bike;

public interface BikeRepository extends PagingAndSortingRepository<Bike, Integer>{

}
