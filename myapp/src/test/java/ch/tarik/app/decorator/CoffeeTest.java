package ch.tarik.app.decorator;


import junit.framework.TestCase;
import org.jmock.Mockery;
import org.jmock.Expectations;
import org.jmock.integration.junit3.MockObjectTestCase;

/**
 * Created by IntelliJ IDEA.
 * User: Tarik
 * Date: 05.12.2010
 * Time: 13:15:11
 * To change this template use File | Settings | File Templates.
 */
public class CoffeeTest extends MockObjectTestCase {

    Mockery context = new Mockery();

    public void testNormalCoffee() {
        Coffee espSugMilk = new Milk(new Sugar(new Espresso()));
        assertEquals(7.0 , espSugMilk.cost(), 0.1);

        Coffee rist = new Ristretto();
        assertEquals(3.8, rist.cost(), 0.1);

        Coffee lunSug = new Sugar(new Lungo());
        assertEquals(4.2, lunSug.cost(), 0.1);
    }

    public void testMock() {
        Coffee coffeeMock = mock(Coffee.class);
        try {
            Coffee sugarAndMilk = new Sugar(new Milk(coffeeMock));
        } catch (Exception e) {fail(e.getMessage());};
    }

    
}
