package org.kevinraupp.visao;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Calculadora extends JFrame {
    public Calculadora(){

        organizarLayout();

        setSize(346,372);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }

    private void organizarLayout() {
        setLayout(new BorderLayout());

        Display display = new Display();
        display.setPreferredSize(new Dimension(233,60));
        add(display,BorderLayout.NORTH);
        Teclado teclado = new Teclado();
        add(teclado, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        new Calculadora();

    }
}
