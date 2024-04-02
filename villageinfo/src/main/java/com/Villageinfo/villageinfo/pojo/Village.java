package com.Villageinfo.villageinfo.pojo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table
public class Village {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private int population;
	private String sarpanch;
	public Village(int id, String name, int population, String sarpanch) {
		super();
		this.id = id;
		this.name = name;
		this.population = population;
		this.sarpanch = sarpanch;
	}
	public Village() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	public String getSarpanch() {
		return sarpanch;
	}
	public void setSarpanch(String sarpanch) {
		this.sarpanch = sarpanch;
	}
	@Override
	public String toString() {
		return "Village [id=" + id + ", name=" + name + ", population=" + population + ", sarpanch=" + sarpanch + "]";
	}


}
