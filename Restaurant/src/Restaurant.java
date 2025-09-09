import java.lang.reflect.Array;

public class Restaurant {

    public String name;
    public Dish[] dishes;
    public Drink[] drinks;

    public Restaurant(String name) {
        this.name = name;

        Dish carbonara = new Dish("Carbonara", 10);
        Dish amatriciana = new Dish("Amatriciana", 11);
        Dish gricia = new Dish("Gricia", 12);

        this.dishes = new Dish[] { carbonara, amatriciana, gricia };

        Drink ginTonic = new Drink("Gin Tonic", 12);
        Drink ginLemon = new Drink("Gin Lemon", 13);

        this.drinks = new Drink[] { ginLemon, ginTonic };
    }

    public void saluta() {
        System.out.println(" Benvenuti signori al " + name);
    }

    public void stampaCibi() {
        System.out.println("I nostri piatti disponibili:");
        for (Dish cibo : dishes) {
            System.out.println("- " + cibo.getName() + " costo " + cibo.getPrice());
        }
    }

    public void stampaDrink() {
        System.out.println("I nostri drink disponibili:");
        for (Drink drink : drinks) {
            System.out.println("- " + drink.getName() + " costo " + drink.getPrice());
        }
    }

}
