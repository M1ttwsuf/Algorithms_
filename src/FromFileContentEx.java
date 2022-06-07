
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;
/*문자파일의 내용을 스트림을 통해 행 단위로 일고 콘솔에 출력한다*/
public class FromFileContentEx {
    public static void main(String [] args)throws IOException {
        Path path = Paths.get("C:/Users/user/Desktop/hello.txt");
        Stream<String> stream;

        //Files.lines() 메소드 사용
        stream = Files.lines(path, Charset.defaultCharset());
        stream.forEach(System.out :: println);

        //BufferedReader lines() 메소드 이용
         File file =path.toFile();
         FileReader filedReader = new FileReader(file);
         BufferedReader br = new BufferedReader(filedReader);
         stream = br.lines();
         stream.forEach(System.out :: println);
    }
}
