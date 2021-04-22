
import org.junit.Assert;
import org.junit.Test;

public class testTriangle {

    @Test
    public void equalateralTriTest(){
        Triangle triangle = new Triangle(3,3,3);
        Assert.assertTrue(triangle.isEquilateral());
    }

    @Test
    public void equalateralTriTest1(){
        Triangle triangle = new Triangle(1,1,1);
        Assert.assertTrue(triangle.isEquilateral());
    }


    @Test
    public void equalateralZeroTriTest(){
        Triangle triangle = new Triangle(0,0,0);
        Assert.assertFalse("Zero cannot be a value",triangle.isEquilateral());
    }

    @Test
    public void IscolisTriTest(){
        Triangle triangle = new Triangle(3,4,3);
        Assert.assertTrue("", triangle.isIsosceles());
    }

    @Test
    public void IscolisTriTest2(){
        Triangle triangle = new Triangle(4,4,5);
        Assert.assertTrue("", triangle.isIsosceles());
    }

    @Test
    public void scaleneTriTest(){
        Triangle triangle = new Triangle(3,4,5);
        Assert.assertTrue("", triangle.isScalene());
    }

    @Test
    public void scaleneTriTest1(){
        Triangle triangle = new Triangle(5,4,3);
        Assert.assertTrue("", triangle.isScalene());
    }

    @Test
    public void isTriTest(){

    }

}
