package br.com.senac.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.senac.dominio.Livro;

@Repository
public interface LivroRepositorio extends JpaRepository<Livro, Integer>{

}
