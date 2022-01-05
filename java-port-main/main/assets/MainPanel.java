package main.assets;

import java.awt.*;
import javax.swing.*;

public class MainPanel extends JPanel {
    scrollTextBar scroll;

    public MainPanel() {
        // JPanel
        BoxLayout box = new BoxLayout(this, BoxLayout.Y_AXIS); // orientation
        setLayout(box);
        this.scroll = new scrollTextBar(new JTextArea(10,10));
        // setBorder(new EmptyBorder(new Insets(100, 150, 100, 150)));
        setBackground(Color.gray);


        // gbc.gridy++;
        // add(Box.createRigidArea(new Dimension(0, 20))); // add space between buttons [x, y]
        add(scroll);

    }
}
