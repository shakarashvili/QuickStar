package priority;

import org.testng.annotations.Test;

public class Priority1 {  //this is first task
    @Test(priority = 7)
    public void testA(){
        System.out.println("Test A");
    }
    @Test(priority = 6)
    public void testB(){
        System.out.println("Test B");
    }
    @Test(priority = 5)
    public void testC(){
        System.out.println("Test C");
    }
    @Test(priority = 4)
    public void testD(){
        System.out.println("Test D");
    }
    @Test(priority = 3)
    public void testE(){
        System.out.println("Test E");
    }
    @Test(priority = 2)
    public void testF(){
        System.out.println("Test F");
    }
    @Test(priority = 1)
    public void testG(){
        System.out.println("Test G");
    }
}






















