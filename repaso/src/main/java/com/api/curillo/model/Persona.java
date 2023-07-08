/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.curillo.model;

import java.util.List;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author Bryan
 */
@Document(collection = "Persona")
@Data
public class Persona {

    @Id
    private Long id;
    
    private String nombre;
    
    private String apellido;    
    
    private String direccion;
    
    private Contactos contactos;
    
    private List<Telefonia> listaTelefonia;

}
