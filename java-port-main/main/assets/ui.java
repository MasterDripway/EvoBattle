package main.assets;

import javax.swing.*;
import java.awt.*;
import java.awt.BorderLayout;

public class ui extends JFrame {
    public contextManager ctx;
    

    public ui() {
        MainPanel mp = new MainPanel();
        setLayout(new BorderLayout());
        this.ctx = new contextManager(mp.scroll);

        //mp.setBounds(0, 0, 400, 400);
        add(mp, BorderLayout.CENTER);
        setTitle("Match");
        getContentPane().setBackground(Color.red);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setSize(800, 800);
        setVisible(true);
        
    }


}

