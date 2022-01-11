# EvoBattle



# Java

Subclass Dummy and change Match config on `Main.java`


Modify needed properties and Override `processTurn` - that's called once every turn simultaneously with the opponent
and the decision of one out of three actions (1 - attack, 2 - defend, 3 - surround and 0 that is used for debugging or No action)

```
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
```



The goal is to program your agent to defeat the opponent one using the logic that you can create from the information that a player has access to.

This information can be accesed via the `match` object passed to `processTurn`.
