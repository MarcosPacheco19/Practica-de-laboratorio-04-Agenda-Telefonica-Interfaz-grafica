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
public class VentanaIniciarSesion extends Frame {
    
     //Paneles
    private Panel panelPrincipal;
    private Panel panelInicioSecion;
    private Panel panelBotones;
    
    //Botones
    private Button botonIngresar;
    private Button botonVolver;
    
    //Texto
    private Label correoElectronico;
    private Label contraseña;

    public VentanaIniciarSesion() {
        
        this.setTitle("Iniciar Secion");
        this.setSize(600, 400);
        this.setLocationRelativeTo(this);
        this.setVisible(true);
        
        panelPrincipal = new Panel(new BorderLayout());
        panelInicioSecion = new Panel(new GridLayout(4, 2, 0, 75));
        panelBotones = new Panel();
        
        botonIngresar = new Button("Ingresar");
        botonVolver = new Button("Volver");
        
        correoElectronico = new Label("Correo electronico:", Label.CENTER);
        contraseña = new Label("Contraseña:", Label.CENTER);
        
        panelBotones.add(botonIngresar);
        panelBotones.add(botonVolver);
        
        panelInicioSecion.add(new Panel());
        panelInicioSecion.add(new Panel());
        panelInicioSecion.add(correoElectronico);
        panelInicioSecion.add(new TextField());
        panelInicioSecion.add(contraseña);
        panelInicioSecion.add(new TextField());
        panelInicioSecion.add(new Panel());
        panelInicioSecion.add(new Panel());
        
        panelPrincipal.add(panelInicioSecion, BorderLayout.CENTER);
        panelPrincipal.add(panelBotones, BorderLayout.SOUTH);
        panelPrincipal.add(new Panel(), BorderLayout.EAST);
        panelPrincipal.add(new Panel(), BorderLayout.WEST);
        
        this.add(panelPrincipal);
    }
    
}
