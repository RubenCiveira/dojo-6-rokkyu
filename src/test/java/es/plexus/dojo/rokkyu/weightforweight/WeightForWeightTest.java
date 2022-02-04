package es.plexus.dojo.rokkyu.weightforweight;

import org.junit.Assert;
import org.junit.Test;

public class WeightForWeightTest {
  @Test
  public void test1() {
    Assert.assertEquals("2000 103 123 4444 99",
        WeightForWeight.orderWeight("103 123 4444 99 2000"));
  }
  @Test
  public void test2() {
      Assert.assertEquals("11 11 2000 10003 22 123 1234000 44444444 9999", WeightForWeight.orderWeight("2000 10003 1234000 44444444 9999 11 11 22 123"));
  }
  @Test
  public void test3() {
    Assert.assertEquals("10 101412 105090 102338 7443 927 2386 321814 53228 307551 176431 333572 426066 9744 143955 297073 189058 288526 175867 468197 269994",
        WeightForWeight.orderWeight("333572 143955 102338 468197 101412 105090 7443 9744 321814 307551 297073 176431 288526 426066 53228 927 175867 269994 2386 189058 10") );
  }
  @Test
  public void test4() {
    Assert.assertEquals("3 1061 17033 443111 108015 412423 321176 331760 127452 155055 342507 303655 175731 158047 245725 444256 382814 395243 429209 129738 477875",
        WeightForWeight.orderWeight("444256 443111 395243 127452 175731 321176 1061 477875 331760 382814 245725 303655 155055 342507 17033 429209 129738 412423 108015 158047 3") );
  }
  @Test
  public void test5() {
    Assert.assertEquals("32 542 2119 371120 432051 451232 109017 93251 301836 229119 276081 290913 126764 286055 337667 89249 390786 467287 166895 68985 279793",
        WeightForWeight.orderWeight("290913 68985 390786 109017 467287 276081 126764 542 2119 337667 371120 229119 451232 93251 166895 301836 279793 286055 89249 432051 32") );
  }
  @Test
  public void test6() {
    Assert.assertEquals("142220 42503 88 21437 242554 96062 173526 413466 144808 432367 280943 344186 375129 469404 337825 477722 177927 184669 399167 84798 487884",
        WeightForWeight.orderWeight("375129 42503 280943 469404 337825 173526 413466 242554 344186 399167 487884 184669 142220 177927 96062 477722 432367 144808 21437 84798 88") );
  }
  @Test
  public void test7() {
    Assert.assertEquals("50 6251 382400 470232 76140 211951 46325 65261 235416 137624 359810 340695 92971 414587 198363 175972 273776 394349 283785 419919 457891",
        WeightForWeight.orderWeight("175972 211951 419919 470232 359810 283785 273776 414587 137624 394349 6251 76140 235416 457891 382400 92971 46325 198363 340695 65261 50") );
  }
  @Test
  public void test8() {
    Assert.assertEquals("6 131022 200066 205162 352600 214552 3817 110198 136163 438231 207085 253516 400954 208383 63582 107558 194544 296055 434196 340975 296508",
        WeightForWeight.orderWeight("208383 107558 352600 110198 200066 340975 205162 438231 434196 63582 296508 400954 214552 194544 3817 136163 131022 253516 296055 207085 6") );
  }
  @Test
  public void test9() {
    Assert.assertEquals("32 211102 130052 320920 340307 11862 146610 402732 15283 51437 250924 148066 478330 105965 266660 293660 84915 188921 384781 389177 89855",
        WeightForWeight.orderWeight("15283 250924 389177 130052 293660 51437 84915 402732 384781 266660 211102 146610 89855 148066 11862 188921 340307 478330 320920 105965 32") );
  }
}
