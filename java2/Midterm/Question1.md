## Question (1)

Consider the following class:

```java
public class Triangle {
  private int a;  private int b;  private int c;
  public Triangle() {a = 0; b = 0; c = 0;}
  public Triangle(int newA, int newB, int newC)  {a = newA; b = newB; c = newC;}
  public int getA( ) {return a;}
  public int getB( ) {return b;}
  public int getC( ) {return c;}
}
```

Write a static method named checkTriangle that takes as a parameter an array of type Triangle named list. The method should check the array and **output the count** of equilateral, isosceles and scalene Triangles. A triangle is said to be equilateral triangle if all the sides are equal, a triangle is said to be an isosceles triangle if any of its two sides are equal, and a triangle is said Scalene Triangle if none of its sides is equal. Note: assume the array list is declared and populated with data in the main method.
