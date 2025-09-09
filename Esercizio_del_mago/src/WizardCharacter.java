public abstract class WizardCharacter {
    protected String name;
    protected int health = 100;
    protected int mana = 50;

    // ho dovuto mettere i valori nella dichiariazione degli attributi perche quando
    // richiamavo questo costruttore nella figlia Mago dovevo per forza richiarli,
    // percio li ho tolti dal costruttore direttamente.
    WizardCharacter(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getMana() {
        return mana;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public abstract void attack();

    public abstract void defense();

}
