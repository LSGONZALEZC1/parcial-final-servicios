package com.tamara.curso.service;

import com.tamara.curso.models.entity.Curso;
import com.tamara.SpringCommons.service.CommonService;

public interface CursoService extends CommonService<Curso> {

    public Curso save (Curso alumno);
    public void deleteById(Long id);
}
