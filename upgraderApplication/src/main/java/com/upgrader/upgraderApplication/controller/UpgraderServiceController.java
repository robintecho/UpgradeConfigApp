package com.upgrader.upgraderApplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.upgrader.upgraderApplication.service.UpgraderService;

@RestController
@RequestMapping("upgraderApplication")
public class UpgraderServiceController {

	@Autowired
	UpgraderService upgraderService;

	@PostMapping(path = "/update")
	public ResponseEntity<Object> execution() {
		upgraderService.execute();
		return new ResponseEntity<Object>("All Files Update Successfully", HttpStatus.OK);
	}
}
