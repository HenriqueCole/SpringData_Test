package com.example.avaliacao_henrique.service;

import com.example.avaliacao_henrique.model.entity.CartaoCredito;
import com.example.avaliacao_henrique.repository.CartaoCreditoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CartaoCreditoService {
    @Autowired
    private CartaoCreditoRepository cartaoCreditoRepository;

    public List<CartaoCredito> findAll() {
        return cartaoCreditoRepository.findAll();
    }

    public <S extends CartaoCredito> S save(S entity) {
        return cartaoCreditoRepository.save(entity);
    }

    public Optional<CartaoCredito> findById(Long aLong) {
        return cartaoCreditoRepository.findById(aLong);
    }

    public boolean existsById(Long aLong) {
        return cartaoCreditoRepository.existsById(aLong);
    }

    public void deleteById(Long aLong) {
        cartaoCreditoRepository.deleteById(aLong);
    }
}
