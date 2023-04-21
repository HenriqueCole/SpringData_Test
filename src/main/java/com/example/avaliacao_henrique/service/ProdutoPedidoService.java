package com.example.avaliacao_henrique.service;

import com.example.avaliacao_henrique.model.entity.ProdutoPedido;
import com.example.avaliacao_henrique.repository.ProdutoPedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoPedidoService {
    @Autowired
    private ProdutoPedidoRepository produtoPedidoRepository;

    public List<ProdutoPedido> findAll() {
        return produtoPedidoRepository.findAll();
    }

    public <S extends ProdutoPedido> S save(S entity) {
        return produtoPedidoRepository.save(entity);
    }

    public Optional<ProdutoPedido> findById(Long aLong) {
        return produtoPedidoRepository.findById(aLong);
    }

    public boolean existsById(Long aLong) {
        return produtoPedidoRepository.existsById(aLong);
    }

    public void deleteById(Long aLong) {
        produtoPedidoRepository.deleteById(aLong);
    }
}
