import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //task 1
        int[] mass = new int[15];
        for (int i = 0; i < mass.length; i++) {

            mass[i] = 10+ (int)(Math.random() * 100);
            System.out.println(mass[i]);
        }
        //task2
        int[] positive = new int[5];
        int positionPositive = 0;
        int positionNegative = 0;
        int[] negative = new int[5];
        System.out.println("Введите число");
        int numb = scanner.nextInt();
        while (numb!=0){
            numb = scanner.nextInt();
            if(numb > 0){
                positive[positionPositive]=numb;
                positionNegative++;
            }
            else if(numb<0){
                negative[positionNegative]=numb;
                positionNegative++;

            }
        }
        for (int i = 0; i <positive.length; i++) {

            System.out.println(positive[i]);
        }
        for (int i = 0; i <negative.length; i++) {

            System.out.println(negative[i]);
        }
    }
}