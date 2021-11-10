package br.aledguedes.citesapi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.aledguedes.citesapi.model.City;
import br.aledguedes.citesapi.repositories.CityRepository;

@Service
public class CityService {

	
	@Autowired
	private CityRepository repository;
	
	public List<City> listAllCitys() {
		return repository.findAll();
	}
	
	public Optional<City> listCityById(long id){
		Optional<City> city = repository.findById(id);
		return city;
	}
}
