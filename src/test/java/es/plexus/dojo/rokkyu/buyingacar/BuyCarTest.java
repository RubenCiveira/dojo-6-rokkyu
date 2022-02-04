package es.plexus.dojo.rokkyu.buyingacar;

import org.junit.Assert;
import org.junit.Test;

public class BuyCarTest {
  @Test
  public void test1() {
      int[] r = new int[] { 6, 766 };
      Assert.assertArrayEquals(r, BuyCar.nbMonths(2000, 8000, 1000, 1.5));
  }
  @Test
  public void test2() {
      int[] r = new int[] { 0, 4000 };
      Assert.assertArrayEquals(r, BuyCar.nbMonths(12000, 8000, 1000, 1.5));
  }
  @Test
  public void test3() {
      int[] r = new int[] { 17, 702 };
      Assert.assertArrayEquals(r, BuyCar.nbMonths(9369, 39369, 1000, 1.4));
  }
  @Test
  public void test4() {
      int[] r = new int[] { 8, 597 };
      Assert.assertArrayEquals(r, BuyCar.nbMonths(8000, 12000, 500, 1.0));
  }
  @Test
  public void test5() {
      int[] r = new int[] { 8, 332 };
      Assert.assertArrayEquals(r, BuyCar.nbMonths(18000, 32000, 1500, 1.25));
  }
  @Test
  public void test6() {
      int[] r = new int[] { 25, 122 };
      Assert.assertArrayEquals(r, BuyCar.nbMonths(7500, 32000, 300, 1.55));
  }
}
