public class Main {
    public static void main(String[] args) {
        ICalculatorModel model = new CalculatorModel();
        ICalculatorView view = new CalculatorView();
        CalculatorController controller = new CalculatorController(model, view);

        controller.update();
    }
}
