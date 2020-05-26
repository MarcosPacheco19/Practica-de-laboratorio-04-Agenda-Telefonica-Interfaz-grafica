/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.interfazGrafica;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;

/**
 *
 * @author xpacheco
 */
public class VentanaP extends Frame{
    
        //Paneles
    private Panel panelPrincipal;
    private Panel panelVacio;
    private Panel panelBotones;
    
    //Botones
    private Button bRegistrarse;
    private Button bIniciarSesion;
    private Button bUsuariosRegistrados;
    private Button bTelefonosRegistrados;
    private Button bSalir;

    public VentanaP() {

        this.setTitle("Ventana Principal");
        this.setSize(800, 600);
        this.setLocationRelativeTo(this);
        this.setVisible(true);

        panelPrincipal = new Panel(new GridLayout(0, 3));
        panelVacio = new Panel();
        panelBotones = new Panel(new GridLayout(5, 1, 0, 15));

        bRegistrarse = new Button("Registrarse");
        bIniciarSesion = new Button("Iniciar secion");
        bUsuariosRegistrados = new Button("Usuarios Registrados");
        bTelefonosRegistrados = new Button("Telefonos Registrados");
        bSalir = new Button("Salir");

        panelBotones.add(bRegistrarse);
        panelBotones.add(bIniciarSesion);
        panelBotones.add(bUsuariosRegistrados);
        panelBotones.add(bTelefonosRegistrados);
        panelBotones.add(bSalir);

        panelPrincipal.add(panelVacio);
        panelPrincipal.add(panelBotones);

        this.add(panelPrincipal);

    }

}
