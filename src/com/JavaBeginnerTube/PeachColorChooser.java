package com.JavaBeginnerTube;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Created by holyalchemist on 16/03/17.
 */
public class PeachColorChooser extends JFrame {

    private JButton b;
    private Color color = (Color.WHITE);
    private JPanel panel;

    public PeachColorChooser () {
        super("Title");
        panel = new JPanel();
        panel.setBackground(color);

        b = new JButton("Choose a color");
        b.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        color = JColorChooser.showDialog(null,"Pick your color", color);
                        if(color == null){
                            color = (Color.WHITE);
                        }
                        panel.setBackground(color);
                    }
                }
        );

        add(panel,BorderLayout.CENTER);
        add(b, BorderLayout.SOUTH);
        setSize(425,150);
        setVisible(true);
    }
}
