
import javax.swing.JOptionPane;

public class Main {
  /**
   * @param args
   */
  public static void main(String[] args) {
    String input;

    input = JOptionPane.showInputDialog("Please enter the raduis size:");
    double radius = Double.parseDouble(input);

    Circle circle = new Circle(radius);

    JOptionPane.showMessageDialog(null, circle.toString());

    System.exit(0);
  }

}
