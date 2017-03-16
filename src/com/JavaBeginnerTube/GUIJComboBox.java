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
public class GUIJComboBox extends JFrame {
    private JComboBox box;
    private JLabel picture;

    private static String[] filename = {"b.png","p.png"};
    private Icon[] pics = {new ImageIcon(getClass().getResource(filename[0])),new ImageIcon(getClass().getResource(filename[1]))};

    public GUIJComboBox() {
        super("the title");
        setLayout(new FlowLayout());

        box = new JComboBox(filename);

        box.addItemListener(
                new ItemListener() {
                    @Override
                    public void itemStateChanged(ItemEvent itemEvent) {
                        if(itemEvent.getStateChange() == ItemEvent.SELECTED){
                            picture.setIcon(pics[box.getSelectedIndex()]);
                        }
                    }
                }
        );

        add(box);
        picture=new JLabel(pics[0]);
        add(picture);
    }

}
