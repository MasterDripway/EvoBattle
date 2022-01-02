from .dummy import dummy


class tank(dummy):
    def __init__(self):
        super().__init__()
        self.crit_percent = 0.15
        self.hp = 500
        self.dmg = 21
        self.defc = 2
        self.agi = 0.10
        self.acc = 0.5
        self.name = "tank"
        self.probs = [0.3, 0.4, 0.3]
        self.namedict = {1: "attack", 2: "defend", 3: "surround", 0: "no action"}

    def processTurn(self, turn_no) -> int:
        if turn_no == 0:
            return 2

        if self.last_op == 1:
            return 3
        elif self.last_op == 2:
            return 1
        elif self.last_op == 3:
            return 2
        if self.hp <= 100:
            self.probs = [0.3, 0.5, 0.2]
            return self.getprob(pl=self.probs)
