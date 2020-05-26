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
public class VentanaEditarDatos extends Frame{
    
    
    //Paneles
    private Panel panelPrincipal;
    private Panel panelEditarDatos;
    private Panel panelBotones;
    
    //Botones
    private Button bGuardar;
    private Button bVolver;
    
    //Textos
    private Label Nombre;
    private Label Apellido;
    private Label Cedula;
    private Label Contraseña;

    public VentanaEditarDatos() {
        
        this.setTitle("Editar Datos");
        this.setSize(600, 400);
        this.setLocationRelativeTo(this);
        this.setVisible(true);
        
        panelPrincipal = new Panel(new BorderLayout());
        panelEditarDatos = new Panel(new GridLayout(5, 2, 15, 25));
        panelBotones = new Panel();
   
        
        bGuardar = new Button("Guardar");
        bVolver = new Button("Volver");
        
        Nombre = new Label("Codigo", Label.CENTER);
        Apellido = new Label("Numero", Label.CENTER);
        Cedula = new Label("Tipo", Label.CENTER);
        Contraseña = new Label("Operadora", Label.CENTER) ;       
        
        panelBotones.add(bGuardar);
        panelBotones.add(bVolver);
        
        
        panelEditarDatos.add(new Panel());
        panelEditarDatos.add(new Panel());
        panelEditarDatos.add(Nombre);
        panelEditarDatos.add(new TextField());
        panelEditarDatos.add(Apellido);
        panelEditarDatos.add(new TextField());
        panelEditarDatos.add(Cedula);
        panelEditarDatos.add(new TextField());
        panelEditarDatos.add(Contraseña);
        panelEditarDatos.add(new TextField());
        
        panelPrincipal.add(panelEditarDatos, BorderLayout.CENTER);
        panelPrincipal.add(panelBotones, BorderLayout.SOUTH);
        panelPrincipal.add(new Panel(), BorderLayout.EAST);
        panelPrincipal.add(new Panel(), BorderLayout.WEST);
        
        this.add(panelPrincipal);
        
        
    }
}
