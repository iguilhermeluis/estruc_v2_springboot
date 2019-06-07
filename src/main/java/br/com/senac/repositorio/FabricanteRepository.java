package br.com.senac.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.senac.dominio.Fabricante;

@Repository
public interface FabricanteRepository extends JpaRepository<Fabricante, Integer>{

}
