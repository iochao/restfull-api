package jp.co.alp.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bike_info")
public class BikeInfo implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private Integer bikeId;
	private String bikePlateNumber;
	private Integer bikeOwnerId;
	private Integer bikeType;
	private Integer bikeYearManu;
	private String bikeColor;
	private String bikeCodeRegist;
	private Date bikeCodeRegistDate;
	private String bikePlaceRegist;
	private Date createdAt;
	private Date updatedAt;
	private Integer createdBy;
	private Integer updatedBy;

	public BikeInfo() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getBikeId() {
		return bikeId;
	}

	public void setBikeId(Integer bikeId) {
		this.bikeId = bikeId;
	}

	public String getBikePlateNumber() {
		return bikePlateNumber;
	}

	public void setBikePlateNumber(String bikePlateNumber) {
		this.bikePlateNumber = bikePlateNumber;
	}

	public Integer getBikeOwnerId() {
		return bikeOwnerId;
	}

	public void setBikeOwnerId(Integer bikeOwnerId) {
		this.bikeOwnerId = bikeOwnerId;
	}

	public Integer getBikeType() {
		return bikeType;
	}

	public void setBikeType(Integer bikeType) {
		this.bikeType = bikeType;
	}

	public Integer getBikeYearManu() {
		return bikeYearManu;
	}

	public void setBikeYearManu(Integer bikeYearManu) {
		this.bikeYearManu = bikeYearManu;
	}

	public String getBikeColor() {
		return bikeColor;
	}

	public void setBikeColor(String bikeColor) {
		this.bikeColor = bikeColor;
	}

	public String getBikeCodeRegist() {
		return bikeCodeRegist;
	}

	public void setBikeCodeRegist(String bikeCodeRegist) {
		this.bikeCodeRegist = bikeCodeRegist;
	}

	public Date getBikeCodeRegistDate() {
		return bikeCodeRegistDate;
	}

	public void setBikeCodeRegistDate(Date bikeCodeRegistDate) {
		this.bikeCodeRegistDate = bikeCodeRegistDate;
	}

	public String getBikePlaceRegist() {
		return bikePlaceRegist;
	}

	public void setBikePlaceRegist(String bikePlaceRegist) {
		this.bikePlaceRegist = bikePlaceRegist;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Integer getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	public Integer getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(Integer updatedBy) {
		this.updatedBy = updatedBy;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
