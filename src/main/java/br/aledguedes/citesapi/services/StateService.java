package br.aledguedes.citesapi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.aledguedes.citesapi.model.States;
import br.aledguedes.citesapi.repositories.StateRepository;

@Service
public class StateService {
	
	@Autowired
	private StateRepository repository;
	
	public List<States> listAllStates() {
		return repository.findAll();
	}
	
	public Optional<States> listStatesById(long id){
		Optional<States> uf = repository.findById(id);
		return uf;
	}
}
