package br.aledguedes.citesapi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.aledguedes.citesapi.model.Country;
import br.aledguedes.citesapi.services.CountryService;

@RestController
@RequestMapping("/countries")
public class CountryController {

	@Autowired
	private CountryService service;

	@GetMapping
	public ResponseEntity<List<Country>> listCountry() {
		return ResponseEntity.ok(service.listAllCountry());
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Optional<Country>> listCountryId(@PathVariable Integer id) {
		Optional<Country> c = service.listCountryById(id);
		if (c.isPresent()) {
			return ResponseEntity.ok().body(c);
		}
		return ResponseEntity.notFound().build();
	}
}
