package ch.tarik.app.decorator;

/**
 * Created by IntelliJ IDEA.
 * User: Tarik
 * Date: 05.12.2010
 * Time: 13:04:34
 * To change this template use File | Settings | File Templates.
 */
public abstract class Ingredients implements Coffee{
    private Coffee innerCoffee;
    protected static double cost;

    public Ingredients(Coffee innerCoffee) {
        this.innerCoffee = innerCoffee;
    }

    public double cost() {
        return ownCosts() + innerCoffee.cost();
    }

    abstract double ownCosts();
}
