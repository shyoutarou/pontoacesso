package com.example.pontoacesso.controller;

import com.example.pontoacesso.model.BancoDeHoras;
import com.example.pontoacesso.service.BancoHorasService;
import com.example.pontoacesso.service.JornadaTrabalhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping(value = "/bancohoras")
public class BancoHorasController {
    @Autowired
    BancoHorasService bancoHorasService;

    @PostMapping
    public BancoDeHoras create(@RequestBody BancoDeHoras bancoHoras) {
        return bancoHorasService.save(bancoHoras);
    }

    @GetMapping
    public List<BancoDeHoras> getList() {
        return bancoHorasService.findAll();
    }

    @GetMapping("/{idJornada}")
    public ResponseEntity<BancoDeHoras> getById(@PathVariable("idBancoHoras") long idBancoHoras) throws Exception {
        return ResponseEntity.ok(bancoHorasService.findById(idBancoHoras).orElseThrow(() -> new NoSuchElementException("[ERROR] -> Banco de horas não encontrado!")));
    }

    @PutMapping
    public BancoDeHoras update(@RequestBody BancoDeHoras bancoHoras) {
        return bancoHorasService.update(bancoHoras);
    }

    @DeleteMapping("/{idJornada}")
    public ResponseEntity delete(@PathVariable("idBancoHoras") long idBancoHoras){
        bancoHorasService.deleteById(idBancoHoras);
        return ResponseEntity.ok("Apagado com sucesso!");
    }
}
