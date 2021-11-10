package br.aledguedes.citesapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.aledguedes.citesapi.model.Country;

public interface CountryRepository extends JpaRepository<Country, Long>{
	
}
