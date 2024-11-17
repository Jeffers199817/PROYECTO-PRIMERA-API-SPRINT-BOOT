/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.milenyumsoft.primeraAPI.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author JEFFERSON
 */

@RestController
@RequestMapping("/apisaludos")
public class SaludoController {
    
    
    @GetMapping("/hola")
    public String holaMundo(){ 
        return " Hola mundo ds";
    }
    
    
    @GetMapping("/holanombre/{nombre}/{edad}/{direccion}")
    public String holMundoNombre(@PathVariable String nombre, @PathVariable int edad, @PathVariable String direccion){
        return " Hola mundo!" + nombre + " Tu edad es: " + edad + "Dirección: " + direccion;
    }
    
     @GetMapping("/holanombre/{nombre}/{edad}/{direccion}")
    public String holMundoN(@PathVariable String nombre, @PathVariable int edad, @PathVariable String direccion){
        return " Hola mundo!" + nombre + " Tu edad es: " + edad + "Dirección: " + direccion;
    }
}
