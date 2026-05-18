package com.tech.ms.app.usuarios.services;

import java.util.List;

import com.tech.ms.app.commons.services.CommonService;
import com.tech.ms.commons.alumnos.models.entity.Alumno;

public interface AlumnoService extends CommonService<Alumno>{

	public List<Alumno> findByNombreOrApellido(String parametro);
	
	public Iterable<Alumno> findAllById(Iterable<Long> ids);
	
	public void eliminarCursoAlumnoPorId(Long id);
	

}
