package testng;

import org.testng.annotations.Test;

public class TestTestng {
  @Test(priority = 1)
  public void f2() {
	  System.out.println("f2");
  }
  @Test
  public void f() {
	  System.out.println("f");
  }
  @Test(priority = 100)
  public void f1() {
	  System.out.println("f1");
  }
}
