package grouping;

import org.testng.annotations.Test;

public class Groups {  // this is second task

    @Test(groups = "first")
    public void one() {
        System.out.println("Test one");
    }

    @Test(groups = "second")
    public void two() {
        System.out.println("Test two");
    }

    @Test(groups = "first")
    public void three() {
        System.out.println("Test three");
    }

    @Test(groups = "second")
    public void four() {
        System.out.println("Test four");
    }

    @Test(groups = "first")
    public void five() {
        System.out.println("Test five");
    }

    @Test(groups = "second")
    public void six() {
        System.out.println("Test six");
    }

    @Test(groups = "first")
    public void seven() {
        System.out.println("Test seven");
    }

    @Test(groups = "second")
    public void eight() {
        System.out.println("Test eight");
    }
}