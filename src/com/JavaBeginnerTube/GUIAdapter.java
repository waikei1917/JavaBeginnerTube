package com.JavaBeginnerTube;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * Created by holyalchemist on 16/03/17.
 */
public class GUIAdapter extends JFrame {
    private String details;
    private JLabel statusbar;

    public GUIAdapter() {
        super("title");

        statusbar = new JLabel("Default");
        add(statusbar, BorderLayout.SOUTH);
        addMouseListener(new Mouseclass());
    }

    private class Mouseclass extends MouseAdapter {
        public void mouseClicked(MouseEvent event) {
            details = String.format("You clicked %d", event.getClickCount());

            if(event.isMetaDown()) {
                details += "with right mouse button";
            } else if (event.isAltDown()) {
                details += "either center mouse button";
            } else {
                details += "with left mouse button";
            }

            statusbar.setText(details);
        }
    }
}
