package com.example.pontoacesso.controller;

import com.example.pontoacesso.model.JornadaTrabalho;
import com.example.pontoacesso.service.JornadaTrabalhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping(value = "/jornada")
public class JornadaTrabalhoController {
    @Autowired
    JornadaTrabalhoService jornadaTrabalhoService;

    @PostMapping
    public JornadaTrabalho create(@RequestBody JornadaTrabalho jornadaTrabalho) {
        return jornadaTrabalhoService.save(jornadaTrabalho);
    }

    @GetMapping
    public List<JornadaTrabalho> getList() {
        return jornadaTrabalhoService.findAll();
    }

    @GetMapping("/{idJornada}")
    public ResponseEntity<JornadaTrabalho> getById(@PathVariable("idJornada") long idJornada) throws Exception {
        return ResponseEntity.ok(jornadaTrabalhoService.findById(idJornada).orElseThrow(() -> new NoSuchElementException("[ERROR] -> Jornada não encontrada!")));
    }

    @PutMapping
    public JornadaTrabalho update(@RequestBody JornadaTrabalho jornadaTrabalho) {
        return jornadaTrabalhoService.update(jornadaTrabalho);
    }

    @DeleteMapping("/{idJornada}")
    public ResponseEntity delete(@PathVariable("idJornada") long idJornada){
        jornadaTrabalhoService.deleteById(idJornada);
        return ResponseEntity.ok("Apagado com sucesso!");
    }
}
