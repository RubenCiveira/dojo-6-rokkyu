package es.plexus.dojo.rokkyu.tortoiseracing;

import org.junit.Assert;
import org.junit.Test;

public class TortoiseRacingTest {
  @Test
  public void test1() {
    Assert.assertArrayEquals(new int[] {0, 32, 18}, TortoiseRacing.race(720, 850, 70));
  }

  @Test
  public void test2() {
    Assert.assertArrayEquals(new int[] {3, 21, 49}, TortoiseRacing.race(80, 91, 37));
  }

  @Test
  public void test3() {
    Assert.assertArrayEquals(new int[] {2, 0, 0}, TortoiseRacing.race(80, 100, 40));
  }

  @Test
  public void test4() {
    Assert.assertArrayEquals(new int[] {0, 32, 18}, TortoiseRacing.race(720, 850, 70));
  }

  @Test
  public void test5() {
    Assert.assertArrayEquals(new int[] {3, 21, 49}, TortoiseRacing.race(80, 91, 37));
  }

  @Test
  public void test6() {
    Assert.assertArrayEquals(new int[] {2, 0, 0}, TortoiseRacing.race(80, 100, 40));
  }

  @Test
  public void test7() {
    Assert.assertArrayEquals(new int[] {0, 17, 4}, TortoiseRacing.race(720, 850, 37));
  }

  @Test
  public void test8() {
    Assert.assertArrayEquals(new int[] {2, 50, 46}, TortoiseRacing.race(720, 850, 370));
  }

  @Test
  public void test9() {
    Assert.assertArrayEquals(new int[] {0, 3, 2}, TortoiseRacing.race(120, 850, 37));
  }

  @Test
  public void test10() {
    Assert.assertArrayEquals(new int[] {18, 20, 0}, TortoiseRacing.race(820, 850, 550));
  }

  @Test
  public void test11() {
    Assert.assertNull(TortoiseRacing.race(820, 81, 550));
  }

  @Test
  public void test12() {
    Assert.assertArrayEquals(new int[] {0, 22, 17}, TortoiseRacing.race(160, 483, 120));
  }

  @Test
  public void test13() {
    Assert.assertArrayEquals(new int[] {1, 39, 46}, TortoiseRacing.race(148, 234, 143));
  }

  @Test
  public void test14() {
    Assert.assertArrayEquals(new int[] {0, 14, 44}, TortoiseRacing.race(380, 909, 130));
  }

  @Test
  public void test15() {
    Assert.assertArrayEquals(new int[] {0, 17, 10}, TortoiseRacing.race(337, 798, 132));
  }

  @Test
  public void test16() {
    Assert.assertArrayEquals(new int[] {0, 10, 15}, TortoiseRacing.race(372, 1278, 155));
  }

  @Test
  public void test17() {
    Assert.assertArrayEquals(new int[] {0, 10, 20}, TortoiseRacing.race(237, 585, 60));
  }

  @Test
  public void test18() {
    Assert.assertArrayEquals(new int[] {0, 21, 49}, TortoiseRacing.race(312, 609, 108));
  }

  @Test
  public void test19() {
    Assert.assertArrayEquals(new int[] {0, 7, 38}, TortoiseRacing.race(544, 1322, 99));
  }

  @Test
  public void test20() {
    Assert.assertArrayEquals(new int[] {0, 15, 56}, TortoiseRacing.race(588, 904, 84));
  }
}
