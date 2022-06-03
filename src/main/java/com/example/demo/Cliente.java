package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="cliente")
public class Cliente {
	@Id
	@Column(name="DNI")
    private String dni;
	@Column(name="NombreCliente")
    private String nombreCliente;
	@Column(name="DireccionCliente" )
    private String direccionCliente;
	@Column(name="TelefonoCliente" )
    private String TelefonoCliente;
	@Column(name="EmailCliente" )
    private String EmailCliente;
    
    
	public String getEmailCliente() {
		return EmailCliente;
	}
	public void setEmailCliente(String emailCliente) {
		EmailCliente = emailCliente;
	}
	public String getTelefonoCliente() {
		return TelefonoCliente;
	}
	public void setTelefonoCliente(String telefonoCliente) {
		TelefonoCliente = telefonoCliente;
	}
	public String getDireccionCliente() {
		return direccionCliente;
	}
	public void setDireccionCliente(String direccionCliente) {
		this.direccionCliente = direccionCliente;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
    
    
}
