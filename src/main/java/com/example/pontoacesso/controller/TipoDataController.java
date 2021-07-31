package com.example.pontoacesso.controller;

import com.example.pontoacesso.model.TipoData;
import com.example.pontoacesso.service.TipoDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/tipo-data")
public class TipoDataController {

    @Autowired
    TipoDataService tipoDataService;

    @PostMapping
    public TipoData create(@RequestBody TipoData tipoData) {
        return tipoDataService.save(tipoData);
    }

    @GetMapping
    public List<TipoData> getList() {
        return tipoDataService.findAll();
    }

    @GetMapping("/{idTipoData}")
    public ResponseEntity<TipoData> getById(@PathVariable("idTipoData") long idTipoData) throws Exception {
        return ResponseEntity.ok(tipoDataService.findById(idTipoData).orElseThrow(() -> new NoSuchElementException("[ERROR] -> Tipo Data não encontrado!")));
    }

    @PutMapping
    public TipoData update(@RequestBody TipoData tipoData) {
        return tipoDataService.update(tipoData);
    }

    @DeleteMapping("/{idTipoData}")
    public ResponseEntity delete(@PathVariable("idTipoData") long idTipoData) {
        tipoDataService.deleteById(idTipoData);
        return ResponseEntity.ok("Apagado com sucesso!");
    }
}
