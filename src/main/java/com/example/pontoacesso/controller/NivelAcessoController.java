package com.example.pontoacesso.controller;

import com.example.pontoacesso.model.NivelDeAcesso;
import com.example.pontoacesso.service.NivelAcessoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/nivel-acesso")
public class NivelAcessoController {

    @Autowired
    NivelAcessoService nivelAcessoService;

    @PostMapping
    public NivelDeAcesso create(@RequestBody NivelDeAcesso nivelAcesso) {
        return nivelAcessoService.save(nivelAcesso);
    }

    @GetMapping
    public List<NivelDeAcesso> getList() {
        return nivelAcessoService.findAll();
    }

    @GetMapping("/{idNivelAcesso}")
    public ResponseEntity<NivelDeAcesso> getById(@PathVariable("idNivelAcesso") long idNivelAcesso) throws Exception {
        return ResponseEntity.ok(nivelAcessoService.findById(idNivelAcesso).orElseThrow(() -> new NoSuchElementException("[ERROR] -> Nível de acesso não encontrado!")));
    }

    @PutMapping
    public NivelDeAcesso update(@RequestBody NivelDeAcesso nivelAcesso) {
        return nivelAcessoService.update(nivelAcesso);
    }

    @DeleteMapping("/{idNivelAcesso}")
    public ResponseEntity delete(@PathVariable("idNivelAcesso") long idNivelAcesso) {
        nivelAcessoService.deleteById(idNivelAcesso);
        return ResponseEntity.ok("Apagado com sucesso!");
    }
}
