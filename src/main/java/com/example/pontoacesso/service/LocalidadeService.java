package com.example.pontoacesso.service;

import com.example.pontoacesso.model.Localidade;
import com.example.pontoacesso.repository.LocalidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocalidadeService {

    @Autowired
    LocalidadeRepository localidadeRepository;

    public Localidade save(Localidade localidade) {
        return localidadeRepository.save(localidade);
    }

    public Localidade update(Localidade localidade) {
        return localidadeRepository.save(localidade);
    }

    public List<Localidade> findAll() {
        return localidadeRepository.findAll();
    }

    public Optional<Localidade> findById(long id) {
        return localidadeRepository.findById(id);
    }

    public void delete(Localidade localidade) {
        localidadeRepository.delete(localidade);
    }

    public void deleteById(long id) {
        localidadeRepository.deleteById(id);
    }
}
