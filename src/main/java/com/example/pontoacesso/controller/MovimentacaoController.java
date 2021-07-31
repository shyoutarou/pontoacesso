package com.example.pontoacesso.controller;

import com.example.pontoacesso.model.Localidade;
import com.example.pontoacesso.model.Movimentacao;
import com.example.pontoacesso.service.MovimentacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;

@RestController
@RequestMapping("/movimentacao")
public class MovimentacaoController {

    @Autowired
    MovimentacaoService movimentacaoService;

    @PostMapping
    public Movimentacao create(@RequestBody Movimentacao movimentacao) {
        //UUID uuid = UUID.randomUUID();
        //movimentacao.getId().setIdMovimento(uuid.getMostSignificantBits());
        return movimentacaoService.save(movimentacao);
    }

    @GetMapping
    public List<Movimentacao> getList() {
        return movimentacaoService.findAll();
    }

    @GetMapping("/{idMovimentacao}")
    public ResponseEntity<Movimentacao> getById(@PathVariable("idMovimentacao") long idMovimentacao) throws Exception {
        return ResponseEntity.ok(movimentacaoService.findById(idMovimentacao).orElseThrow(() -> new NoSuchElementException("[ERROR] -> Movimentação não encontrada!")));
    }

    @PutMapping
    public Movimentacao update(@RequestBody Movimentacao movimentacao) {
        return movimentacaoService.update(movimentacao);
    }

    @DeleteMapping("/{idMovimentacao}")
    public ResponseEntity delete(@PathVariable("idMovimentacao") long idMovimentacao) {
        movimentacaoService.deleteById(idMovimentacao);
        return ResponseEntity.ok("Apagado com sucesso!");
    }
}
