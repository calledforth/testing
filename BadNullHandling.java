import java.util.List;
import java.util.ArrayList;

public class BadNullHandling {
    private List<Integer> numbers;

    public BadNullHandling() {
        this.numbers = new ArrayList<>();
    }

    public Integer findMax() {
        if (numbers.isEmpty()) {
            return null; // Bad practice: returning null
        }
        
        Integer max = null;
        for (Integer num : numbers) {
            if (max == null || num > max) {
                max = num;
            }
        }
        return max;
    }
}
