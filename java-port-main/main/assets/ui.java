package main.assets;

import javax.swing.*;
import java.awt.*;
import java.awt.BorderLayout;

public class ui extends JFrame {
    

    public ui() {
        MainPanel mp = new MainPanel();
        setLayout(null);
        mp.setBounds(401,0,400,400);

        BoxPanel bp = new BoxPanel(BoxLayout.Y_AXIS);
        //bp.setBorder(50, 50, 50, 50);
        bp.add(new ClassicButton("Click me"));
        bp.setBounds(0, 0, 400, 400);
        add(bp);
        add(mp);
        setTitle("Match");
        getContentPane().setBackground(Color.red);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 800);
        //pack();
        setVisible(true);
        
    }


}

