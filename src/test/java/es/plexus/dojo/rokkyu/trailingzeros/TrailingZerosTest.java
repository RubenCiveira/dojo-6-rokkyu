package es.plexus.dojo.rokkyu.trailingzeros;

import org.junit.Assert;
import org.junit.Test;

public class TrailingZerosTest {
  @Test
  public void test1() {
    Assert.assertEquals(0, TrailingZeros.zeros(0));
    Assert.assertEquals(1, TrailingZeros.zeros(6));
    Assert.assertEquals(2, TrailingZeros.zeros(14));
    Assert.assertEquals(7, TrailingZeros.zeros(30));
  }
  
  @Test
  public void test2() {
    Assert.assertEquals(99628529, TrailingZeros.zeros(398514140));
    Assert.assertEquals(24960735, TrailingZeros.zeros(99842966));
    Assert.assertEquals(42582431, TrailingZeros.zeros(170329747));
    Assert.assertEquals(153219434, TrailingZeros.zeros(612877767));
    Assert.assertEquals(31788041, TrailingZeros.zeros(127152186));
    Assert.assertEquals(5520710, TrailingZeros.zeros(22082860));
    Assert.assertEquals(47598046, TrailingZeros.zeros(190392205));
    Assert.assertEquals(2517018, TrailingZeros.zeros(10068096));
  }
  
  @Test
  public void test3() {
    Assert.assertEquals(223809071, TrailingZeros.zeros(895236305));
    Assert.assertEquals(33462323, TrailingZeros.zeros(133849323));
    Assert.assertEquals(182105596, TrailingZeros.zeros(728422415));
    Assert.assertEquals(231483933, TrailingZeros.zeros(925935762));
    Assert.assertEquals(146210173, TrailingZeros.zeros(584840720));
    Assert.assertEquals(139787102, TrailingZeros.zeros(559148425));
    Assert.assertEquals(238174749, TrailingZeros.zeros(952699029));
    Assert.assertEquals(92430622, TrailingZeros.zeros(369722506));
  }
  
  @Test
  public void test4() {
    Assert.assertEquals(117057745, TrailingZeros.zeros(468231013));
    Assert.assertEquals(48156114, TrailingZeros.zeros(192624489));
    Assert.assertEquals(105648110, TrailingZeros.zeros(422592473));
    Assert.assertEquals(55256122, TrailingZeros.zeros(221024513));
    Assert.assertEquals(199165419, TrailingZeros.zeros(796661703));
    Assert.assertEquals(147540267, TrailingZeros.zeros(590161090));
    Assert.assertEquals(207849766, TrailingZeros.zeros(831399094));
    Assert.assertEquals(24928086, TrailingZeros.zeros(99712368));
    Assert.assertEquals(139054997, TrailingZeros.zeros(556220014));
    Assert.assertEquals(196440709, TrailingZeros.zeros(785762862));
    Assert.assertEquals(162100414, TrailingZeros.zeros(648401687));
  }
  
  @Test
  public void test5() {
    Assert.assertEquals(133245859, TrailingZeros.zeros(532983465));
    Assert.assertEquals(86097231, TrailingZeros.zeros(344388945));
    Assert.assertEquals(42801116, TrailingZeros.zeros(171204487));
    Assert.assertEquals(246090064, TrailingZeros.zeros(984360280));
    Assert.assertEquals(28024679, TrailingZeros.zeros(112098749));
    Assert.assertEquals(75883797, TrailingZeros.zeros(303535204));
    Assert.assertEquals(110613790, TrailingZeros.zeros(442455184));
    Assert.assertEquals(82444278, TrailingZeros.zeros(329777138));
    Assert.assertEquals(217281531, TrailingZeros.zeros(869126159));
    Assert.assertEquals(21119571, TrailingZeros.zeros(84478301));
    Assert.assertEquals(77209978, TrailingZeros.zeros(308839937));
    Assert.assertEquals(188618660, TrailingZeros.zeros(754474664));
    Assert.assertEquals(88860172, TrailingZeros.zeros(355440712));
    Assert.assertEquals(127354360, TrailingZeros.zeros(509417469));
  }
  
  @Test
  public void test6() {
    Assert.assertEquals(21391995, TrailingZeros.zeros(85568000));
    Assert.assertEquals(243075387, TrailingZeros.zeros(972301577));
    Assert.assertEquals(38075364, TrailingZeros.zeros(152301480));
    Assert.assertEquals(199833335, TrailingZeros.zeros(799333366));
    Assert.assertEquals(69205162, TrailingZeros.zeros(276820672));
    Assert.assertEquals(179420499, TrailingZeros.zeros(717682021));
    Assert.assertEquals(249938584, TrailingZeros.zeros(999754366));
    Assert.assertEquals(43044183, TrailingZeros.zeros(172176758));
    Assert.assertEquals(127426507, TrailingZeros.zeros(509706052));
    Assert.assertEquals(146351444, TrailingZeros.zeros(585405805));
    Assert.assertEquals(227333862, TrailingZeros.zeros(909335475));
    Assert.assertEquals(10455052, TrailingZeros.zeros(41820226));
    Assert.assertEquals(113583764, TrailingZeros.zeros(454335078));
    Assert.assertEquals(94339930, TrailingZeros.zeros(377359744));
    Assert.assertEquals(158420078, TrailingZeros.zeros(633680342));
    Assert.assertEquals(47412929, TrailingZeros.zeros(189651746));
    Assert.assertEquals(184909373, TrailingZeros.zeros(739637514));
    Assert.assertEquals(199785163, TrailingZeros.zeros(799140671));
    Assert.assertEquals(177461441, TrailingZeros.zeros(709845788));
    Assert.assertEquals(20289476, TrailingZeros.zeros(81157925));
    Assert.assertEquals(193501625, TrailingZeros.zeros(774006523));
    Assert.assertEquals(165076882, TrailingZeros.zeros(660307551));
    Assert.assertEquals(216254626, TrailingZeros.zeros(865018531));
  }
  
  @Test
  public void test7() {
    Assert.assertEquals(110640241, TrailingZeros.zeros(442560997));
    Assert.assertEquals(79998614, TrailingZeros.zeros(319994482));
    Assert.assertEquals(143084386, TrailingZeros.zeros(572337565));
    Assert.assertEquals(147002261, TrailingZeros.zeros(588009068));
    Assert.assertEquals(71341447, TrailingZeros.zeros(285365807));
    Assert.assertEquals(122832147, TrailingZeros.zeros(491328609));
    Assert.assertEquals(154196142, TrailingZeros.zeros(616784599));
    Assert.assertEquals(217028301, TrailingZeros.zeros(868113232));
    Assert.assertEquals(74267602, TrailingZeros.zeros(297070429));
    Assert.assertEquals(83630634, TrailingZeros.zeros(334522559));
    Assert.assertEquals(20387517, TrailingZeros.zeros(81550093));
    Assert.assertEquals(52164968, TrailingZeros.zeros(208659899));
    Assert.assertEquals(174689658, TrailingZeros.zeros(698758661));
    Assert.assertEquals(44720840, TrailingZeros.zeros(178883386));
    Assert.assertEquals(195690280, TrailingZeros.zeros(782761145));
    Assert.assertEquals(126141529, TrailingZeros.zeros(504566136));
    Assert.assertEquals(225007572, TrailingZeros.zeros(900030315));
    Assert.assertEquals(53898566, TrailingZeros.zeros(215594286));
    Assert.assertEquals(217070572, TrailingZeros.zeros(868282318));
    Assert.assertEquals(178962270, TrailingZeros.zeros(715849110));
    Assert.assertEquals(34975401, TrailingZeros.zeros(139901628));
    Assert.assertEquals(55387215, TrailingZeros.zeros(221548883));
    Assert.assertEquals(34613659, TrailingZeros.zeros(138454656));
    Assert.assertEquals(135704085, TrailingZeros.zeros(542816360));
  }
  
  @Test
  public void test8() {
    Assert.assertEquals(162550897, TrailingZeros.zeros(650203619));
    Assert.assertEquals(147266472, TrailingZeros.zeros(589065901));
    Assert.assertEquals(71341796, TrailingZeros.zeros(285367206));
    Assert.assertEquals(179000956, TrailingZeros.zeros(716003852));
    Assert.assertEquals(159013373, TrailingZeros.zeros(636053511));
    Assert.assertEquals(152145522, TrailingZeros.zeros(608582118));
    Assert.assertEquals(211710501, TrailingZeros.zeros(846842032));
    Assert.assertEquals(32616293, TrailingZeros.zeros(130465203));
    Assert.assertEquals(137413876, TrailingZeros.zeros(549655526));
    Assert.assertEquals(198560642, TrailingZeros.zeros(794242590));
    Assert.assertEquals(109713845, TrailingZeros.zeros(438855411));
    Assert.assertEquals(62444179, TrailingZeros.zeros(249776744));
  }
}
