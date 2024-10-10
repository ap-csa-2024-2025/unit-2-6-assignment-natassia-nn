import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    // Problem 1
    double rad;
    System.out.println("Enter the radius of the circle: ");
    rad = sc.nextDouble();
    Circle c;
    c = new Circle(rad);

    System.out.println("A circle with the radius of " + rad + " has a circumference of " + c.getCircumference() + " and an area of " + c.getArea());

    // Problem 2
    int numSide;
    double sideLength;
    RegularPolygon polygon;

    System.out.println("Enter number of sides: ");
    numSide = sc.nextInt();
    
    System.out.println("Enter the side length: ");
    sideLength = sc.nextDouble();

    polygon = new RegularPolygon(numSide, sideLength);

    System.out.println("Area with " + polygon.getNumSides() + " sides: " + polygon.getArea());

    polygon.addSides(2);
    System.out.println("Incrementing the number of sides by two");
    System.out.println("Area with " + polygon.getNumSides() + " sides: " + polygon.getArea());
  }
}
