package com.udea.apifestivos.repository;

import com.udea.apifestivos.model.Festivo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FestivoRepository extends JpaRepository<Festivo, Long> {
    Festivo findByDiaAndMes(int dia, int mes);
}