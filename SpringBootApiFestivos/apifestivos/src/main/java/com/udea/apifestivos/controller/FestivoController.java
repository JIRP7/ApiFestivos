package com.udea.apifestivos.controller;

import com.udea.apifestivos.service.FestivoService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping("/api/festivos")
public class FestivoController {
    private final FestivoService festivoService;

    public FestivoController(FestivoService festivoService) {
        this.festivoService = festivoService;
    }

    // Recibir fecha como parte de la URL
    @GetMapping("/validar/{year}/{month}/{day}")
    public String validarFecha(@PathVariable int year, @PathVariable int month, @PathVariable int day) {
        LocalDate fechaConsultada = LocalDate.of(year, month, day);
        return festivoService.validarFestivo(fechaConsultada);
    }
}
