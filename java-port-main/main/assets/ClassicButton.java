package main.assets;

import javax.swing.JButton;
import java.awt.event.*;
import javax.swing.JPanel;
import java.awt.*;

public class ClassicButton extends JButton{
    public ClassicButton(String text, float align) {
        super(text);
        setAlignmentX(align);
    } 
    public ClassicButton(String text) {
        super(text);
        setAlignmentX(Component.CENTER_ALIGNMENT);
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
