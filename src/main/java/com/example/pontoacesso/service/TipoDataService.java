package com.example.pontoacesso.service;

import com.example.pontoacesso.model.TipoData;
import com.example.pontoacesso.repository.TipoDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoDataService {

    @Autowired
    TipoDataRepository tipoDataRepository;

    public TipoData save(TipoData tipoData) {
        return tipoDataRepository.save(tipoData);
    }

    public TipoData update(TipoData tipoData) {
        return tipoDataRepository.save(tipoData);
    }

    public List<TipoData> findAll() {
        return tipoDataRepository.findAll();
    }

    public Optional<TipoData> findById(long id) {
        return tipoDataRepository.findById(id);
    }

    public void delete(TipoData tipoData) {
        tipoDataRepository.delete(tipoData);
    }

    public void deleteById(long id) {
        tipoDataRepository.deleteById(id);
    }
}
