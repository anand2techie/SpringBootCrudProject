package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.dao.HeritageCarDAO;
import com.spring.model.HeritageCar;

@RestController
public class HeritageRestController {

	
	@Autowired
	private HeritageCarDAO heritageCarDAO;

	
	@GetMapping("/heritageCars")
	public List getHeritageCars() {
		return heritageCarDAO.list();
	}

	@GetMapping("/heritageCars/{id}")
	public ResponseEntity getHeritageCar(@PathVariable("id") String id) {

		HeritageCar heritageCar = heritageCarDAO.get(id);
		if (heritageCar == null) {
			return new ResponseEntity("No Heritage Car found for ID " + id, HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity(heritageCar, HttpStatus.OK);
	}

	@DeleteMapping("/heritageCars/{id}")
	public ResponseEntity deleteHeritageCars(@PathVariable String id) {

		if (null == heritageCarDAO.delete(id)) {
			return new ResponseEntity("No Heritage Car found for ID " + id, HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity(id, HttpStatus.OK);

	}

	@PutMapping("/heritageCars/{id}")
	public ResponseEntity updateHeritageCars(@PathVariable String id, @RequestBody HeritageCar heritageCar) {

		heritageCar = heritageCarDAO.update(id, heritageCar);

		if (null == heritageCar) {
			return new ResponseEntity("No Heritaga Car found for ID " + id, HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity(heritageCar, HttpStatus.OK);
	}

}