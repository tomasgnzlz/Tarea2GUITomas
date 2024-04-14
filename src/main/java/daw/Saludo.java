/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

/**
 *
 * @author tomas
 */
public class Saludo extends JPanel implements ActionListener {

    private JButton botonNombre;
    private JButton botonApellidos;
    private JTextArea texto;

    public Saludo() {
        initComponents();
    }

    private void initComponents() {

        this.setPreferredSize(new Dimension(600, 200));

        botonNombre = new JButton("Nombre");
        botonApellidos = new JButton("Apellidos");

        texto = new JTextArea(1, 25);
        texto.setBackground(Color.BLUE);

        this.setLayout(new FlowLayout());

        this.add(botonNombre);
        this.add(botonApellidos);
        this.add(texto);

        botonNombre.addActionListener(this);
        botonApellidos.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent a) {

        if (a.getSource() == botonNombre) {
            texto.setBackground(Color.ORANGE);
            texto.setText("Tomás");
        } else {
            texto.setBackground(Color.CYAN);
            texto.setText("González Atienza");
        }
    }

}
