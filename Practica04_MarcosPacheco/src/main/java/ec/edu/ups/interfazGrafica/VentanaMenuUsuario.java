/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.interfazGrafica;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

/**
 *
 * @author xpacheco
 */
public class VentanaMenuUsuario extends Frame{
    
    //Paneles
    private Panel panelPrincipal;
    private Panel panelBotones;
    private Panel panelVacio;

    
    //Botones
    private Button bAnadirTelefono;
    private Button bBuscarTelefono;
    private Button bListarTelefonos;
    private Button bMostrarDatos;
    private Button bEditarDatos;
    private Button bEliminarUsuario;
    private Button bCerrarSesion;


    public VentanaMenuUsuario() {
        
        this.setTitle("Menu");
        this.setSize(800, 450);
        this.setLocationRelativeTo(this);
        this.setVisible(true);
        
        panelPrincipal = new Panel(new GridLayout(0, 7));
        panelVacio = new Panel();
        panelBotones = new Panel(new GridLayout(5, 1, 0,15));

        bAnadirTelefono = new Button("Añadir Telefono");
        bBuscarTelefono = new Button("Buscar Telefono");
        bListarTelefonos = new Button("Listar Telefonos");
        bMostrarDatos = new Button("Mostrar Datos");
        bEditarDatos = new Button("Editar Datos");
        bEliminarUsuario = new Button("Eliminar Cuenta");
        bCerrarSesion = new Button("Cerrar Sesion");
        

        panelBotones.add(bAnadirTelefono);
        panelBotones.add(bBuscarTelefono);
        panelBotones.add(bListarTelefonos);
        panelBotones.add(bMostrarDatos);
        panelBotones.add(bEliminarUsuario);
        panelBotones.add(bEliminarUsuario);
        panelBotones.add(bCerrarSesion);

        panelPrincipal.add(panelVacio);
        panelPrincipal.add(panelBotones);
    
        this.add(panelPrincipal);
    }
}