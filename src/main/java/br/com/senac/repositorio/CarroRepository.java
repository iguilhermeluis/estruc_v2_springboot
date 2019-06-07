package br.com.senac.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.senac.dominio.Carro;

@Repository
public interface CarroRepository extends JpaRepository<Carro, Integer>{

}
