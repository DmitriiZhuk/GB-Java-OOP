import java.util.Scanner;

public class CalculatorView implements ICalculatorView {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void show() {
        System.out.println("Результат: " + model.getResult());
    }

    @Override
    public double getNumber1() {
        System.out.print("Введите первое число: ");
        return scanner.nextDouble();
    }

    @Override
    public double getNumber2() {
        System.out.print("Введите второе число: ");
        return scanner.nextDouble();
    }

    @Override
    public char getOperator() {
        System.out.print("Введите оператор (+, -, *, /): ");
        return scanner.next().charAt(0);
    }
}
