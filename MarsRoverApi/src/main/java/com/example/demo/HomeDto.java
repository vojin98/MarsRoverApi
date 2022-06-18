package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Table;
import org.springframework.web.bind.annotation.RequestParam;

// @RequestParam(required = false) String marsApiRoverData
// @RequestParam(required = false) Integer marsSol
// @RequestParam(required = false)  Boolean defaultCheck
@Entity
@Table(name="mars_api_prefernces")
public class HomeDto {

	private long id;
	private long userId;
	
	private String marsApiRoverData;
	private Integer marsSol;
	
	
	private Boolean cameraFhaz;
	private Boolean cameraRhaz;
	private Boolean cameraMast;
	private Boolean cameraChemcam;
	private Boolean cameraMahli;
	private Boolean cameraMardi;
	private Boolean cameraNavCam;
	private Boolean cameraPanCam;
	private Boolean cameraMinites;
    private  Boolean rememberPreferences;

	
	
	
	@Id @GeneratedValue(strategy= GenerationType.IDENTITY)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public Boolean getRememberPreferences() {
		return rememberPreferences;
	}
	public void setRememberPreferences(Boolean rememberPreferences) {
		this.rememberPreferences = rememberPreferences;
	}
	@Column(length=20)
	public String getMarsApiRoverData() {
		return marsApiRoverData;
	}
	public void setMarsApiRoverData(String marsApiRoverData) {
		this.marsApiRoverData = marsApiRoverData;
	}
	public Integer getMarsSol() {
		return marsSol;
	}
	public void setMarsSol(Integer marsSol) {
		this.marsSol = marsSol;
	}
	public Boolean getCameraFhaz() {
		return cameraFhaz;
	}
	public void setCameraFhaz(Boolean cameraFhaz) {
		this.cameraFhaz = cameraFhaz;
	}
	public Boolean getCameraRhaz() {
		return cameraRhaz;
	}
	public void setCameraRhaz(Boolean cameraRhaz) {
		this.cameraRhaz = cameraRhaz;
	}
	public Boolean getCameraMast() {
		return cameraMast;
	}
	public void setCameraMast(Boolean cameraMast) {
		this.cameraMast = cameraMast;
	}
	public Boolean getCameraChemcam() {
		return cameraChemcam;
	}
	public void setCameraChemcam(Boolean cameraChemcam) {
		this.cameraChemcam = cameraChemcam;
	}
	public Boolean getCameraMahli() {
		return cameraMahli;
	}
	public void setCameraMahli(Boolean cameraMahli) {
		this.cameraMahli = cameraMahli;
	}
	public Boolean getCameraMardi() {
		return cameraMardi;
	}
	public void setCameraMardi(Boolean cameraMardi) {
		this.cameraMardi = cameraMardi;
	}
	public Boolean getCameraNavCam() {
		return cameraNavCam;
	}
	public void setCameraNavCam(Boolean cameraNavCam) {
		this.cameraNavCam = cameraNavCam;
	}
	public Boolean getCameraPanCam() {
		return cameraPanCam;
	}
	public void setCameraPanCam(Boolean cameraPanCam) {
		this.cameraPanCam = cameraPanCam;
	}
	public Boolean getCameraMinites() {
		return cameraMinites;
	}
	public void setCameraMinites(Boolean cameraMinites) {
		this.cameraMinites = cameraMinites;
	}
	@Override
	public String toString() {
		return "HomeDto [userId=" + userId + ", marsApiRoverData=" + marsApiRoverData + ", marsSol=" + marsSol
				+ ", cameraFhaz=" + cameraFhaz + ", cameraRhaz=" + cameraRhaz + ", cameraMast=" + cameraMast
				+ ", cameraChemcam=" + cameraChemcam + ", cameraMahli=" + cameraMahli + ", cameraMardi=" + cameraMardi
				+ ", cameraNavCam=" + cameraNavCam + ", cameraPanCam=" + cameraPanCam + ", cameraMinites="
				+ cameraMinites + ", rememberPreferences=" + rememberPreferences + "]";
	}
	
	
	
}
