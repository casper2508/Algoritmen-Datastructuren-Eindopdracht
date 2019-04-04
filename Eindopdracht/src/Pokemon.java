/*
    A class for keeping all stats of a Pokemon
*/
class Pokemon {

    //All the attributes of a Pokemon
    private int number;
    private String name;
    private String type1;
    private String type2;
    private int total;
    private int HP;
    private int attack;
    private int defense;
    private int spAttack;
    private int spDefense;
    private int speed;
    private int gen;
    private boolean legendary;

    public Pokemon(int number, String name, String type1, String type2, int total,
       int HP, int attack, int defense, int spAttack, int spDefense, int speed,
       int gen, boolean legendary)
    {
        this.number = number;
        this.name = name;
        this.type1 = type1;
        this.type2 = type2;
        this.total = total;
        this.HP = HP;
        this.attack = attack;
        this.defense = defense;
        this.spDefense = spDefense;
        this.spAttack = spAttack;
        this.speed = speed;
        this.gen = gen;
        this.legendary = legendary;
    }

    //Method for printing all the information about the Pokemon
    public void printInfo() {
        System.out.printf(
            "%-5s %-30s %-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s",
            number, name, type1, type2, total, HP,
            attack, defense, spAttack, spDefense,
            speed, gen, legendary
        );
        System.out.println();
    }

    //Getters for all fields

    public int getNumber() { return number; }

    public String getName() { return name; }

    public String getType1() { return type1; }

    public String getType2() { return type2; }

    public int getTotal() { return total; }

    public int getHP() { return HP; }

    public int getAttack() { return attack; }

    public int getDefense() { return defense; }

    public int getSpAttack() { return spAttack; }

    public int getSpDefense() { return spDefense; }

    public int getSpeed() { return speed; }

    public int getGen() { return gen; }

    public boolean isLegendary() { return legendary; }
}