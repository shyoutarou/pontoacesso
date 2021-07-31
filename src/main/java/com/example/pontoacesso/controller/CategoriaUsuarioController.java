package com.example.pontoacesso.controller;

import com.example.pontoacesso.model.CategoriaUsuario;
import com.example.pontoacesso.service.CategoriaUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/categoria-usuario")
public class CategoriaUsuarioController {

    @Autowired
    CategoriaUsuarioService categoriaUsuarioService;

    @PostMapping
    public CategoriaUsuario create(@RequestBody CategoriaUsuario categoriaUsuario) {
        return categoriaUsuarioService.save(categoriaUsuario);
    }

    @GetMapping
    public List<CategoriaUsuario> getList() {
        return categoriaUsuarioService.findAll();
    }

    @GetMapping("/{idCategoria}")
    public ResponseEntity<CategoriaUsuario> getById(@PathVariable("idCategoria") long idCategoria) throws Exception {
        return ResponseEntity.ok(categoriaUsuarioService.findById(idCategoria).orElseThrow(() -> new NoSuchElementException("[ERROR] -> Categoria Usuario não encontrado!")));
    }

    @PutMapping
    public CategoriaUsuario update(@RequestBody CategoriaUsuario categoriaUsuario) {
        return categoriaUsuarioService.update(categoriaUsuario);
    }

    @DeleteMapping("/{idCategoria}")
    public ResponseEntity delete(@PathVariable("idCategoria") long idCategoria) {
        categoriaUsuarioService.deleteById(idCategoria);
        return ResponseEntity.ok("Apagado com sucesso!");
    }
}
