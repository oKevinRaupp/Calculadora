package org.kevinraupp.visao;

import javax.swing.*;
import java.awt.*;

public class Botao extends JButton {

    public Botao(String texto,Color cor){
        setText(texto);
        setOpaque(true);
        setBackground(cor);
        setFont(new Font("currier",Font.PLAIN,30));
        setBorder(BorderFactory.createLineBorder(Color.BLACK));

    }
}
