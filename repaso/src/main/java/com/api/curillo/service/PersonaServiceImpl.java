/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.curillo.service;

import com.api.curillo.model.Persona;
import com.api.curillo.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author Bryan
 */
@Service
public class PersonaServiceImpl extends GenericServiceImpl<Persona, Long> implements GenericService<Persona, Long> {

    @Autowired
    PersonaRepository repository;

    @Override
    public CrudRepository<Persona, Long> getDao() {
        return repository;
    }

}
