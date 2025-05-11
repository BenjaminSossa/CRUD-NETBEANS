/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.crudb.repository;

import com.example.crudb.model.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Benjamín
 */
public interface EstudianteRepost  extends JpaRepository <Estudiante, Long>{
    
}
