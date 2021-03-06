import random
from typing import final
import numpy as np

class dummy:
    def __init__(self) -> None:
        self.crit_percent = 0.15
        self._hp = 100
        self.dmg = 34
        self.defc = 1
        self.agi = 0.15
        self.acc = 0.5
        self.name = "dummy"
        self._last_op = 0  # last opponent move

        self.namedict = {1: "attack", 2: "defend", 3: "surround", 0: "no action"}

    @property
    def last_op(self) -> int:
        return self._last_op

    @last_op.setter
    def last_op(self, move: int) -> None:
        self._last_op = move

    @property
    def hp(self):
        return self._hp

    @hp.setter
    def hp(self, value):
        if value < 0:
            self._hp = 0
        else:
            self._hp = value

    @final
    def is_alive(self) -> bool:
        return self.hp > 0

    @final
    def take_dmg(self, dmg, opAccuracy=0, critPercent=0.15) -> None:
        dodge_pct = self.agi - opAccuracy
        if dodge_pct < 0 and random.random() > dodge_pct:
            if random.random() < opAccuracy:  # crit
                dmg += round(dmg * critPercent)
            self.hp -= dmg

    def processTurn(self, turn_no) -> int:
        return random.randint(1, 3)
    
    def getprob(self, pl : list):
        #returns the index of the highest probability attack
        return np.random.choice(3, 1, p=self.probs)[0] + 1
    
    def __str__(self):
        #return all stats
        return f"{self.name}:\nHP: {self.hp}\nDMG: {self.dmg}\nDEF: {self.defc}\nAGI: {self.agi}\nACC: {self.acc}\n"
    
    def __repr__(self) -> str:
        # print all stats
        return f"{self.name}:\nHP: {self.hp}\nDMG: {self.dmg}\nDEF: {self.defc}\nAGI: {self.agi}\nACC: {self.acc}\n"




