import java.util.Arrays;
public class task5 {
    public static void main(String[] args) {
        String string01 = "еще";
        StringBuilder reversedString01 = new StringBuilder(string01).reverse();
        String result = reversedString01.toString();
        System.out.println(result);
        if (string01.equals(result)) {
            System.out.println("Строки равны");
        } else {
            System.out.println("Строки не равны");
        }

        //task2

        String string02 = "laba";
        String string03 = "bala";
        if (string02.length() != string03.length()) {
            System.out.println("Строки не равны");
            return;
        }
        char[] a1 = string02.toCharArray();
        char[] a2 = string03.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        if (Arrays.equals(a1, a2)) {
            System.out.println("Строки равны");
        } else {
            System.out.println("Строки не равны");
        }
    }
}
