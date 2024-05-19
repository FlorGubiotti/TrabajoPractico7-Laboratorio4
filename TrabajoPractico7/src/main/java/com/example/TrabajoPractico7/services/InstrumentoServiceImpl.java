package com.example.TrabajoPractico7.services;

import com.example.TrabajoPractico7.entities.Instrumento;
import com.example.TrabajoPractico7.repositories.BaseRepository;
import com.example.TrabajoPractico7.repositories.InstrumentoRepository;
import org.springframework.stereotype.Service;

@Service
public class InstrumentoServiceImpl extends BaseServiceImpl<Instrumento, Long> implements InstrumentoService {

    private InstrumentoRepository instrumentoRepository;

    public InstrumentoServiceImpl(InstrumentoRepository instrumentoRepository) {
        super((BaseRepository<Instrumento, Long>) instrumentoRepository);
        this.instrumentoRepository = instrumentoRepository;
    }
}
