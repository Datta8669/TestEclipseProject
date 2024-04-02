package com.Villageinfo.villageinfo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Villageinfo.villageinfo.pojo.Village;
import com.Villageinfo.villageinfo.service.VillageService;

@RestController
public class VillageController {
	@Autowired
	VillageService service;

	@PostMapping("/village") // first we have to post...then it will create table by help of JPA, and add
								// into db , then we can fetch
	public Village addDetails(@RequestBody Village vv) {
		return service.upsert(vv);
	}

	@GetMapping("village/{id}")
	public Optional<Village> getDetails(@PathVariable Integer id) {  //java 8 used..optional class..
		return service.getById(id);
	}

	@GetMapping("/village2")
	public List<Village> getAllDetails(Village vg) {
		return service.getAllVillage(); // will return list....
	}

	@DeleteMapping("/village/{id}")
	public Village deleteVillage(@PathVariable Integer id) {
		return service.deleteVillage(id);
	}

}
