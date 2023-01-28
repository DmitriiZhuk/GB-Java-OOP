import java.util.Scanner;

public class CalculatorView {
    private CalculatorModel model;

    public CalculatorView(CalculatorModel model) {
        this.model = model;
    }

    public void getInputAndUpdateModel() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первую цифру: ");
        double number1 = scanner.nextDouble();

        System.out.print("Введите вторую: ");
        double number2 = scanner.nextDouble();

        System.out.print("Введите оператор (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        switch (operator) {
            case '+':
                model.add(number1, number2);
                break;
            case '-':
                model.subtract(number1, number2);
                break;
            case '*':
                model.multiply(number1, number2);
                break;
            case '/':
                model.divide(number1, number2);
                break;
            default:
                System.out.println("Некорректный оператор");
        }
    }

    public void updateView() {
        System.out.println("Результат: " + model.getResult());
    }
}
