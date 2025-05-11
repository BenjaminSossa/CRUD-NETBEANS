package com.example.crudb.controler;

import com.example.crudb.model.Estudiante;
import com.example.crudb.service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/personas")
@CrossOrigin(origins = "*")
public class EstudianteControler {
    
    @Autowired
    private EstudianteService estudianteService;
    
    @GetMapping
    public List<Estudiante> listarTodos() {
        System.out.println("Controlador: Solicitud para listar todos los estudiantes");
        List<Estudiante> estudiantes = estudianteService.listarTodas();
        System.out.println("Controlador: Retornando " + estudiantes.size() + " estudiantes");
        return estudiantes;
    }
    
    @PostMapping("/nuevo")
    public Estudiante guardar(@RequestBody Estudiante estudiante) {
        System.out.println("Controlador: Recibido estudiante para guardar: " + estudiante);
        Estudiante guardado = estudianteService.guardar(estudiante);
        System.out.println("Controlador: Estudiante guardado: " + guardado);
        return guardado;
    }
}