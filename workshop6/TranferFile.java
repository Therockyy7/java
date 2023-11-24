package workshop6;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class TranferFile {
    public static void main(String[] args) {
        File f = new File("D:\\java_tu_hoc\\Menu.java");
        File point = new File("D:\\java_tu_hoc\\workshop6\\Menu.java");

        try {
            Files.move(f.toPath(), point.toPath(), StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
