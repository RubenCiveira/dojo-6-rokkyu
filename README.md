# Rokkyu

Es un proyecto para iniciación en la programación con java. Hay una serie de ejercicios para desarrollar.

Para poder comprobar la validez de los ejercicios es necesario ir activando los correspondientes tests, y lanzar la ejecución de los tests de maven. Por defecto ningún test está activado, según se vayan completando las katas se deben ir activando y ampliando los tests.

## Reglas generales

Es necesario ejecutar al menos todos los test que se exponen en el proyecto. También es recomendable tener una cobertura de test del 100% del código.

Al ejecutar un **mvn clean test**, se generan varios informes:

- **target/site/pmd.html** muestra errores en la calidad del código.

- **target/site/cpd.html** muestra bloques de código duplicados.

- **target/site/jacoco/index.htm** muestra la cobertura del código por paquetes y clases.

## Katas

Las katas se describiran en ingles, ya que es el idioma más habitual en la documentación de código.

### Buying a car

Let us begin with an example:

A man has a rather old car being worth 2000€. He saw a secondhand car being worth 8000€. He wants to keep his old car until he can buy the secondhand one.

He thinks he can save 1000€ each month but the prices of his old car and of the new one decrease of 1.5 percent per month. Furthermore this percent of loss increases of `0.5` percent at the end of every two months. Our man finds it difficult to make all these calculations.

**Can you help him?**

How many months will it take him to save up enough money to buy the car he wants, and how much money will he have left over?

**Parameters and return of function:**

```
parameter: startPriceOld (Old car price)
parameter: startPriceNew (New car price)
parameter: savingperMonth
parameter: percentLossByMonthnbMonths
(2000, 8000, 1000, 1.5) should return [6, 766] or (6, 766)
```

#### Detail of the above example:

```
end month 1: percentLoss 1.5 available -4910.0
end month 2: percentLoss 2.0 available -3791.7999...
end month 3: percentLoss 2.0 available -2675.964
end month 4: percentLoss 2.5 available -1534.06489...
end month 5: percentLoss 2.5 available -395.71327...
end month 6: percentLoss 3.0 available 766.158120825...
return [6, 766] or (6, 766)
```

where `6` is the number of months at **the end of which** he can buy the new car and `766` is the nearest integer to `766.158...` (rounding `766.158` gives `766`).

**Note:**

Selling, buying and saving are normally done at end of month. Calculations are processed at the end of each considered month but if, by chance from the start, the value of the old car is bigger than the value of the new one or equal there is no saving to be made, no need to wait so he can at the beginning of the month buy the new car:

```
nbMonths(12000, 8000, 1000, 1.5) should return [0, 4000]nbMonths(8000, 8000, 1000, 1.5) should return [0, 0]
```

We don't take care of a deposit of savings in a bank:-)

### Vasya - Clerk

The new "Avengers" movie has just been released! There are a lot of people at the cinema box office standing in a huge line. Each of them has a single `100`, `50` or `25` dollar bill. An "Avengers" ticket costs `25 dollars`.

Vasya is currently working as a clerk. He wants to sell a ticket to every single person in this line.

Can Vasya sell a ticket to every person and give change if he initially has no money and sells the tickets strictly in the order people queue?

Return `YES`, if Vasya can sell a ticket to every person and give change with the bills he has at hand at that moment. Otherwise return `NO`.

#### Examples:

```java
Line.Tickets(new int[] {25, 25, 50}) // => YES 
Line.Tickets(new int[]{25, 100}) // => NO. Vasya will not have enough money to give change to 100 dollars
Line.Tickets(new int[] {25, 25, 50, 50, 100}) // => NO. Vasya will not have the right bills to give 75 dollars of change (you can't make two bills of 25 from one of 50)
```

### Weight for weight

My friend John and I are members of the "Fat to Fit Club (FFC)". John is worried because each month a list with the weights of members is published and each month he is the last on the list which means he is the heaviest.

I am the one who establishes the list so I told him: "Don't worry any more, I will modify the order of the list". It was decided to attribute a "weight" to numbers. The weight of a number will be from now on the sum of its digits.

For example `99` will have "weight" `18`, `100` will have "weight" `1` so in the list `100` will come before `99`. Given a string with the weights of FFC members in normal order can you give this string ordered by "weights" of these numbers?

#### Example:

`"56 65 74 100 99 68 86 180 90"` ordered by numbers weights becomes: `"100 180 90 56 65 74 68 86 99"`

When two numbers have the same "weight", let us class them as if they were strings (alphabetical ordering) and not numbers: `100` is before `180` because its "weight" (1) is less than the one of `180` (9) and `180` is before `90` since, having the same "weight" (9), it comes before as a *string*.

All numbers in the list are positive numbers and the list can be empty.

#### Notes

- it may happen that the input string have leading, trailing whitespaces and more than a unique whitespace between two consecutive numbers
- Don't modify the input

### Tortoise racing

Two tortoises named ***A*** and ***B*** must run a race. ***A*** starts with an average speed of `720 feet per hour`. Young ***B*** knows she runs faster than ***A***, and furthermore has not finished her cabbage.

When she starts, at last, she can see that ***A*** has a `70 feet lead` but ***B***'s speed is `850 feet per hour`. How long will it take ***B*** to catch ***A***?

More generally: given two speeds `v1` (***A***'s speed, integer > 0) and `v2` (***B***'s speed, integer > 0) and a lead `g` (integer > 0) how long will it take ***B*** to catch ***A***?

The result will be an array `[hour, min, sec]` which is the time needed in hours, minutes and seconds (round down to the nearest second) or a string in some languages.

If `v1 >= v2` then return `nil`, `nothing`, `null`, `None` or `{-1, -1, -1}` for C++, C, Go, Nim, `[]` for Kotlin or "-1 -1 -1".

#### Examples:

(form of the result depends on the language)

```
race(720, 850, 70) => [0, 32, 18] or "0 32 18"race(80, 91, 37)   => [3, 21, 49] or "3 21 49"
```

Hints for people who don't know how to convert to hours, minutes, seconds:

- Tortoises don't care about fractions of seconds

- Think of calculation by hand using only integers (in your code use or simulate integer division)

- or Google: "convert decimal time to hours minutes seconds"

### Number of trailing zeros of N!

Write a program that will calculate the number of trailing zeros in a factorial of a given number.

`N! = 1 * 2 * 3 * ... * N`

Be careful `1000!` has 2568 digits...

For more info, see: [http://mathworld.wolfram.com/Factorial.html](http://mathworld.wolfram.com/Factorial.html)

#### Examples

```py
zeros(6) = 1
# 6! = 1 * 2 * 3 * 4 * 5 * 6 = 720 --> 1 trailing zero

zeros(12) = 2
# 12! = 479001600 --> 2 trailing zeros
```

*Hint: You're not meant to calculate the factorial. Find another way to find the number of zeros.*

### Easy Diagonal

In the drawing below we have a part of the Pascal's triangle, lines are numbered from **zero** (top). The left diagonal in pale blue with only numbers equal to 1 is diagonal **zero**, then in dark green (1, 2, 3, 4, 5, 6, 7) is diagonal 1, then in pale green (1, 3, 6, 10, 15, 21) is diagonal 2 and so on.

We want to calculate the sum of the binomial coefficients on a given diagonal. The sum on diagonal 0 is 8 (we'll write it S(7, 0), 7 is the number of the line where we start, 0 is the number of the diagonal). In the same way S(7, 1) is 28, S(7, 2) is 56.

Can you write a program which calculate S(n, p) where n is the line where we start and p is the number of the diagonal?

The function will take n and p (with: `n >= p >= 0`) as parameters and will return the sum.

#### Examples:

```
diagonal(20, 3) => 5985diagonal(20, 4) => 20349
```

#### Hint:

When following a diagonal from top to bottom have a look at the numbers on the diagonal at its right.

#### Ref:

[http://mathworld.wolfram.com/BinomialCoefficient.html](http://mathworld.wolfram.com/BinomialCoefficient.html)



![alt text](http://i.imgur.com/eUGaNvIm.jpg "Logo Title Text 1")

### Hex class

Create a class Hex which takes a number as an argument.

Adding a hex object to a number (by using `valueOf`) generates a number, but calling `toString` or `toJSON` will show its hexidecimal value starting with "0x". To make hex objects comparable you have to provide a method `equals`.

Example:

```java
Hex FF = new Hex(255);FF.toString() == "0xFF"
FF.valueOf() + 1 == 256
FF.equals(new Hex(255)) == true
```

Also create two methods, `plus` and `minus` which will add or subtract a number or Hex object and return a new Hex object.

```java
Hex a = new Hex(10);Hex b = new Hex(5);a.plus(b).toJSON() == "0xF";a.plus(2).toJSON() == "0xC";
```

Also, create a `parse` class method that can **parse** Hexidecimal numbers and convert them to standard decimal numbers:

```java
Hex.parse("0xFF") == 255
Hex.parse("FF") == 255
```

Note: If you define both `valueOf` and `toString`, "Hex value:" + new Hex(255) may not behave as expected!

### Sortable Shapes

Although shapes can be very different by nature, they can be sorted by the size of their area.

**Task:**

- Create different shapes that can be part of a sortable list. The sort order is based on the size of their respective areas:
  
  - The area of a ***Square*** is the square of its ***side***
  - The area of a ***Rectangle*** is ***width*** multiplied by ***height***
  - The area of a ***Triangle*** is ***base*** multiplied by ***height*** divided by 2
  - The area of a ***Circle*** is the square of its ***radius*** multiplied by π
  - The ***area*** of a ***CustomShape*** is given

- The default sort order of a list of shapes is ascending on area size:

```java
double side = 1.1234;
double radius = 1.1234;
double base = 5;
double height = 2;ArrayList<Shape> shapes = new ArrayList<Shape>();shapes.add(new Square(side));shapes.add(new Circle(radius));shapes.add(new Triangle(base, height));Collections.sort(shapes);
```

- Use the correct π constant for your circle area calculations:

```java
Math.PI
```
