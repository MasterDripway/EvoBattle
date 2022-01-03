package main.assets;

import java.awt.Dimension;
import java.awt.Insets;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class BoxPanel extends JPanel {
    public BoxPanel(int axis) {
        /* TODO: Create BoxLayout jpanel template */
        BoxLayout boxlayout = new BoxLayout(this, axis);
        setLayout(boxlayout);

    }

    public void addWithSpace(JComponent component) {
        add(component);
        add(Box.createRigidArea(new Dimension(0, 20)));
    }
    public void setBorder(int t, int l, int b, int r) {
        setBorder(new EmptyBorder(new Insets(t, l, b, r)));
    }


    
}
