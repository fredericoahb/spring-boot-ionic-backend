package com.fredericoahb.cursomc.services;

import java.util.Optional;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fredericoahb.cursomc.domain.Cliente;
import com.fredericoahb.cursomc.repositories.ClienteRepository;

@Service
public class ClienteService {
	
	//o serviço vai acessar o objeto de acesso a dados
	@Autowired
	private ClienteRepository repo;
	
	public Cliente find(Integer id){
		
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException
				("Objeto não encontrado! Id: ", + id + ", Tipo: " + Cliente.class.getName()));
	}

}
