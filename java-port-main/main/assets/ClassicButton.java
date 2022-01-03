package main.assets;

import javax.swing.JButton;
import java.awt.event.*;
import javax.swing.JPanel;

public class ClassicButton extends JButton{

    public ClassicButton(String text) {
        super(text);
    } 
    public void setInvisiblePanel(JPanel p) {
        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                p.setVisible(false);
            }
        });
    }
}
