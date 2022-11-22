package br.univille.novostalentos.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.novostalentos.entity.Venda;
import br.univille.novostalentos.repository.VendaRepository;
import br.univille.novostalentos.service.VendaService;

@Service
public class VendaServiceImpl implements VendaService {

    @Autowired
    private VendaRepository repository;

    @Override
    public List<Venda> getAll() {
        
        return repository.findAll();
    }

    @Override
    public Venda save(Venda venda) {
        
        return repository.save(venda);
    }

    @Override
    public Venda findByid(long id) {
        
        var resultado = repository.findById(id);
        if(resultado.isPresent()){
            return resultado.get();
        }
        return new Venda();
    }

   

    
    
}
