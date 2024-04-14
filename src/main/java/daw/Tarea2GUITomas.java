/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package daw;

import javax.swing.JFrame;

/**
 *
 * @author tomas
 */
public class Tarea2GUITomas {

    public static void main(String[] args) {
        /*
        a . Cambiar el texto que aparece en cada botón, para que en uno sea "Nombre" y el otro "Apellidos".
        b . Al pulsar sobre "Nombre", el área de texto debe cambiar su fondo a blanco y además debe aparecer tu nombre.
        c . Al pulsar sobre "Apellidos", el área de texto debe cambiar su fondo a verde y además deben aparecer tus apellidos.
         */

        JFrame frameAux = new JFrame("Tomas");
        
        Saludo saludo = new Saludo();
        frameAux.add(saludo);

        frameAux.pack();
        frameAux.setVisible(true);
        frameAux.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
