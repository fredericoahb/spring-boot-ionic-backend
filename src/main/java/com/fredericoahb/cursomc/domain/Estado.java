package com.fredericoahb.cursomc.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Estado implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	
	//Estado nao pode serializar a cidade
	@JsonIgnore
	//mapeamento reverso. Um para muitos e mapear o ATRIBUTO em cidade many to one
	@OneToMany(mappedBy = "estado")
	//Associação um para muitos
	private List<Cidade> cidades = new ArrayList<>();
	
	//construtores
	public Estado () {
		}

		public Estado(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
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

		public List<Cidade> getCidades() {
			return cidades;
		}

		public void setCidades(List<Cidade> cidades) {
			this.cidades = cidades;
		}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estado other = (Estado) obj;
		if (id != other.id)
			return false;
		return true;
	}

}
