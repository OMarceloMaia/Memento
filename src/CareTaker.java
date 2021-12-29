import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    private List<Memento> mementoList = new ArrayList<Memento>();

    public void push(Memento state) {
        mementoList.add(state);
    }

    public Memento pop() {
        if (mementoList.isEmpty()) {
            return null;
        }
        Memento m;
        m = mementoList.get(mementoList.size() - 1);
        mementoList.remove(mementoList.size() - 1);
        return m;
    }
}
