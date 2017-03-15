package com.JavaBeginnerTube;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * Created by holyalchemist on 14/03/17.
 */
public class GUIJFrameTuna extends JFrame {
    private JLabel labelItem1;

    public GUIJFrameTuna () {
        super("The title");
        setLayout(new FlowLayout());

        labelItem1 = new JLabel("Suck up");
        labelItem1.setToolTipText("show up hover suck");
        add(labelItem1);
    }

}
