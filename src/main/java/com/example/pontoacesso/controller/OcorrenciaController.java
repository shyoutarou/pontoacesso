package com.example.pontoacesso.controller;

import com.example.pontoacesso.model.Ocorrencia;
import com.example.pontoacesso.service.OcorrenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/ocorrencia")
public class OcorrenciaController {

    @Autowired
    OcorrenciaService ocorrenciaService;

    @PostMapping
    public Ocorrencia create(@RequestBody Ocorrencia ocorrencia) {
        return ocorrenciaService.save(ocorrencia);
    }

    @GetMapping
    public List<Ocorrencia> getList() {
        return ocorrenciaService.findAll();
    }

    @GetMapping("/{idOcorrencia}")
    public ResponseEntity<Ocorrencia> getById(@PathVariable("idOcorrencia") long idOcorrencia) throws Exception {
        return ResponseEntity.ok(ocorrenciaService.findById(idOcorrencia).orElseThrow(() -> new NoSuchElementException("[ERROR] -> Ocorrência não encontrada")));
    }

    @PutMapping
    public Ocorrencia update(@RequestBody Ocorrencia ocorrencia) {
        return ocorrenciaService.update(ocorrencia);
    }

    @DeleteMapping("/{idOcorrencia}")
    public ResponseEntity delete(@PathVariable("idOcorrencia") long idOcorrencia) {
        ocorrenciaService.deleteById(idOcorrencia);
        return ResponseEntity.ok("Apagado com sucesso!");
    }
}
