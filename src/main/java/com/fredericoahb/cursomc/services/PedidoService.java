package com.fredericoahb.cursomc.services;

import java.util.Optional;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fredericoahb.cursomc.domain.Pedido;
import com.fredericoahb.cursomc.repositories.PedidoRepository;

@Service
public class PedidoService {
	
	//o serviço vai acessar o objeto de acesso a dados
	@Autowired
	private PedidoRepository repo;
	
	public Pedido find(Integer id){
		
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException
				("Objeto não encontrado! Id: ", + id + ", Tipo: " + Pedido.class.getName()));
	}

}
