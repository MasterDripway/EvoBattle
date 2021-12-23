from rich import print

# assets imports
from dummy import dummy
from tank import tank


import random

class turn:
    def __init__(self, p1, p2) -> None:
        self.turn = 0
        self.p1 = p1
        self.p2 = p2
    
    
    def processTurn(self) -> None:
        q1 = self.p1.processTurn(self.turn)
        q2 = self.p2.processTurn(self.turn)
        """
        turn number codes:
        1 = attack
        2 = defend
        3 = surround
        
        0 = no action
        """
        match q1:
            case 1:
                match q2:
                    case 1:
                        # both attack, each one takes damage
                        self.p2.take_dmg(self.p1.dmg - self.p2.defc, self.p1.acc)
                        self.p1.take_dmg(self.p2.dmg - self.p1.defc, self.p2.acc)

                    case 2:
                        # p1 attacks, p2 defends
                        # If a player defends an attack, the attacker takes half attack damage
                        self.p1.take_dmg((self.p2.dmg - self.p1.defc) // 2, self.p2.acc)

                    case 3:
                        # p1 attacks, p2 surrounds
                        # if a player attacks and the other surrounds, the one surrounding takes damage
                        self.p2.take_dmg(self.p1.dmg - self.p2.defc, self.p1.acc)
            case 2:
                match q2:
                    case 1:
                        # p1 defends, p2 attacks
                        # if a player defends an attack, the attacker takes half attack damage
                        self.p2.take_dmg((self.p1.dmg - self.p2.defc) // 2, self.p1.acc)
                    
                    case 3:
                        # p1 defends, p2 surrounds
                        # if a player defends and the other surrounds, the one defending takes damage
                        self.p1.take_dmg(self.p2.dmg - self.p1.defc, self.p2.acc)
            case 3:
                match q2:
                    case 1:
                        # p1 surrounds, p2 attacks
                        # if a player surrounds an attack, the surrounding player takes damage
                        self.p1.take_dmg(self.p2.dmg - self.p1.defc, self.p2.acc)
                    
                    case 2:
                        # p1 surrounds, p2 defends
                        # if a player surrounds a defend, the defending takes damage
                        self.p2.take_dmg(self.p1.dmg - self.p2.defc, self.p1.acc)
                    
                    case 3:
                        # p1 surrounds, p2 surrounds
                        # if both surround, both take half damage
                        self.p1.take_dmg((self.p2.dmg - self.p1.defc) // 2, self.p2.acc)
                        self.p2.take_dmg((self.p1.dmg - self.p2.defc) // 2, self.p1.acc)
        self.turn += 1
        self.p1.last_op = q2
        self.p2.last_op = q1
        return q1, q2
    
    def info(self, actions) -> None:
        print(f"""\r[bold italic green1]Turn {self.turn}:[/bold italic green1]
        \n\r\t[italic turquoise2]{self.p1.name}[/italic turquoise2] [bold white]HP:[/bold white] [bold red1]{self.p1.hp}[/bold red1] [bold white]ACTION:[/bold white] [italic orange1]{self.p1.namedict[actions[0]]}[/italic orange1]
        \n\r\t[italic turquoise2]{self.p2.name} [/italic turquoise2] [bold white]HP:[/bold white] [bold red1]{self.p2.hp}[/bold red1] [bold white]ACTION:[/bold white] [italic orange1]{self.p2.namedict[actions[1]]}[/italic orange1]\n""")
            
                
    

class battle:
    def __init__(self, p1 , p2) -> None:
        if isinstance(p1, dummy) and isinstance(p2, dummy):
            self.p1 = p1
            self.p2 = p2
            self.turn = turn(self.p1, self.p2)
        else:
            raise TypeError("Invalid lobby")
        
    def validate_player(self):
        """
         TODO:
          get character attribute types and check if they are the same as in the player-created class.
          if not, raise an error.
          if they are, return True
          looking towards storing character properties
          in a json file.
          in the future, add modability and custom characters
          with custom rules for this validation to keep the match 
          fair for both players.
        
        """
        pass
        

    def start(self) -> None:
        while (self.p1.is_alive() and self.p2.is_alive()):
            actions = self.turn.processTurn()
            print('[bold cyan1]Press enter for next turn:[/bold cyan1]')
            input()
            self.turn.info(actions)

battle(dummy(), tank()).start()
