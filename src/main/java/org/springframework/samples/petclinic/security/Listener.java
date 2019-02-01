/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.springframework.samples.petclinic.security;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.security.authentication.event.AuthenticationFailureBadCredentialsEvent;
import org.springframework.security.authentication.event.AuthenticationSuccessEvent;
import org.springframework.stereotype.Component;
import static org.springframework.web.servlet.mvc.method.annotation.SseEmitter.event;

/**
 *
 * @author AlexPS
 */
@Component
public class Listener implements ApplicationListener{

    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        if (event instanceof AuthenticationFailureBadCredentialsEvent ) {
            AuthenticationFailureBadCredentialsEvent ev = (AuthenticationFailureBadCredentialsEvent) event;
            Object name = ev.getAuthentication().getPrincipal();
            
            System.out.println("inicio fallido"+name.toString());
            
        }
        else if (event instanceof AuthenticationSuccessEvent){
            AuthenticationSuccessEvent ev = (AuthenticationSuccessEvent) event;
            Object name = ev.getAuthentication().getPrincipal();
            System.out.println("inicio exitoso "+name.toString());
        }
    
    }
}
