from .dummy import dummy

class pepe(dummy):
    def __init__(self) -> None:
        super().__init__()
        self.crit_percent = 0.30
        self.acc = 0.4
        self.dmg = 40
        self.hp = 120
        self.agi = 0.10
        self.defc = 1
        self.name = "pepe"
        self.probs = [0.4, 0.2, 0.4]
        self.namedict = {1: "attack", 2: "defend", 3: "surround", 0: "no action"}
    
    def processTurn(self, turn_no) -> int:
        
        return self.getprob(pl=self.probs)
