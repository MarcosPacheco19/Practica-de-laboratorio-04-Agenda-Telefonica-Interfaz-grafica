/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;
import ec.edu.ups.interfazGrafica.VentanaAñadirTelefono;
import ec.edu.ups.interfazGrafica.VentanaEditarDatos;
import ec.edu.ups.interfazGrafica.VentanaIniciarSesion;
import ec.edu.ups.interfazGrafica.VentanaP;
import ec.edu.ups.interfazGrafica.VentanaRegistro;
import ec.edu.ups.interfazGrafica.VentanaMenuUsuario;
/**
 *
 * @author xpacheco
 */
public class Principal {
    
    public static void main(String[] args) {
        
        VentanaP ventanaPrincipal = new VentanaP();
        VentanaRegistro ventaRegistro = new VentanaRegistro();
        VentanaIniciarSesion ventanIniciarSecion = new VentanaIniciarSesion();
        VentanaMenuUsuario ventanaMenuUsuario = new VentanaMenuUsuario();
        VentanaAñadirTelefono ventanaAñadirTelefono = new VentanaAñadirTelefono();
        VentanaEditarDatos ventanaEditarDatos = new VentanaEditarDatos();
        
    }
}
