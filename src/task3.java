import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //task1
     /*   for (int i = 2; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        //task2
        int minim = 1;
        int maxim = 9;
        int randomNumber = (int) (Math.random() * (maxim - minim + 1) + minim);
        System.out.println(randomNumber);
        System.out.println("Введите число");
        int useNumber ;
            do{
                useNumber = scanner.nextInt();
            if (useNumber > randomNumber) {
                System.out.println(" Это число больше");

            } else if (useNumber < randomNumber) {
                System.out.println(" Это число меньше");

            }
            if (useNumber == randomNumber) {
                System.out.println(" Вы угадали");
            }
        }while (useNumber != randomNumber);
        */

        //task3


        int start;
        int min = 1;
        int max = 100;
        int midle = (max + min) / 2;
        int userInput;
        int big;
        int low;
        int number;
        do {
            System.out.println(" Это число" + midle);
            number =  scanner.nextInt();
            if (number == 0) {
                System.out.println("Число больше " + midle + "? (0 - нет, 1 - да)");
                int greater = scanner.nextInt();
                if (greater == 1) {
                    max = max+1;
                } else {
                    min--;
                }
                midle = (min + max) / 2;
            } else if (number == 1) {
            }

        }while (number != 1);
    }
    }





