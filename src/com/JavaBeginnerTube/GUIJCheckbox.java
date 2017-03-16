package com.JavaBeginnerTube;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.logging.Handler;

import javax.swing.*;

/**
 * Created by holyalchemist on 15/03/17.
 */
public class GUIJCheckbox extends JFrame {
    private JTextField tf;
    private JCheckBox boldbox;
    private JCheckBox italicbox;

    public GUIJCheckbox () {
        super("The title");
        setLayout(new FlowLayout());

        tf = new JTextField("This is a sentece", 20);
        tf.setFont(new Font("Serif", Font.PLAIN,14));
        add(tf);

        boldbox = new JCheckBox("bold");
        italicbox = new JCheckBox("italic");
        add(boldbox);
        add(italicbox);

        HandlerClass handler = new HandlerClass();
        boldbox.addItemListener(handler);
        italicbox.addItemListener(handler);

    }

    private class HandlerClass implements ItemListener {
        public void itemStateChanged(ItemEvent event) {
            Font font = null;

            if (boldbox.isSelected() && italicbox.isSelected()) {
                font = new Font("Serif",Font.BOLD + Font.ITALIC, 14);
            } else if (boldbox.isSelected()) {
                font = new Font("Serif",Font.BOLD,14);
            } else if (italicbox.isSelected()) {
                font = new Font("Serif", font.ITALIC, 14);
            } else {
                font = new Font("Serif",Font.PLAIN,14);
            }
            tf.setFont(font);
        }
    }
}
