package com.example.avaliacao_henrique.service;

import com.example.avaliacao_henrique.model.entity.Produto;
import com.example.avaliacao_henrique.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> findAll() {
        return produtoRepository.findAll();
    }

    public <S extends Produto> S save(S entity) {
        return produtoRepository.save(entity);
    }

    public Optional<Produto> findById(Long aLong) {
        return produtoRepository.findById(aLong);
    }

    public boolean existsById(Long aLong) {
        return produtoRepository.existsById(aLong);
    }

    public void deleteById(Long aLong) {
        produtoRepository.deleteById(aLong);
    }
}
