package com.api.sigaa.app.model.dao;

import com.api.sigaa.app.model.entity.SigaaCatAlumno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ISigaaCatAlumnoDao extends JpaRepository<SigaaCatAlumno, Integer> {

    @Query("SELECT a FROM SigaaCatAlumno a join fetch a.usuarioByIdUsuario u join fetch u.catRolesByIdRoles join fetch a.sigaaHistoacademicoByIdHistorial ha join fetch a.sigaaCohorteGeneradoByIdCohorte cg join fetch cg.sigaaCatPeriodoByIdPeriodo join fetch cg.sigaaCatGeneracionByIdGeneracion join fetch cg.sigaaCatCarreraByIdCarrera join fetch a.sigaaCatComunidadByIdComunidad ca join fetch a.sigaaCatEstatusByIdEstatus e join fetch a.sigaaCatGrupoByIdGrupo g join fetch g.sigaaCatCarreraByIdCarrera c join fetch c.sigaaCatModalidadByIdModalidad join fetch g.sigaaCatTipogrupoByIdTipogrupo join fetch g.sigaaCatPeriodoByIdPeriodo gp join fetch gp.sigaaCatCicloByIdCiclo join fetch a.sigaaDetCalificacionesByMatricula dc " +
            "join fetch dc.sigaaCatAsignaturaByIdAsignatura dca join fetch dca.sigaaCatPlanestudioByIdPlanestudio join fetch dc.sigaaCatGrupoByIdGrupo dcg join fetch dcg.sigaaCatGeneracionByIdGeneracion join fetch dcg.sigaaCatCarreraByIdCarrera dcgc join fetch dcg.sigaaCatPeriodoByIdPeriodo dcgp join fetch dcgp.sigaaCatCicloByIdCiclo join fetch dc.sigaaCatTipocalificacionesByIdTipocalif where a.matricula = ?1")
    public SigaaCatAlumno findSigaaCatAlumnosByMatricula(int matricula);
}
