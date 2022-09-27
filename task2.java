import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class task2 {
    public static void main(String[] args) {
        List numbers = new ArrayList();

        numbers.add(11);
        numbers.add(45);
        numbers.add(12);
        numbers.add(32);
        numbers.add(36);

        System.out.println("Несортированный список: " + numbers);

        for (Iterator<Integer> iterator = numbers.iterator(); iterator.hasNext(); ) {
            Integer number = iterator.next();
            if (number % 2 == 0) {
                System.out.println("Это четное число: " + number);
                iterator.remove();
            }

        }

        Collections.sort(numbers);
        System.out.println("Отсортированный список: " + numbers);
    }
}
