package com.Villageinfo.villageinfo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

import com.Villageinfo.villageinfo.pojo.Village;

public interface VillageService {

	public Village upsert(Village village);
	public Optional<Village> getById(Integer id);
	public List<Village> getAllVillage();
	public Village deleteVillage(Integer id);
	
}
