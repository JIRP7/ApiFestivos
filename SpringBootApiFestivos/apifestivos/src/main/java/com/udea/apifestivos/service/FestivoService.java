package com.udea.apifestivos.service;

import com.udea.apifestivos.model.Festivo;
import com.udea.apifestivos.repository.FestivoRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class FestivoService {
    private final FestivoRepository festivoRepository;

    public FestivoService(FestivoRepository festivoRepository) {
        this.festivoRepository = festivoRepository;
    }

    public String validarFestivo(LocalDate fecha) {
        Festivo festivo = festivoRepository.findByDiaAndMes(fecha.getDayOfMonth(), fecha.getMonthValue());
        if (festivo != null) {
            return "Es festivo";
        } else {
            return "No es festivo";
        }
    }
}
