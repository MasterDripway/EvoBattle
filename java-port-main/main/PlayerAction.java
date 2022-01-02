package main;



public class PlayerAction {
    int ability;
    dummy player;
    dummy opponent;
    int opponentAbility;

    public PlayerAction(dummy player, dummy opponent, int playerAbility, int opponentAbility) {
        this.player = player;
        this.opponent = opponent;
        this.ability = playerAbility;
        this.opponentAbility = opponentAbility;
    }

    public void exec() {
        /* 
        Attack vs attack = both take damage

        Attack vs defend = attacker takes damage
        
        Attack vs surround = p2 takes damage

        defense vs attack = attacker takes damage

        defense vs defend = no damage

        defense vs surround = defender is damaged

        surround vs attack = p1 takes damage

        surround vs defend = p2 takes damage

        surround vs surround = both take half damage

        case = 0 is ommited
        */

        switch (ability) {
            case 1:
                switch (opponentAbility) {
                    case 1:
                        player.takeDamage(opponent.attack, opponent.luck, opponent.critIncrement);
                        opponent.takeDamage(player.attack, player.luck, player.critIncrement);
                        break;
                    case 2:
                        player.takeDamage(opponent.attack, opponent.luck, opponent.critIncrement);
                        break;
                    case 3:
                        opponent.takeDamage(player.attack, player.luck, player.critIncrement);
                        break;
                }
                break;
            case 2:
                switch (opponentAbility) {
                    case 1:
                        opponent.takeDamage(player.attack, player.luck, player.critIncrement);
                        break;
                    case 3:
                        player.takeDamage(opponent.attack, opponent.luck, opponent.critIncrement);
                        break;
                }
                break;
            case 3:
                switch (opponentAbility) {
                    case 1:
                        player.takeDamage(opponent.attack, opponent.luck, opponent.critIncrement);
                        break;
                    case 2:
                        opponent.takeDamage(player.attack, player.luck, player.critIncrement);
                        break;
                    case 3:
                        player.takeDamage((int) Math.floor(opponent.attack / 2), opponent.luck, opponent.critIncrement);
                        opponent.takeDamage((int) Math.floor(player.attack / 2), player.luck, player.critIncrement);
                        break;
                }
                break;
            
        }

}
}
