package br.com.senac.dominio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Carro {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String nome;
	
	@ManyToMany
	@JoinTable(name = "carro_acessorio", joinColumns = @JoinColumn(name = "acessorio_id"), inverseJoinColumns = @JoinColumn(name = "carro_id"))
	private List<Acessorio> acessorios = new ArrayList<>();
	
	
	@OneToOne
	@JoinColumn(name="chave_id")
	private Chave chave;
	
	@ManyToOne
	private Fabricante fabricante;
	
	public Carro() {
		
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Chave getChave() {
		return chave;
	}
	public void setChave(Chave chave) {
		this.chave = chave;
	}
	public Fabricante getFabricante() {
		return fabricante;
	}
	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
	
	
}
