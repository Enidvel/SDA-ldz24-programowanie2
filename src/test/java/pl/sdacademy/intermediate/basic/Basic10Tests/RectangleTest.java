package pl.sdacademy.intermediate.basic.Basic10Tests;

import org.junit.*;

public class RectangleTest {

    Rectangle rectangle; // to jest właśnie niezainicjalizowane pole

    @BeforeClass
    public static void startOfTests() {
        System.out.println("Starting RectangleTest");
    }

    @AfterClass
    public static void EndOfTests() {
        System.out.println("Ending RectangleTest");
    }

    @Before
    public void setRectangleTo3And4() {
        rectangle = new Rectangle(3, 4);
    }

    @After
    public void testAfter() {
        System.out.println("After single test case");
    }

    @Test
    public void testCalculateArea() {
        Assert.assertEquals(12, rectangle.calculateArea());
    }

    @Test
    public void testCalculatePerimeter() {
        Assert.assertEquals(14, rectangle.calculatePerimeter());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testThrowExceptionInIncorrectValuesInConstructor() {
        new Rectangle(0, -1);
    }

    @Test
    public void testIfGetterReturnsRightValueOfWidth() {
        Assert.assertEquals(3, rectangle.getWidth());
    }

    @Test
    public void testIfGetterReturnsRightValueOfHeight() {
        Assert.assertEquals(4, rectangle.getHeight());
    }

    @Test
    public void testIfWidthIsNotSetWhenValueIsLowerThan0() { // najpierw wywołuję metode by spr czy przy przekazaniu
        // ujemnego argumentu width nie zmieni się na inną wartość z wcześniej przekazanej do obiektu wartości 3.
        rectangle.updateWidth(-1);
        Assert.assertEquals(3, rectangle.getWidth());
    }

    @Test
    public void testIfHeightIsNotSetWhenValueIsLowerThan0() {
        rectangle.updateHeight(-1);
        Assert.assertEquals(4, rectangle.getHeight());
    }


//    @Test
//    public void testGetDoesntReturnOne() {
//      Rectangle rectangle = new Rectangle();
//        Assert.assertNotEquals(2, rectangle.getOne());
//    }
}
