import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class task3 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        int sum = 0;
        for (int i : list) {
            sum += i;
        }
        int average = sum / list.size();
        System.out.println(Collections.max(list)+(" = max"));
        System.out.println(Collections.min(list)+(" = min"));
        System.out.println((average)+(" = list average"));
    }

}

