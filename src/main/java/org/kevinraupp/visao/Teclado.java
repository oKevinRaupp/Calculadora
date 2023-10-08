package org.kevinraupp.visao;

import org.kevinraupp.modelo.Memoria;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Teclado extends JPanel implements ActionListener {
    private final Color cinzaEscuro = new Color(68,68,68);
    private final Color cinzaClaro = new Color(99,99,99);
    private final Color laranja = new Color(242,163,60);
    public Teclado(){
        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints c = new GridBagConstraints();

        setLayout(layout);

        c.weightx = 1;
        c.weighty = 1;
        c.fill = GridBagConstraints.BOTH;

        c.gridwidth = 2;
        adicionarBotao("AC", cinzaEscuro, c, 0, 0);
        c.gridwidth = 1;
        adicionarBotao("±", cinzaEscuro, c, 2, 0);
        adicionarBotao("/", laranja, c, 3, 0);

        adicionarBotao("7", cinzaClaro, c, 0, 1);
        adicionarBotao("8", cinzaClaro, c, 1, 1);
        adicionarBotao("9", cinzaClaro, c, 2, 1);
        adicionarBotao("*", laranja, c, 3, 1);

        adicionarBotao("4", cinzaClaro, c, 0, 2);
        adicionarBotao("5", cinzaClaro, c, 1, 2);
        adicionarBotao("6", cinzaClaro, c, 2, 2);
        adicionarBotao("-", laranja, c, 3, 2);

        adicionarBotao("1", cinzaClaro, c, 0, 3);
        adicionarBotao("2", cinzaClaro, c, 1, 3);
        adicionarBotao("3", cinzaClaro, c, 2, 3);
        adicionarBotao("+", laranja, c, 3, 3);

        c.gridwidth = 2;
        adicionarBotao("0", laranja, c, 0, 4);
        c.gridwidth = 1;
        adicionarBotao(",", laranja, c, 2, 4);
        adicionarBotao("=", laranja, c, 3, 4);
    }

    private void adicionarBotao(String texto, Color cor, GridBagConstraints c, int x, int y) {
        c.gridx = x;
        c.gridy = y;
        Botao botao = new Botao(texto, cor);
        botao.addActionListener(this);
        add(botao, c);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() instanceof JButton){
            JButton botao = (JButton) e.getSource();
            Memoria.getInstancia().processaroComando(botao.getText());
        }
    }
}
