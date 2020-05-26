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
public class VentanaAñadirTelefono extends Frame{
    
     //Paneles
    private Panel panelPrincipal;
    private Panel panelAñadirTelefono;
    private Panel panelBotones;

    //Botones
    private Button bGuardar;
    private Button bVolver;

    //Textos
    private Label codigo;
    private Label tipo;
    private Label numero;
    private Label operadora;

    public VentanaAñadirTelefono() {
        
        this.setTitle("Añadir Telefono");
        this.setSize(600, 400);
        this.setLocationRelativeTo(this);
        this.setVisible(true);
        
        panelPrincipal = new Panel(new BorderLayout());
        panelAñadirTelefono = new Panel(new GridLayout(5, 2, 10, 25));
        panelBotones = new Panel();

        bGuardar = new Button("Guardar");
        bVolver = new Button("Volver");

        codigo = new Label("Codigo:", Label.CENTER);
        tipo = new Label("Tipo:", Label.CENTER);
        numero = new Label("Numero:", Label.CENTER);
        operadora = new Label("Operadora:", Label.CENTER);
        
        
        panelAñadirTelefono.add(codigo);
        panelAñadirTelefono.add(new TextField());
        panelAñadirTelefono.add(tipo);
        panelAñadirTelefono.add(new TextField());
        panelAñadirTelefono.add(numero);
        panelAñadirTelefono.add(new TextField());
        panelAñadirTelefono.add(operadora);
        panelAñadirTelefono.add(new TextField());
        panelBotones.add(bGuardar);
        panelBotones.add(bVolver);
        
        panelPrincipal.add(panelAñadirTelefono, BorderLayout.CENTER);
        panelPrincipal.add(panelBotones, BorderLayout.SOUTH);
        panelPrincipal.add(new Panel(), BorderLayout.EAST);
        panelPrincipal.add(new Panel(), BorderLayout.WEST);

        this.add(panelPrincipal);
    }
}
