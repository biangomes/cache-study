package org.example.cache.controller;

import org.example.cache.entity.Empresa;
import org.example.cache.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@EnableCaching
@RestController
@RequestMapping("/empresa")
public class EmpresaController {

    @Autowired
    private EmpresaService service;

    @GetMapping()
    public ResponseEntity<List<Empresa>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }
}
