package com.fredericoahb.cursomc.services;

import java.util.Optional;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fredericoahb.cursomc.domain.Categoria;
import com.fredericoahb.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	//o serviço vai acessar o objeto de acesso a dados
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id){
		
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException
				("Objeto não encontrado! Id: ", + id + ", Tipo: " + Categoria.class.getName()));
	}

}
