package main;



class dummy_sub extends dummy {



    
    public dummy_sub() {
        super();
    }
    
    public dummy_sub(int health, int defence, int attack, float agility, float luck) {
        super(health, defence, attack, agility, luck);
        setName("DUMMY");
    }



    @Override
    public int processTurn(match mat) {
        return getRandom(1, 3);
    }

    @Override
    protected void addMapping() { // overwrite with custom ability mapping

        abilityMap.add("No Action"); // 0
        abilityMap.add("Attack"); // 1
        abilityMap.add("Defend"); // 2
        abilityMap.add("Surround"); // 3
    }

    

    
}
