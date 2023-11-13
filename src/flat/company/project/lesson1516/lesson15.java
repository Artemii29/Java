package flat.company.project.lesson1516;

import java.util.ArrayList;
import java.util.LinkedList;

public class lesson15 {
    public static void main(String[] args) {
        LinkedList<String> strings01 = new LinkedList<>();
            System.out.println(strings01.size());
            strings01.add("Тверь");
            strings01.add("Москва");
        LinkedList<String> strings = new LinkedList<>(strings01);
        System.out.println(strings.size());

        strings.add("СПБ");
            strings.add("Самара");
            strings.add(null);
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(3);
    }
}
