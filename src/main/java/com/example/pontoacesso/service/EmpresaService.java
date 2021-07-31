package com.example.pontoacesso.service;

import com.example.pontoacesso.model.Empresa;
import com.example.pontoacesso.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpresaService {

    @Autowired
    EmpresaRepository empresaRepository;

    public Empresa save(Empresa empresa) {
        return empresaRepository.save(empresa);
    }

    public Empresa update(Empresa empresa) {
        return empresaRepository.save(empresa);
    }

    public List<Empresa> findAll() {
        return empresaRepository.findAll();
    }

    public Optional<Empresa> findById(long id) {
        return empresaRepository.findById(id);
    }

    public void delete(Empresa empresa) {
        empresaRepository.delete(empresa);
    }

    public void deleteById(long id) {
        empresaRepository.deleteById(id);
    }
}
