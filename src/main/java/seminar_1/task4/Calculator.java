package seminar_1.task4;

public class Calculator {
    // Метод для сложения двух чисел
    public int add(int a, int b) {
        return a + b;
    }
    // Метод для деления двух чисел. Генерирует исключение, если делитель равен нулю.
    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Делитель не может быть равен нулю");
        }
        return (double) a / b;
    }
    // ... другие методы, которые вы хотите протестировать

    public static int calculation(int firstOperand, int secondOperand, char operator) {
        int result;

        switch (operator) {
            case '+':
                result = firstOperand + secondOperand;
                break;
            case '-':
                result = firstOperand - secondOperand;
                break;
            case '*':
                result = firstOperand * secondOperand;
                break;
            case '/':
                if (secondOperand != 0) {
                    result = firstOperand / secondOperand;
                    break;
                } else {
                    throw new ArithmeticException("Division by zero is not possible");
                }
            default:
                throw new IllegalStateException("Unexpected value operator: " + operator);
        }
        return result;
    }

    // HW1.1: Придумайте и опишите (можно в псевдокоде) функцию извлечения корня и
    // необходимые проверки для него используя граничные случаи
    public static double squareRootExtraction(double num) {
        //  0
        //  Отрицательные числа
        //  Дробные значения корней
        //  Целые
        if(num < 0) {
            throw new IllegalArgumentException("Cannot calculate square root of a negative number");
        }
        return Math.sqrt(num);
    }

    /**
     * Метод расчета суммы покупки со скидкой
     * @param purchaseAmount сумма покупки
     * @param discountAmount размер скидки в процентах
     * @return сумма покупки с учетом скидки
     */

    public static double calculatingDiscount(double purchaseAmount, int discountAmount) {
        double resultDiscount = 0;
        try {
            if (purchaseAmount != 0 && discountAmount >= 0 && discountAmount <= 100) {
                resultDiscount = purchaseAmount * discountAmount / 100;
            }
        } catch (ArithmeticException e) {
            throw new ArithmeticException("недопустимые аргументы");
        }
        return purchaseAmount - resultDiscount;
    }
}
