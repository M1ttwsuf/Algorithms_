import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FromDirectoryEx {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:/Users/user/Desktop/login Registration");
        Stream<Path> stream = Files.list(path);
        stream.forEach( p ->System.out.println(p.getFileName()) );

    }
}
