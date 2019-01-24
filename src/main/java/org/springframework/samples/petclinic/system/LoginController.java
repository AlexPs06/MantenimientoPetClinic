/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.springframework.samples.petclinic.system;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author AlexPS
 */
@Controller
public class LoginController {
    //prueba 2
    @GetMapping("/Login")
    public String welcome() {
        return "Login";
    }
    
    @GetMapping("/iniciarSesion")
    public String iniciarSesion() {
        return "Login";
    }
}
