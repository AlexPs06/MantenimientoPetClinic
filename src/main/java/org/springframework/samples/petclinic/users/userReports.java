/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.springframework.samples.petclinic.users;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

/**
 *
 * @author AlexPS
 */
@Entity
@Table(name = "usersreports")
public class userReports {
        @Id
	private Long id;
	
	@Column(name = "nombre")
	@NotEmpty
	private String nombre;
        
	@Column(name = "password")
	@NotEmpty
	private String password;
	
	@Column(name = "Fecha")
	@NotEmpty
	private Date Fecha;
	
	@Column(name = "exitoso")
	@NotEmpty
	private boolean exitoso;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public boolean isExitoso() {
        return exitoso;
    }

    public void setExitoso(boolean exitoso) {
        this.exitoso = exitoso;
    }
        
        
}
