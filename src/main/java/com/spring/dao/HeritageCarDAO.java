package com.spring.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.spring.model.HeritageCar;

@Component
public class HeritageCarDAO {

	// Dummy database. Initialize with some dummy values.
	private static List<HeritageCar> heritageCars;
	{
		heritageCars = new ArrayList();
		heritageCars.add(new HeritageCar("ÖV4", "ÖV4 TV (Pick up) ÖV4 Chassis"));
		heritageCars.add(new HeritageCar("ÖV3", "ÖV3 TV (Pick up) ÖV3 Chassis"));
	}


	public List list() {
		return heritageCars;
	}

	public HeritageCar get(String id) {

		for (HeritageCar c : heritageCars) {
			if (c.getId().equals(id)) {
				return c;
			}
		}
		return null;
	}

	public String delete(String id) {

		for (HeritageCar c : heritageCars) {
			if (c.getId().equals(id)) {
				heritageCars.remove(c);
				return id;
			}
		}

		return null;
	}


	public HeritageCar update(String id, HeritageCar heritageCar) {

		for (HeritageCar c : heritageCars) {
			if (c.getId().equals(id)) {
				heritageCar.setId(c.getId());
				heritageCars.remove(c);
				heritageCars.add(heritageCar);
				return heritageCar;
			}
		}

		return null;
	}

}