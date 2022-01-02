from assets.mechanics import turn, battle
from assets.tank import tank
from assets.dummy import dummy

import importlib


def main():
    p1 = input("Player 1, what is your name? ")
    ch1 = getattr(importlib.import_module("assets." + p1), p1)()
    p2 = input("Player 2, what is your name? ")
    ch2 = getattr(importlib.import_module("assets." + p2), p2)()

    battle(ch1, ch2).start()

if __name__ == "__main__":
    main()