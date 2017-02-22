import java.util.Scanner;

public class Arithmetics {
    static int add(int a, int b) { // Метод +
        int s = a + b;
        System.out.println("Ответ = " + s);
        return s;
    }
    static int sub(int a, int b) { // Метод -
        int s = a - b;
        System.out.println("Ответ = " + s);
        return s;
    }
    static int mul(int a, int b) { // Метод *
        int s = a * b;
        System.out.println("Ответ = " + s);
        return s;
    }
    static int div(int a, int b) { // Метод /
        int s = a / b;
        System.out.println("Ответ = " + s);
        return s;
        }
    public static void main(String[] args) {
        int operand1, operand2;
        Scanner in = new Scanner(System.in); // Объект класса Scanner для обработки ввода с клавиатуры.
        System.out.println("Введите первую цифру и нажмите Enter: ");
        operand1 = in.nextInt(); // первая цифра
        System.out.println("Введите знак арифметической операции и нажмите Enter: ");
        String sign = in.next(); // знак арифметической операции
        System.out.println("Введите вторую цифру и нажмите Enter:");
        operand2 = in.nextInt(); // вторая цифра
        if (operand2 == 0) {
            System.out.println("Нельзя делить на ноль");
        } else {
            switch (sign) {
                case "+": {
                    add(operand1, operand2);
                    break;
                }
                case "-": {
                    sub(operand1, operand2);
                    break;
                }
                case "*": {
                    mul(operand1, operand2);
                    break;
                }
                case "/": {
                    div(operand1, operand2);
                    break;
                }
                default: {
                    System.out.println("Введите знак арифметической операции");
                    break;
                }
            }
        }
    }
}