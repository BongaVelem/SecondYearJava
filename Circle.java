public class Circle {
  private Double radius;

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
    return 2 * getRadius();

  }

  public double getCircumference() {
    return 2 * Math.PI * getRadius();

  }

  public double getArea() {
    return Math.PI * Math.pow(getRadius(), 2);

  }

  public String toString() {
    return "Radius: " + this.getRadius() +
        "\nDiameter: " + this.getDiameter() +
        "\nCircumference: " + this.getCircumference() +
        "\nArea of a Circle: " + this.getArea();

  }
}
