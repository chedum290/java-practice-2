import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>();
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
        a.add(50);

        System.out.println(a);
        System.out.println("1 - добавить, 2 - удалить");
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println("Введите число");
            a.add(sc.nextInt());
        } else if (n == 2) {
            System.out.println("Введите индекс");
            int i = sc.nextInt();

            if (i < 0 || i >= a.size()) {
                System.out.println("Ошибка: ошибка, индекс выходит за пределы массива");
                return;
            }
            a.remove(i);
        } else {
            System.out.println("Неверный выбор. Введите 1 или 2");
            return;
            }
        System.out.println(a);
        }

    }
