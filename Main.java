import cpt1.아이템2빌드패턴.CalzonePizza;
import cpt1.아이템2빌드패턴.NyPizza;
import cpt1.아이템2빌드패턴.Pizza;
import cpt1.아이템6불필요한객체.RomanNumeral;

public class   Main {
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