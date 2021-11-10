package br.aledguedes.citesapi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.aledguedes.citesapi.model.City;
import br.aledguedes.citesapi.services.CityService;

@RestController
@RequestMapping("/cities")
public class CityController {

	@Autowired
	private CityService service;
	
	@GetMapping
	public ResponseEntity<List<City>> listCity() {
		return ResponseEntity.ok(service.listAllCitys());
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Optional<City>> listCountryId(@PathVariable Integer id) {
		Optional<City> c = service.listCityById(id);
		if (c.isPresent()) {
			return ResponseEntity.ok().body(c);
		}
		return ResponseEntity.notFound().build();
	}
}
