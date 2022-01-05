package main;

import main.assets.contextManager;

class match {
    dummy player1;
    dummy player2;
    int turn = 0;
    int player1_action = 0;
    int player2_action = 0;
    contextManager ctx;

    /*
     * TODO:
     * match 2 players and run a match between them
     * pass in to procesTurn the necesary information for the bot to make a decision
     * and have strategy involved in the making of such player.
     * 
     * processTurn should have this match object passed in and also make a lot of
     * turn information
     * available to both players like
     * - previous opponent action
     * - opponent health
     * - turn number
     * - opponent abilityMap
     * 
     */
    public match(dummy player1, dummy player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.turn = 0;
    }

    public match() {
        ;
    }

    public int start() {
        // returns 1 if player 1 wins, 2 if player 2 wins, 0 if a draw
        while (player1.isAlive() && player2.isAlive()) {
            player1_action = player1.processTurn(this); // passing in match object to player
            player2_action = player2.processTurn(this); // "
            PlayerAction pa = new PlayerAction(player1, player2, player1_action, player2_action);
            pa.exec();
            turn++;

            // debugging and CLI while graphics are a work in progress
            System.out.println("Turn " + turn + "\n");
            System.out.println(player1.toString() + " " + "ACTION: " + player1.getAbility(player1_action));
            System.out.println(player2.toString() + " " + "ACTION: " + player2.getAbility(player2_action) + "\n");
            /*
            FIXME:
            this is where the ui will be passed in information to be displayed.
            create a method of the future class that will container the scrollable text.
            
            */
            if (this != null) {
                this.ctx.addText("Turn " + turn + "\n");
                this.ctx.addText(player1.toString() + " " + "ACTION: " + player1.getAbility(player1_action) + "\n");
                this.ctx.addText(player2.toString() + " " + "ACTION: " + player2.getAbility(player2_action) + "\n");
            }  

        }

        // checking which player died
        if (!player1.isAlive()) {
            return 2;
        } else if (!player2.isAlive()) {
            return 1;
        } else {
            return 0;
        }



    }
    public void bindUIAgent(contextManager ctx) {
        this.ctx = ctx;
    }
}