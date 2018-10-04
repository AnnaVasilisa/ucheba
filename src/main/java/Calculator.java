public class Calculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(); //переменная calculator типа калькулятор = выделили память
        System.out.println("Прибавляем " + calculator.sum(9, 9));
        System.out.println("Вычитаем " + calculator.sub(9, 9));
        System.out.println("Умножаем " + calculator.mult(9, 9));
        System.out.println("Делим " + calculator.div(9, 9));
    }

    public int sum(int first, int second) {
        return first + second;
    }

    public int sub(int first, int second) {
        return first - second;
    }

    public int mult(int first, int second) {
        return first * second;
    }

    public int div(int first, int second) {
        return first / second;
    }

}
