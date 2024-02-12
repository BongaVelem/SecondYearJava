
import javax.swing.JOptionPane;

public class Main {
  /**
   * @param args
   */
  public static void main(String[] args) {
    String input;

    Employee employee1 = new Employee();

    String name = JOptionPane.showInputDialog("Please enter Employee 1 Name: ");
    employee1.setEmpName(name);

    String surname = JOptionPane.showInputDialog("Please enter Employee 1 Surname: ");
    employee1.setEmpSurname(surname);

    String number = JOptionPane.showInputDialog("Please enter Employee 1 Number: ");
    employee1.setEmpNumber(number);

    input = JOptionPane.showInputDialog("PLease enter your Employee 1 salary: ");
    double salary = Double.parseDouble(input);
    employee1.setEmpSalary(salary);

    input = JOptionPane.showInputDialog("PLease enter increase percentage: ");
    double salaryIncrease = Double.parseDouble(input);
    employee1.increaseSalary(salaryIncrease);

    Employee employee2 = new Employee();

    String name2 = JOptionPane.showInputDialog("Please enter Employee 2 Name: ");
    employee2.setEmpName(name2);

    String surname2 = JOptionPane.showInputDialog("Please enter Employee 2 Surname: ");
    employee2.setEmpSurname(surname2);

    String number2 = JOptionPane.showInputDialog("Please enter Employee 2 Number: ");
    employee2.setEmpNumber(number2);

    input = JOptionPane.showInputDialog("PLease enter your Employee 2 salary: ");
    double salary2 = Double.parseDouble(input);
    employee2.setEmpSalary(salary2);

    input = JOptionPane.showInputDialog("PLease enter increase percentage: ");
    double salaryIncrease2 = Double.parseDouble(input);
    employee2.increaseSalary(salaryIncrease2);

    JOptionPane.showMessageDialog(null, "Employee 1 details: \n"
        + employee1.toString() +
        "\nEmployee 2 Details: \n" +
        employee2.toString());

    System.exit(0);

  }

}
