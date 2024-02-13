public class Circle {
  private Double radius;

  public Circle() {

  }

  public Circle(Double radius) {
    this.radius = radius;
  }

  public void setRadius(Double radius) {
    this.radius = radius;

  }

  public Double getRadius() {
    return radius;

  }

  public Double getDiameter() {
    return 2 * getRadius();

  }

  public Double getCircumference() {
    return 2 * Math.PI * getRadius();

  }

  public Double getArea() {
    return Math.PI * Math.pow(getRadius(), 2);

  }

  public String toString() {
    return "Radius: " + this.getRadius() +
        "\nDiameter: " + this.getDiameter() +
        "\nCircumference: " + this.getCircumference() +
        "\nArea of a Circle: " + this.getArea();

  }
}
