package br.com.senac.inicializacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import br.com.senac.dominio.Carro;
import br.com.senac.dominio.Categoria;
import br.com.senac.dominio.Chave;
import br.com.senac.dominio.Fabricante;
import br.com.senac.dominio.Livro;
import br.com.senac.repositorio.CarroRepository;
import br.com.senac.repositorio.CategoriaRepositorio;
import br.com.senac.repositorio.ChaveRepository;
import br.com.senac.repositorio.FabricanteRepository;
import br.com.senac.repositorio.LivroRepositorio;

@Component
public class Init implements ApplicationListener<ContextRefreshedEvent> {

	@Autowired
	LivroRepositorio livroRepositorio;
	
	@Autowired
	CategoriaRepositorio categoriaRepositorio;
	
	@Autowired
	CarroRepository carroRepositorio;
	
	@Autowired
	FabricanteRepository fabricanteRepositorio;
	
	@Autowired
	ChaveRepository chaveRepositorio;
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		
		Livro livro1 = new Livro();
		livro1.setNome("aaaaaaaaa");
		livro1.setDescricao("bbbbbbbbbbbbbb");
		
		Livro livro2 = new Livro();
		livro2.setNome("cccccccccc");
		livro2.setDescricao("dddddddddd");
		
		livroRepositorio.save(livro1);
		livroRepositorio.save(livro2);
		
		Categoria cat1 = new Categoria();
		cat1.setNome("Guilherme");
		cat1.setDescricao("Descricao");
		
		categoriaRepositorio.save(cat1);
		
		
		Fabricante fabricante = new Fabricante();
		fabricante.setNome("VW");
		fabricanteRepositorio.save(fabricante);
		
		Chave chave = new Chave();
		chave.setCodigo("12255");
		chaveRepositorio.save(chave);
		
		Carro carro = new Carro();
		carro.setFabricante(fabricante);
		carro.setChave(chave);
		carro.setNome("fox");
		carroRepositorio.save(carro);
				
	}
}
