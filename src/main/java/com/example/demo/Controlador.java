package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controlador {
	
	  private String usuario = "alejandro";
	  private String contraseña = "jijija";
	  @GetMapping("/")
      public String iniciar_Sesion()
      {
    	  return "index";
      }
	  
	  @GetRequest()
	  public String registroCliente()
	  {
		  return "registroCliente";
	  }
}
