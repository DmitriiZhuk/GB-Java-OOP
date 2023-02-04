class CalculatorController:
    def __init__(self, model, view):
        self.model = model
        self.view = view

    def update(self):
        number1 = self.view.get_number1()
        number2 = self.view.get_number2()
        operator = self.view.get_operator()

        self.model.calculate(number1, number2, operator)
        result = self.model.get_result()
        self.view.show(result)

class CalculatorView:
    def show(self, result):
        print("Результат: ", result)

    def get_number1(self):
        number1 = float(input("Введите первое число: "))
        return number1

    def get_number2(self):
        number2 = float(input("Введите второе число: "))
        return number2

    def get_operator(self):
        operator = input("Введите оператор (+, -, *, /): ")[0]
        return operator

class CalculatorModel:
    def __init__(self):
        self.result = 0

    def calculate(self, number1, number2, operator):
        if operator == '+':
            self.result = number1 + number2
        elif operator == '-':
            self.result = number1 - number2
        elif operator == '*':
            self.result = number1 * number2
        elif operator == '/':
            self.result = number1 / number2
        else:
            raise ValueError("Некорректный оператор")

    def get_result(self):
        return self.result


def main():
    model = CalculatorModel()
    view = CalculatorView()
    controller = CalculatorController(model, view)

    controller.update()

if __name__ == "__main__":
    main()
