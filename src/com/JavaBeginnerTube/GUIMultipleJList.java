package com.JavaBeginnerTube;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.logging.Handler;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
/**
 * Created by holyalchemist on 15/03/17.
 */
public class GUIMultipleJList extends JFrame {

    private JList leftlist;
    private JList rightlist;
    private JButton movebutton;

    private static String[] foods = {"bacon", "wings", "ham", "beef", "more"};

    public GUIMultipleJList() {
        super("title");
        setLayout(new FlowLayout());

        leftlist = new JList(foods);
        leftlist.setVisibleRowCount(3);
        leftlist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        add(new JScrollPane(leftlist));

        movebutton = new JButton("Move -->");
        movebutton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        rightlist.setListData(leftlist.getSelectedValuesList().toArray());
                    }
                }
        );
        add(movebutton);

        rightlist = new JList();
        rightlist.setVisibleRowCount(3);
        rightlist.setFixedCellWidth(100);
        rightlist.setFixedCellHeight(15);
        rightlist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        add(new JScrollPane(rightlist));
    }
}
