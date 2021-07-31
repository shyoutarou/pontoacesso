package com.example.pontoacesso.controller;

import com.example.pontoacesso.model.Usuario;
import com.example.pontoacesso.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @PostMapping
    public Usuario create(@RequestBody Usuario usuario) {
        return usuarioService.save(usuario);
    }

    @GetMapping
    public List<Usuario> getList() {
        return usuarioService.findAll();
    }

    @GetMapping("/{idUsuario}")
    public ResponseEntity<Usuario> getById(@PathVariable("idUsuario") long idUsuario) throws Exception {
        return ResponseEntity.ok(usuarioService.findById(idUsuario).orElseThrow(() -> new NoSuchElementException("[ERROR] -> Usuário não encontrado!")));
    }

    @PutMapping
    public Usuario update(@RequestBody Usuario usuario) {
        return usuarioService.update(usuario);
    }

    @DeleteMapping("/{idUsuario}")
    public ResponseEntity delete(@PathVariable("idUsuario") long idUsuario) {
        usuarioService.deleteById(idUsuario);
        return ResponseEntity.ok("Apagado com sucesso!");
    }
}
