package com.example.pontoacesso.service;

import com.example.pontoacesso.model.BancoDeHoras;
import com.example.pontoacesso.repository.BancoHorasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BancoHorasService {
    @Autowired
    BancoHorasRepository bancoHorasRepository;

    public BancoDeHoras save(BancoDeHoras bancoHoras) {
        return bancoHorasRepository.save(bancoHoras);
    }

    public BancoDeHoras update(BancoDeHoras bancoHoras) {
        return bancoHorasRepository.save(bancoHoras);
    }

    public List<BancoDeHoras> findAll() {
        return bancoHorasRepository.findAll();
    }

    public Optional<BancoDeHoras> findById(long id) {
        return bancoHorasRepository.findById(id);
    }

    public void delete(BancoDeHoras bancoHoras) {
        bancoHorasRepository.delete(bancoHoras);
    }

    public void deleteById(long id) {
        bancoHorasRepository.deleteById(id);
    }
}
