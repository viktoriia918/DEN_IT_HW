package java_hw_7.task_1;
import java.util.ArrayList;
import java.util.List;
public class Warehouse <T> {
    private List<T> items;
    public Warehouse() {
    items = new ArrayList<>();
    }
    public void addItem(T item) {
    items.add(item);
    }
    public int getItemCount() {
    return items.size();
    }
    public List<T> retrieveAll() {
    List<T> retrievedItems = new ArrayList<>(items);
    items.clear();
    return retrievedItems;
    }
    public List<T> viewItems() {
    return new ArrayList<>(items);
    }
    public boolean isEmpty() {
    return items.isEmpty();
    }
    public void clear() {
    items.clear();
    }
    }