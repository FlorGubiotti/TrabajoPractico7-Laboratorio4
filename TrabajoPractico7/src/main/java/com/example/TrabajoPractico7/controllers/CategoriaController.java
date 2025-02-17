package com.example.TrabajoPractico7.controllers;

import com.example.TrabajoPractico7.entities.Categoria;
import com.example.TrabajoPractico7.services.CategoriaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/categoria")
public class CategoriaController extends BaseControllerImpl<Categoria, CategoriaServiceImpl>{
    private CategoriaServiceImpl service;
    public CategoriaController(CategoriaServiceImpl service) {
        super(service);
    }
}

