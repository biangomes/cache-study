package org.example.cache.service;

import org.example.cache.entity.Empresa;
import org.example.cache.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpresaService {

    @Autowired
    private EmpresaRepository repository;

    @Cacheable("empresas")
    public List<Empresa> findAll() {
        return (List<Empresa>) repository.findAll();
    }
}
