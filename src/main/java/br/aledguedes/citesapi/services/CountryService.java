package br.aledguedes.citesapi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.aledguedes.citesapi.model.Country;
import br.aledguedes.citesapi.repositories.CountryRepository;

@Service
public class CountryService {

	public static final int PAGE_SIZE = 10;

	@Autowired
	private CountryRepository repository;

	public List<Country> listAllCountry() {
		return repository.findAll();
	}
	
	public Optional<Country> listCountryById(long id) {
		return repository.findById(id);
	}

//	public Page<Country> listAllCountry(int pagina) {
//		// TODO Auto-generated method stub
//		Pageable pageable = PageRequest.of(pagina, PAGE_SIZE);
//		
//		
//		return repository.findAll(pageable);
//	}

}
