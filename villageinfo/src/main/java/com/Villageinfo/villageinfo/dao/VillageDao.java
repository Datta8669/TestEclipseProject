package com.Villageinfo.villageinfo.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Villageinfo.villageinfo.pojo.Village;

public interface VillageDao extends JpaRepository<Village, Serializable>{

}
