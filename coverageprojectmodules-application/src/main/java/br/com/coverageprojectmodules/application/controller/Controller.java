package br.com.coverageprojectmodules.application.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class Controller {
	
	@GetMapping("/product/list")
	public ResponseEntity<String> getProductDescription(@RequestParam(required = false) Integer id) {
		if(id == null) {
			return ResponseEntity.badRequest().build();
		}
		return ResponseEntity.ok("Celular");
	}

}
