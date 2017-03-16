package com.JavaBeginnerTube;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Created by holyalchemist on 15/03/17.
 */
public class GUIMouse extends JFrame {

    private JPanel mousepanel;
    private JLabel statusbar;

    public GUIMouse () {
        super("title");

        mousepanel = new JPanel();
        mousepanel.setBackground(Color.WHITE);
        add(mousepanel, BorderLayout.CENTER);

        statusbar = new JLabel("default");
        add(statusbar, BorderLayout.SOUTH);

        Handlerclass handler = new Handlerclass();
        mousepanel.addMouseListener(handler);
        mousepanel.addMouseMotionListener(handler);
    }

    private class Handlerclass implements MouseListener, MouseMotionListener {

        public void mouseClicked(MouseEvent event) {
            statusbar.setText(String.format("Clicked at %d, %d", event.getX(), event.getY()));
        }

        public void mousePressed(MouseEvent event) {
            statusbar.setText("Pressd down");
        }

        public void mouseReleased(MouseEvent event) {
            statusbar.setText("Released");
        }

        public void mouseEntered(MouseEvent event) {
            statusbar.setText("You entered the area");
            mousepanel.setBackground(Color.RED);
        }
        public void mouseExited(MouseEvent event) {
            statusbar.setText("Left the window");
            mousepanel.setBackground(Color.WHITE);
        }


        public void mouseDragged(MouseEvent event){
            statusbar.setText("Drag");
        }
        public void mouseMoved(MouseEvent event) {
            statusbar.setText("Move");
        }
    }
}
