package es.plexus.dojo.rokkyu.easydiagonal;

import java.math.BigInteger;
import org.junit.Assert;
import org.junit.Test;

public class EasyDiagonalTest {
  @Test
  public void test1() {
    Assert.assertEquals(BigInteger.valueOf(5985), EasyDiagonal.diagonal(20, 3));
  }

  @Test
  public void test2() {
    Assert.assertEquals(BigInteger.valueOf(20349), EasyDiagonal.diagonal(20, 4));
  }

  @Test
  public void test3() {
    Assert.assertEquals(BigInteger.valueOf(54264), EasyDiagonal.diagonal(20, 5));
  }
  
  @Test
  public void test4() {
    Assert.assertEquals(new BigInteger("6429758786797926366807779220"), EasyDiagonal.diagonal(129100, 5));
  }
  
  @Test
  public void test5() {
    Assert.assertEquals(BigInteger.valueOf(5985), EasyDiagonal.diagonal(20, 3));
  }
  
  @Test
  public void test6() {
    Assert.assertEquals(new BigInteger("6385476296235036"), EasyDiagonal.diagonal(1291, 5));
  }
  
  @Test
  public void test7() {
    Assert.assertEquals(new BigInteger("15478983586799578981605681450735426444083026237083755223526535252775423299626083333014485638841019200"), EasyDiagonal.diagonal(1291, 56));

  }
  @Test
  public void test8() {
    Assert.assertEquals(new BigInteger("15478983586799578981605681450735426444083026237083755223526535252775423299626083333014485638841019200"), EasyDiagonal.diagonal(1291, 1234));
  }
  @Test
  public void test9() {
    Assert.assertEquals(new BigInteger("6062786381707342397509329927309121965"), EasyDiagonal.diagonal(1360, 15));
  }

  
}
