import java.io.File;
import java.text.SimpleDateFormat;

public class Zadanie {
    public static void main(String[] args) {
        File modified = new File("C:\\Users\\Данияр\\Documents");
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss dd.MM.yyyy");
        System.out.println("Последнее изменение: " + dateFormat.format(modified.lastModified()));

    }
}

