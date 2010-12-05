package ch.tarik.app.decorator;

/**
 * Created by IntelliJ IDEA.
 * User: Tarik
 * Date: 05.12.2010
 * Time: 13:08:03
 * To change this template use File | Settings | File Templates.
 */
public class Sugar extends Ingredients {

    public Sugar(Coffee innerCoffee) {
        super(innerCoffee);
    }

    double ownCosts() {
        return 1.0;
    }
}
