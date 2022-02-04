package es.plexus.dojo.rokkyu.vasyaclerk;

import org.junit.Assert;
import org.junit.Test;

public class VasyaClerkTest {
  @Test
  public void test1() {
    Assert.assertEquals("YES", VasyaClerk.Tickets(new int[] {25, 25, 50}));
  }
  @Test
  public void test2() {
    Assert.assertEquals("NO", VasyaClerk.Tickets(new int[] {25, 100}));
  }
  @Test
  public void test3() {
    Assert.assertEquals("NO", VasyaClerk.Tickets(new int[] {25, 50, 100, 25, 25, 25, 50}));
  }
  @Test
  public void test4() {
    Assert.assertEquals("NO", VasyaClerk.Tickets(new int[] {25, 25, 50, 50, 100}));
  }
  @Test
  public void test5() {
    Assert.assertEquals("NO", VasyaClerk.Tickets(new int[] {25, 25, 25, 25, 25, 100, 100}));
  }
  @Test
  public void test6() {
    Assert.assertEquals("NO", VasyaClerk.Tickets(new int[] {25, 50, 25, 50, 100, 25, 25, 50}));
  }
  @Test
  public void test7() {
    Assert.assertEquals("NO", VasyaClerk.Tickets(new int[] {25, 25, 25, 25, 25, 25, 25, 50, 50, 50, 100, 100, 100, 100}));
  }
  @Test
  public void test8() {
    Assert.assertEquals("NO", VasyaClerk.Tickets(new int[] {25, 25, 100}));
  }
  @Test
  public void test9() {
    Assert.assertEquals("YES", VasyaClerk.Tickets(new int[] {25, 25, 50}));
  }  
}
