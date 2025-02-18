package org.example.cache.repository;

import org.example.cache.entity.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {

}
