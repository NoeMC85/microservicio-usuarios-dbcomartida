package com.tech.ms.app.usuarios.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tech.ms.app.commons.services.CommonServiceImpl;
import com.tech.ms.app.usuarios.models.repository.AlumnoRepository;
import com.tech.ms.commons.alumnos.models.entity.Alumno;

@Service
public class AlumnoServiceImpl extends CommonServiceImpl<Alumno, AlumnoRepository>  implements AlumnoService {

	@Override
	@Transactional(readOnly = true)
	public List<Alumno> findByNombreOrApellido(String parametro) {
		return repository.findByNombreOrApellido(parametro);
	}


}
