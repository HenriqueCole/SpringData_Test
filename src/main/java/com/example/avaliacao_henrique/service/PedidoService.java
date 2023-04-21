package com.example.avaliacao_henrique.service;

import com.example.avaliacao_henrique.model.entity.Pedido;
import com.example.avaliacao_henrique.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoService {
    @Autowired
    private PedidoRepository pedidoRepository;

    public List<Pedido> findAll() {
        return pedidoRepository.findAll();
    }

    public <S extends Pedido> S save(S entity) {
        return pedidoRepository.save(entity);
    }

    public Optional<Pedido> findById(Long aLong) {
        return pedidoRepository.findById(aLong);
    }

    public boolean existsById(Long aLong) {
        return pedidoRepository.existsById(aLong);
    }

    public void deleteById(Long aLong) {
        pedidoRepository.deleteById(aLong);
    }
}
