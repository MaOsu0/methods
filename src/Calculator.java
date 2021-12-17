public class Calculator {

    double addNumbers(double a, double b) {
        double add = a + b;
        return add;
    }

    double subtractNumbers(double a, double b) {
        double subtract = a - b;
        return subtract;
    }

    double multiplyNumbers(double a, double b) {
        double multiply = a * b;
        return  multiply;
    }

    double divideNumbers(double a, double b) {
        double divide = a / b;
        return divide;
    }

    void showResults (double x, double y){
        double addResults = addNumbers(x, y);
        double subResults = subtractNumbers(x, y);
        double mulResults = multiplyNumbers(x, y);
        double divResults = divideNumbers(x, y);

        System.out.println("Wynik dodawania to :" + addResults);
        System.out.println("Wynik odejmowania to :" + subResults);
        System.out.println("Wynik mnożenia to :" + mulResults);
        System.out.println("Wynik dzielenia to :" + divResults);
    }

}
