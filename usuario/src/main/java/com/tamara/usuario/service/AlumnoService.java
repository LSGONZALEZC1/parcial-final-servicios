package com.tamara.usuario.service;

import com.tamara.SpringCommons.service.CommonService;
//import com.tamara.usuario.models.entity.Alumno;
import com.tamara.commonsEntity.Alumno;
import org.springframework.stereotype.Service;

public interface AlumnoService extends CommonService<Alumno> {


    public Alumno save(Alumno alumno);
    public void deleteById (Long id);

}
