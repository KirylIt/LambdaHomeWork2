import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // С помощью лямбда-выражения примите
        // и найдите в массиве второй по величине элемент.

        int[] number = {3, 25, 88, 6, 87, 18, 22, 4, 32, 100};
        Func func = (int[] number1) -> {
            int max = Integer.MIN_VALUE,
                    preMax = Integer.MIN_VALUE;
            int maxind = 0, preMaxind = 0;
            for (int i = 0; i < number1.length; i++) {
                if (number1[i] > max) {
                    preMax = max;
                    max = number1[i];
                    preMaxind = maxind;
                    maxind = i;
                }
            }
            return number1[preMaxind];
        };
        int numbers = func.findMaxNumber(number);
        System.out.println(numbers);
    }
}