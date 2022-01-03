package main.assets;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class MainPanel extends JPanel {
    public MainPanel() {
        //JPanel
        BoxLayout box = new BoxLayout(this, BoxLayout.Y_AXIS); // orientation
        setLayout(box);
        setBorder(new EmptyBorder(new Insets(200, 200, 200, 200)));

        setBackground(Color.gray);

        ClassicButton b = new ClassicButton("Click me");
        b.setInvisiblePanel(this);
        ClassicButton b2 = new ClassicButton("Click me");
        add(b);
        add(Box.createRigidArea(new Dimension(0, 20))); // add space between buttons [x, y]
        add(b2);                    


    }
}

