package br.univille.novostalentos.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.novostalentos.entity.Produto;
import br.univille.novostalentos.repository.ProdutoRepository;
import br.univille.novostalentos.service.ProdutoService;

@Service
public class ProdutoServiceImpl implements ProdutoService{

    @Autowired    
    private ProdutoRepository repository;

    @Override
    public List<Produto> getAll() {
        
        return repository.findAll();
    }

    @Override
    public Produto save(Produto produto) {
        
        return repository.save(produto);
    }

    @Override
    public Produto findById(long id) {
        var resultado = repository.findById(id);
        if(resultado.isPresent()){
            return resultado.get();
        }
        return new Produto();
    }

    @Override
    public void delete(long id) {
        repository.deleteById(id);
        
    }
    
}
