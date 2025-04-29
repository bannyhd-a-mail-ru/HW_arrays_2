import javax.naming.PartialResultException;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.println("Задача 1");

        int[] monthlyExpenses = new int[]{35000, 38000, 41000, 45000, 48000};

        int sum = 0;
        for (int i = 0; i < monthlyExpenses.length; i++) {
            sum += monthlyExpenses[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");


        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.println("Задача 2");

        int maxExpenses = monthlyExpenses[0];
        int minExpenses = monthlyExpenses[0];

        for (int expenses : monthlyExpenses) {
            if (expenses > maxExpenses) {
                maxExpenses = expenses;
            }
            if (expenses < minExpenses) {
                minExpenses = expenses;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minExpenses + " рублей. Максимальная сумма трат за неделю составила " + maxExpenses + " рублей");

        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.println("Задача 3");

        double averageMonthlyExpenses = (double) sum / monthlyExpenses.length;

        System.out.println("Средняя сумма трат за месяц составила " + averageMonthlyExpenses + " рублей");


        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.println("Задача 4");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        int pointer1 = 0;
        int pointer2 = reverseFullName.length - 1;

        for (int i = 0; i < reverseFullName.length / 2; i++) {
            char temp = reverseFullName[pointer1];
            reverseFullName[pointer1] = reverseFullName[pointer2];
            reverseFullName[pointer2] = temp;
            pointer1++;
            pointer2--;
        }
        System.out.println(Arrays.toString(reverseFullName));


    }
}