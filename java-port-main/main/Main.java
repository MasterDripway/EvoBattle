package main;

class Main {
    public static void main(String args[]) {
        
        // boilerplate match to check if all is working

        dummy_sub d1 = new dummy_sub(100, 1, 10, 0.15f, 0.25f);
        dummy_sub d2 = new dummy_sub();
        match m = new match(d1, d2);
        m.start();

    }
}
