import cpt1.buildPattern.CalzonePizza;
import cpt1.buildPattern.NyPizza;
import cpt1.buildPattern.Pizza;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Build Pattern으로 nyPizza 객체 생성
        NyPizza nyPizza = new NyPizza.Builder(NyPizza.Size.SMALL)
                                .addTopping(Pizza.Topping.SAUSAGE).addTopping(Pizza.Topping.ONION).build();

        // calzonePizza 객체 생성
        CalzonePizza calzonePizza = new CalzonePizza.Builder()
                                .addTopping(Pizza.Topping.HAM).sauceInside().build();
    }
}