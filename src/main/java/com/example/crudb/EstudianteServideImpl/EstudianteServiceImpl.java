/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.crudb.EstudianteServideImpl;


import com.example.crudb.model.Estudiante;
import com.example.crudb.repository.EstudianteRepost;
import com.example.crudb.service.EstudianteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EstudianteServiceImpl implements EstudianteService {
    
    @Autowired
    private EstudianteRepost estudianteRepost; // Cambiado a minúscula inicial
    
    @Override
    @Transactional(readOnly = true)
    public List<Estudiante> listarTodas() {
        System.out.println("Servicio: Listando todos los estudiantes");
        List<Estudiante> estudiantes = estudianteRepost.findAll();
        System.out.println("Servicio: Se encontraron " + estudiantes.size() + " estudiantes");
        return estudiantes;
    }
    
    @Override
    @Transactional
    public Estudiante guardar(Estudiante estudiante) {
        System.out.println("Servicio: Guardando estudiante: " + estudiante);
        Estudiante guardado = estudianteRepost.save(estudiante);
        System.out.println("Servicio: Estudiante guardado con ID: " + guardado.getId());
        return guardado;
    }
    
    @Override
    @Transactional(readOnly = true)
    public Estudiante obtenerPorId(Long id) {
        System.out.println("Servicio: Buscando estudiante con ID: " + id);
        return estudianteRepost.findById(id).orElse(null);
    }
    
    @Override
    @Transactional
    public void eliminar(Long id) {
        System.out.println("Servicio: Eliminando estudiante con ID: " + id);
        estudianteRepost.deleteById(id);
    }
}