import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Name: ");
    String name = scanner.nextLine();

    System.out.print("Surname: ");
    String surname = scanner.nextLine();

    System.out.print("Number: ");
    String number = scanner.nextLine();

    System.out.print("Salary: ");
    Double salary = scanner.nextDouble();

    System.out.print("Salary Increase % : ");
    Double salaryIncrease = scanner.nextDouble();

    Employee employee1 = new Employee(name, surname, number, salary);

    System.out.print(" ");
    System.out.println("=================Results 1: ===========");
    System.out.print(" ");
    employee1.increaseSalary(salaryIncrease);
    System.out.println(employee1.toString());
    System.out.println();
    System.out.println();

    Scanner scanner1 = new Scanner(System.in);

    System.out.print("Name2: ");
    String name2 = scanner1.nextLine();

    System.out.print("Surname2: ");
    String surname2 = scanner1.nextLine();

    System.out.print("Number2: ");
    String number2 = scanner1.nextLine();

    System.out.print("Salary2: ");
    Double salary2 = scanner1.nextDouble();

    System.out.print("Salary Increase2 % : ");
    Double salaryIncrease2 = scanner1.nextDouble();

    Employee employee2 = new Employee(name2, surname2, number2, salary2);

    System.out.print(" ");
    System.out.println("=================Results 2: ===========");
    System.out.print(" ");
    employee2.increaseSalary(salaryIncrease2);
    System.out.println(employee2.toString());

    scanner.close();
    scanner1.close();
  }
}
