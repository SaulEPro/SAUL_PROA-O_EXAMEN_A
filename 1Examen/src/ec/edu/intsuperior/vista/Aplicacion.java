/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.vista;

import ec.edu.intsuperior.modelo.Cliente;

/**
 *
 * @author Usuario
 */
public class Aplicacion {
      public static void main(String[] args) {
         Cliente c1=new Cliente();
        c1.setTelefonodeContacto("09876543212"); 
       
      System.out.println("El telefono de contacto del cliente es: "+c1.getTelefonodeContacto());
  }
}
