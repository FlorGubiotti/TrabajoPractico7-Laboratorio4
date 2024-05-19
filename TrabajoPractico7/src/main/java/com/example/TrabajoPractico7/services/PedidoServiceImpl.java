package com.example.TrabajoPractico7.services;

import com.example.TrabajoPractico7.entities.Pedido;
import com.example.TrabajoPractico7.repositories.BaseRepository;
import com.example.TrabajoPractico7.repositories.PedidoRepository;
import org.springframework.stereotype.Service;

@Service
public class PedidoServiceImpl extends BaseServiceImpl<Pedido, Long> implements PedidoService {

    private PedidoRepository pedidoRepository;

    public PedidoServiceImpl(PedidoRepository pedidoRepository) {
        super((BaseRepository<Pedido, Long>) pedidoRepository);
        this.pedidoRepository = pedidoRepository;
    }
}
