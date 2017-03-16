package com.JavaBeginnerTube;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Created by holyalchemist on 16/03/17.
 */
public class GUILayout extends JFrame {
    private JButton lb;
    private JButton cb;
    private JButton rb;
    private FlowLayout layout;
    private Container container;

    public GUILayout() {
        super("title");
        layout = new FlowLayout();
        container = getContentPane();
        setLayout(layout);


        lb = new JButton("left");
        add(lb);
        lb.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        layout.setAlignment(FlowLayout.LEFT);
                        layout.layoutContainer(container);
                    }
                }
        );

        cb = new JButton("centre");
        add(cb);
        cb.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        layout.setAlignment(FlowLayout.CENTER);
                        layout.layoutContainer(container);
                    }
                }
        );

        rb = new JButton("right");
        add(rb);
        rb.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        layout.setAlignment(FlowLayout.RIGHT);
                        layout.layoutContainer(container);
                    }
                }
        );
    }
}
