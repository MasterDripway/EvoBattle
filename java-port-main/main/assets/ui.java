package main.assets;

import java.awt.*;
import javax.swing.*;

public class ui extends JFrame {
    
    

    public ui() {
        MainPanel mp = new MainPanel();
        add(mp);
        setTitle("Match");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 800);

        pack();
        setVisible(true);
        
    }


}

