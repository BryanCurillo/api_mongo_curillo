/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.api.curillo.repository;

import com.api.curillo.model.Persona;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Bryan
 */
public interface PersonaRepository extends MongoRepository<Persona, Long>{
    
}
