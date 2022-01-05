package main.assets;



public class contextManager {
    scrollTextBar scroll;

    public contextManager(scrollTextBar scroll) {
        this.scroll = scroll;
    }

    public void addText(String text) {
        scroll.addText(text);
    }

    public void setText(String text) {
        scroll.setText(text);
    }
}
