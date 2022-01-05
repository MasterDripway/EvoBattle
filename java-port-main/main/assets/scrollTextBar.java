package main.assets;

import javax.swing.JScrollPane;
import java.awt.Font;
import javax.swing.JTextArea;

class scrollTextBar extends JScrollPane {
    private JTextArea textArea;

    public scrollTextBar(JTextArea textArea) {
        super(textArea);
        this.textArea = textArea;
        this.textArea.setFont(new Font("Arial", Font.PLAIN, 20));
        this.textArea.setEditable(false);
        setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
    }

    public void setText(String text) {
        textArea.setText(text);
    }

    public void addText(String text) {
        textArea.append(text + "\n");
    }
}