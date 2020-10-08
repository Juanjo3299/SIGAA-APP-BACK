package com.api.sigaa.app.model.dao;

import java.util.List;

import com.api.sigaa.app.model.entity.SigaaDetCalificaciones;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface ISigaaDetCalificacionesDao extends JpaRepository<SigaaDetCalificaciones, Integer> {

	@Query("select dc from SigaaDetCalificaciones dc where dc.sigaaCatAlumnoByMatricula.matricula = ?1 "
			+ "order by dc.sigaaCatAsignaturaByIdAsignatura.cuatrimestre,dc.sigaaCatTipocalificacionesByIdTipocalif.descripcion,dc.sigaaCatAsignaturaByIdAsignatura.nombre")
	public List<SigaaDetCalificaciones> findCalificaciones(Integer matricula);

}
