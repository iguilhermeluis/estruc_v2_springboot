package br.com.senac.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.senac.dominio.Chave;

@Repository
public interface ChaveRepository  extends JpaRepository<Chave, Integer>{

}
