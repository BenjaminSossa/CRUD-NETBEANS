package com.example.crudb.service;

import com.example.crudb.model.Estudiante;
import java.util.List;




public interface EstudianteService {
    List<Estudiante> listarTodas();
    Estudiante guardar(Estudiante estudiante);
    Estudiante obtenerPorId(Long id);
    void eliminar(Long id);
}
