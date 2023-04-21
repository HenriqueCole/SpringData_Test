package com.example.avaliacao_henrique.service;

import com.example.avaliacao_henrique.model.entity.Fornecedor;
import com.example.avaliacao_henrique.repository.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FornecedorService {
    @Autowired
    private FornecedorRepository fornecedorRepository;

    public List<Fornecedor> findAll() {
        return fornecedorRepository.findAll();
    }

    public <S extends Fornecedor> S save(S entity) {
        return fornecedorRepository.save(entity);
    }

    public Optional<Fornecedor> findById(Long aLong) {
        return fornecedorRepository.findById(aLong);
    }

    public boolean existsById(Long aLong) {
        return fornecedorRepository.existsById(aLong);
    }

    public void deleteById(Long aLong) {
        fornecedorRepository.deleteById(aLong);
    }
}
