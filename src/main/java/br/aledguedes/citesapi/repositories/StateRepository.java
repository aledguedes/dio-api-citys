package br.aledguedes.citesapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.aledguedes.citesapi.model.States;

public interface StateRepository extends JpaRepository<States, Long>{

}
