import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
         int number = random.nextInt(100) + 1;
         int attempts = 0;
         while (attempts < 10) {
             System.out.println("Угадайте число от 1 до 100");
             int guess = sc.nextInt();
             if (guess < 1 || guess >100) {
                 System.out.println("Ошибка, число должно быть в диапозоне от 1 до 100");
                 continue;
             }
             attempts++;
             if(guess < number) {
                 System.out.println("Мое число больше");
             }    else if (guess > number) {
                 System.out.println("Мое число меньше");
             }
             else {
                 System.out.println("Поздравляю! Вы угадали число! Вы угадали за " + attempts + " попыток");
                 return;


                 }

             }
         System.out.println("Вы исчерпали все попытки! Загаданное число было " + number);
         }
    }
