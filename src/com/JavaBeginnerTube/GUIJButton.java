package com.JavaBeginnerTube;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/**
 * Created by holyalchemist on 15/03/17.
 */
public class GUIJButton extends JFrame {
    private JButton reg;
    private JButton custom;

    public GUIJButton() {
        super("The title");
        setLayout(new FlowLayout());

        reg = new JButton("reg Button");
        add(reg);

        custom = new JButton("Custom");
        add(custom);

        HandlerClass handler = new HandlerClass();
        reg.addActionListener(handler);
        custom.addActionListener(handler);

    }

    private class HandlerClass implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            JOptionPane.showMessageDialog(null,String.format("%s",event.getActionCommand()));
        }
    }
}
