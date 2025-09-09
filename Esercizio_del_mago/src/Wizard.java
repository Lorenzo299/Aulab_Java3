public class Wizard extends WizardCharacter implements Spell {

    Wizard(String name) {
        super(name);
    }

    @Override
    public void fire() {
        System.out.println(name + " palla di fuoco");
    }

    @Override
    public void care() {
        System.out.println(name + " cura");

    }

    @Override
    public void electricity() {
        System.out.println(name + " scossa");

    }

    @Override
    public void attack() {
        System.out.println(name + " attacco generico");

    }

    @Override
    public void defense() {
        System.out.println(name + " scudo");

    }

}
