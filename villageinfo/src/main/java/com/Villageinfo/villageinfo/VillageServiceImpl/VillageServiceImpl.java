package com.Villageinfo.villageinfo.VillageServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.Villageinfo.villageinfo.dao.VillageDao;
import com.Villageinfo.villageinfo.pojo.Village;
import com.Villageinfo.villageinfo.service.VillageService;

@Service
public class VillageServiceImpl implements VillageService {
	@Autowired
	VillageDao dao;

	public Village upsert(Village village) { // update and insert , two work..
		return dao.save(village);
	}

	public Optional<Village> getById(Integer id) {
		return dao.findById(id);
	}
	public List<Village> getAllVillage() {
		return dao.findAll(); // we are using in built method all over...if any new method we have to define
								// that method
	}
	public Village deleteVillage(Integer id) {
		// TODO Auto-generated method stub
		return dao.getById(id);   //?? need to check
	}
}
