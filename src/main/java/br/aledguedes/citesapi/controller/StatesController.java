package br.aledguedes.citesapi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.aledguedes.citesapi.model.States;
import br.aledguedes.citesapi.services.StateService;

@RestController
@RequestMapping("/states")
public class StatesController {
	
	@Autowired
	private StateService service;

	@GetMapping
	public ResponseEntity<List<States>> listCountry() {
		return ResponseEntity.ok(service.listAllStates());
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Optional<States>> listCountryId(@PathVariable Integer id) {
		Optional<States> c = service.listStatesById(id);
		if (c.isPresent()) {
			return ResponseEntity.ok().body(c);
		}
		return ResponseEntity.notFound().build();
	}

}
