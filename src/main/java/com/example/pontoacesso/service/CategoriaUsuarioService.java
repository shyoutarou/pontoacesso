package com.example.pontoacesso.service;

import com.example.pontoacesso.model.CategoriaUsuario;
import com.example.pontoacesso.repository.CategoriaUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaUsuarioService {

    @Autowired
    CategoriaUsuarioRepository categoriaUsuarioRepository;

    public CategoriaUsuario save(CategoriaUsuario categoriaUsuario) {
        return categoriaUsuarioRepository.save(categoriaUsuario);
    }

    public CategoriaUsuario update(CategoriaUsuario categoriaUsuario) {
        return categoriaUsuarioRepository.save(categoriaUsuario);
    }

    public List<CategoriaUsuario> findAll() {
        return categoriaUsuarioRepository.findAll();
    }

    public Optional<CategoriaUsuario> findById(long id) {
        return categoriaUsuarioRepository.findById(id);
    }

    public void delete(CategoriaUsuario categoriaUsuario) {
        categoriaUsuarioRepository.delete(categoriaUsuario);
    }

    public void deleteById(long id) {
        categoriaUsuarioRepository.deleteById(id);
    }
}
