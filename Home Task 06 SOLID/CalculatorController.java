public class CalculatorController {
    private ICalculatorModel model;
    private ICalculatorView view;

    public CalculatorController(ICalculatorModel model, ICalculatorView view) {
        this.model = model;
        this.view = view;
    }

    public void update() {
        model.calculate(view.getNumber1(), view.getNumber2(), view.getOperator());
        view.show();
    }
}
