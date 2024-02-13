
import javax.swing.JOptionPane;

public class Main {
  /**
   * @param args
   */
  public static void main(String[] args) {
    String input;

    String name = JOptionPane.showInputDialog("Please enter Employee 1 Name: ");

    String surname = JOptionPane.showInputDialog("Please enter Employee 1 Surname: ");

    String number = JOptionPane.showInputDialog("Please enter Employee 1 Number: ");

    input = JOptionPane.showInputDialog("PLease enter your Employee 1 salary: ");
    double salary = Double.parseDouble(input);

    input = JOptionPane.showInputDialog("PLease enter increase percentage: ");
    double salaryIncrease = Double.parseDouble(input);

    Employee employee1 = new Employee(name, surname, number, salary);
    employee1.increaseSalary(salaryIncrease);

    String name2 = JOptionPane.showInputDialog("Please enter Employee 2 Name: ");

    String surname2 = JOptionPane.showInputDialog("Please enter Employee 2 Surname: ");

    String number2 = JOptionPane.showInputDialog("Please enter Employee 2 Number: ");

    input = JOptionPane.showInputDialog("PLease enter your Employee 2 salary: ");
    double salary2 = Double.parseDouble(input);

    input = JOptionPane.showInputDialog("PLease enter increase percentage: ");
    double salaryIncrease2 = Double.parseDouble(input);

    Employee employee2 = new Employee(name2, surname2, number2, salary2);
    employee2.increaseSalary(salaryIncrease2);

    JOptionPane.showMessageDialog(null, "Employee 1 details: \n"
        + employee1.toString() +
        "\nEmployee 2 Details: \n" +
        employee2.toString());

    System.exit(0);

  }

}
