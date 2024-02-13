public class Circle {
  private double radius;

  public Circle() {

  }

  public Circle(double radius) {
    this.radius = radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;

  }

  public double getRadius() {
    return radius;

  }

  public double getDiameter() {
    return 2 * radius;

  }

  public double getCircumference() {
    return 2 * Math.PI * radius;

  }

  public double getArea() {
    return Math.PI * Math.pow(radius, 2);

  }
}
