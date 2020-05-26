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
public class VentanaRegistro extends Frame{
    
    
    //Paneles
    private Panel panelPrincipal;
    private Panel panelRegistro;
    private Panel panelBotones;

    //Botones
    private Button bCrearCuenta;
    private Button bVolver;

    //Textos
    private Label cedula;
    private Label nombre;
    private Label apellido;
    private Label correoElectronico;
    private Label contraseña;

    public VentanaRegistro() {
        
        this.setTitle("Registro");
        this.setSize(600, 400);
        this.setLocationRelativeTo(this);
        this.setVisible(true);
        
        panelPrincipal = new Panel(new BorderLayout());
        panelRegistro = new Panel(new GridLayout(5, 2, 10, 25));
        panelBotones = new Panel();

        bCrearCuenta = new Button("Crear Cuenta");
        bVolver = new Button("Volver");

        cedula = new Label("Cedula:", Label.CENTER);
        nombre = new Label("Nombre:", Label.CENTER);
        apellido = new Label("Apellido:", Label.CENTER);
        correoElectronico = new Label("Correo Electronico:", Label.CENTER);
        contraseña = new Label("Contraseña:", Label.CENTER);
        
        panelRegistro.add(cedula);
        panelRegistro.add(nombre);
        panelRegistro.add(new TextField());
        panelRegistro.add(nombre);
        panelRegistro.add(new TextField());
        panelRegistro.add(apellido);
        panelRegistro.add(new TextField());
        panelRegistro.add(correoElectronico);
        panelRegistro.add(new TextField());
        panelRegistro.add(contraseña);
        panelRegistro.add(new TextField());
        panelBotones.add(bCrearCuenta);
        panelBotones.add(bVolver);
        
        panelPrincipal.add(panelRegistro, BorderLayout.CENTER);
        panelPrincipal.add(panelBotones, BorderLayout.SOUTH);
        panelPrincipal.add(new Panel(), BorderLayout.EAST);
        panelPrincipal.add(new Panel(), BorderLayout.WEST);

        this.add(panelPrincipal);
    }
}
    