package es.plexus.dojo.rokkyu.hexclass;

import org.junit.Assert;
import org.junit.Test;

public class HexClassTest {
  @Test
  public void SampleTests() {
    HexClass FF = new HexClass(255);
    Assert.assertEquals("0xFF", FF.toString());
    Assert.assertEquals(256, FF.valueOf() + 1);
    Assert.assertEquals("0xFF", FF.toJSON());
    Assert.assertEquals(FF, new HexClass(255));
    Assert.assertEquals("0xFE", FF.minus(1).toString());
    Assert.assertEquals("0x0", FF.minus(FF).toString());
    Assert.assertEquals("0xF", new HexClass(10).plus(5).toString());
    Assert.assertEquals(32, HexClass.parse("0x20"));
    Assert.assertEquals(512, HexClass.parse("200"));
  }
}
