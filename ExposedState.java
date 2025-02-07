import java.util.List;
import java.util.ArrayList;

public class ExposedState {
    public List<String> items; // Bad practice: public field

    public ExposedState(List<String> items) {
        this.items = items; // Bad practice: direct reference assignment
    }

    public List<String> getItems() {
        return items; // Bad practice: returning internal state directly
    }
}
