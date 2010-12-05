package ch.tarik.app.decorator;

/**
 * Created by IntelliJ IDEA.
 * User: Tarik
 * Date: 05.12.2010
 * Time: 13:13:17
 * To change this template use File | Settings | File Templates.
 */
public class Milk extends Ingredients {

    public Milk(Coffee innerCoffee) {
        super(innerCoffee);
    }

    @Override
    double ownCosts() {
        return 1.5;
    }
}
