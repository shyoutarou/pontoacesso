package com.example.pontoacesso.service;

import com.example.pontoacesso.model.NivelDeAcesso;
import com.example.pontoacesso.repository.NivelAcessoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NivelAcessoService  {

    @Autowired
    NivelAcessoRepository nivelAcessoRepository;

    public NivelDeAcesso save(NivelDeAcesso nivelAcesso) {
        return nivelAcessoRepository.save(nivelAcesso);
    }

    public NivelDeAcesso update(NivelDeAcesso nivelAcesso) {
        return nivelAcessoRepository.save(nivelAcesso);
    }

    public List<NivelDeAcesso> findAll() {
        return nivelAcessoRepository.findAll();
    }

    public Optional<NivelDeAcesso> findById(long id) {
        return nivelAcessoRepository.findById(id);
    }

    public void delete(NivelDeAcesso nivelAcesso) {
        nivelAcessoRepository.delete(nivelAcesso);
    }

    public void deleteById(long id) {
        nivelAcessoRepository.deleteById(id);
    }
}
