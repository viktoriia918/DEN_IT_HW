package java_hw_11.task_1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        CanBeClosed browser = new MyBrowser();
        CanBeClosed file = new MyFile();

        List<CanBeClosed> entities = new ArrayList<>();
        entities.add(browser);
        entities.add(file);

        SessionCloser closer = list -> list.forEach(CanBeClosed::close);

        closer.closeSession(entities);
    }
}