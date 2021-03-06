package es.plexus.dojo.rokkyu.hexclass.sortableshapes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import org.junit.Assert;
import org.junit.Test;

public class SortableShapesTest {
  @Test
  public void ShapesAreSortableOnArea()
  {
      // Arrange
      double area, side, radius, base, height, width;
      List<Shape> expected = new ArrayList<Shape>();

      area = 1.1234;
      expected.add(new CustomShape(area));

      side = 1.1234;
      expected.add(new Square(side));

      radius = 1.1234;
      expected.add(new Circle(radius));

      height = 2.;
      base = 5.;
      expected.add(new Triangle(base, height));

      height = 3.;
      base = 4.;
      expected.add(new Triangle(base, height));

      width = 4.;
      expected.add(new Rectangle(width, height));

      area = 16.1;
      expected.add(new CustomShape(area));

      Random random = new Random();
      List<Shape> actual = createRandomOrderedList(random, expected);

      // Act
      Collections.sort(actual);

      // Assert
      Iterator<Shape> a = actual.iterator();
      for (Shape e : expected) {
          Assert.assertEquals(e, a.next());
      }
  }

  private List<Shape> createRandomOrderedList(Random random, List<Shape> expected){
      List<Shape> actual = new ArrayList<>();
      for (Shape shape : expected) {
          int j = random.nextInt(actual.size()+1);
          actual.add(j, shape);
      }
      return actual;
  }
}
