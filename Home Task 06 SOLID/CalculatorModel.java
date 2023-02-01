public class CalculatorModel implements ICalculatorModel {
    private double result;

    @Override
    public void calculate(double number1, double number2, char operator) {
        switch (operator) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                result = number1 / number2;
                break;
            default:
                throw new IllegalArgumentException("Некорректный оператор");
        }
    }

    @Override
    public double getResult() {
        return result;
    }
}
