package java_hw_7.task_1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Warehouse<String> stringWarehouse = new Warehouse<>();
        stringWarehouse.addItem("Pineapple");
        stringWarehouse.addItem("Manga");
        stringWarehouse.addItem("Papaya");
        System.out.println("Number of items: " + stringWarehouse.getItemCount());
        System.out.println("Warehouse contents: " + stringWarehouse.viewItems());
        System.out.println("The warehouse is empty? " + stringWarehouse.isEmpty());
        List<String> retrievedItems = stringWarehouse.retrieveAll();
        System.out.println("Items taken: " + retrievedItems);
        System.out.println("Warehouse empty after extraction? " + stringWarehouse.isEmpty());
        stringWarehouse.addItem("Mandarin");
        System.out.println("After adding: " + stringWarehouse.viewItems());
        stringWarehouse.clear();
        System.out.println("After cleansing: " + stringWarehouse.viewItems());
    }
}