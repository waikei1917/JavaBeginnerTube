package com.JavaBeginnerTube;

import com.sun.xml.internal.ws.assembler.jaxws.HandlerTubeFactory;
import sun.util.locale.provider.JRELocaleConstants;

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
public class GUIJRadioButton extends JFrame {

    private JTextField tf;
    private Font pf;
    private Font bf;
    private Font itf;
    private Font bif;
    private JRadioButton pb;
    private JRadioButton bb;
    private JRadioButton ib;
    private JRadioButton bib;
    private ButtonGroup group;

    public GUIJRadioButton() {
        super("the title");
        setLayout(new FlowLayout());

        tf = new JTextField("Fucking hot",25);
        add(tf);

        pb = new JRadioButton("plain",true);
        bb = new JRadioButton("bold",false);
        ib = new JRadioButton("italic",false);
        bib = new JRadioButton("bold and italic",false);
        add(pb);
        add(bb);
        add(ib);
        add(bib);

        group = new ButtonGroup();
        group.add(pb);
        group.add(bb);
        group.add(ib);
        group.add(bib);

        pf = new Font("Serif",Font.PLAIN,14);
        bf = new Font("Serif",Font.BOLD,14);
        itf = new Font("Serif",Font.ITALIC,14);
        bif = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
        tf.setFont(pf);

        pb.addItemListener(new HandlerClass(pf));
        bb.addItemListener(new HandlerClass(bf));
        ib.addItemListener(new HandlerClass(itf));
        bib.addItemListener(new HandlerClass(bif));
    }

    private class HandlerClass implements ItemListener {
        private Font font;

        public HandlerClass(Font f){
            font = f;
        }

        public void itemStateChanged(ItemEvent event) {
            tf.setFont(font);
        }
    }
}
