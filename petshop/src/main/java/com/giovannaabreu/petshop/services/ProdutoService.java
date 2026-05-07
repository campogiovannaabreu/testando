 package com.giovannaabreu.petshop.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.giovannaabreu.petshop.entities.Produto.Produtos;
import com.giovannaabreu.petshop.repositories.ProdutoRepository.ProdutosRepository;

public class ProdutoService {

	@Service
	public class ProdutosService {
	    
	    private final ProdutosRepository repository;
	    
	    public ProdutosService(ProdutosRepository repository) {
	        this.repository = repository;
	    }
	    
	    public List<Produto> findAll() {
	        return repository.findAll();
	    }
	    
	    public Optional<Produto> findById(Integer id) {
	        return repository.findById(id);
	    }
	    
	    public Produto save(Produto produtos) {
	        return repository.save(produtos);
	    }
	    
	    public void deleteById(Integer id) {
	        repository.deleteById(id);
	    }


	}
}
