package main.assets;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class MainPanel extends JPanel {
    public MainPanel() {
        ClassicButton b = new ClassicButton("popup text", Component.CENTER_ALIGNMENT);

        JLabel label = new JLabel("Hello World");
        label.setVisible(false);
        label.setAlignmentX(Component.CENTER_ALIGNMENT);

        b.addActionListener(l -> {
            label.setVisible(true);
        });

        // JPanel
        BoxLayout box = new BoxLayout(this, BoxLayout.Y_AXIS); // orientation
        setLayout(box);
        // setBorder(new EmptyBorder(new Insets(100, 150, 100, 150)));
        setBackground(Color.gray);

        add(b);
        // gbc.gridy++;
        add(Box.createRigidArea(new Dimension(0, 20))); // add space between buttons [x, y]
        add(label);

    }
}
