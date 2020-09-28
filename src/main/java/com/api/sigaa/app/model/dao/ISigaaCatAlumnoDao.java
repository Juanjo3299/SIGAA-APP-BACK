package com.api.sigaa.app.model.dao;

import com.api.sigaa.app.model.entity.SigaaCatAlumno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ISigaaCatAlumnoDao extends JpaRepository<SigaaCatAlumno, Integer> {

    @Query("SELECT a FROM SigaaCatAlumno a where a.matricula=?1")
    public SigaaCatAlumno findSigaaCatAlumnosByMatricula(int matricula);
}
