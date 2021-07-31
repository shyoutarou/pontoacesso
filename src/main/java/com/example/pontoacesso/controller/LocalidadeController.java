package com.example.pontoacesso.controller;

import com.example.pontoacesso.model.Localidade;
import com.example.pontoacesso.service.LocalidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/localidade")
public class LocalidadeController {

    @Autowired
    LocalidadeService localidadeService;

    @PostMapping
    public Localidade create(@RequestBody Localidade localidade) {
        return localidadeService.save(localidade);
    }

    @PutMapping
    public Localidade update(@RequestBody Localidade localidade) {
        return localidadeService.update(localidade);
    }

    @GetMapping
    public List<Localidade> getList() {
        return localidadeService.findAll();
    }

    @GetMapping("/{idLocalidade}")
    public ResponseEntity<Localidade> getById(@PathVariable("idLocalidade") long idLocalidade) throws Exception {
        return ResponseEntity.ok(localidadeService.findById(idLocalidade).orElseThrow(() -> new NoSuchElementException("[ERROR] -> Localidade não encontrada!")));
    }

    @DeleteMapping("/{idLocalidade}")
    public ResponseEntity delete(@PathVariable("idLocalidade") long idLocalidade) {
        localidadeService.deleteById(idLocalidade);
        return ResponseEntity.ok("Apagado com sucesso");
    }
}
