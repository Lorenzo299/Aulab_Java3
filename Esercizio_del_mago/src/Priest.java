public class Priest extends WizardCharacter implements Spell {

    public Priest(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println(name + " attacco papale");
    }

    @Override
    public void defense() {
        System.out.println(name + " difesa papale");

    }

    @Override
    public void care() {
        System.out.println(name + " cura papale");

    }

    @Override
    public void electricity() {
        System.out.println(name + " scossa papale");

    }

    @Override
    public void fire() {
        System.out.println(name + " attacco di fuoco papale");

    }

}
