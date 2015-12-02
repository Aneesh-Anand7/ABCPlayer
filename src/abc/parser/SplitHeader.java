package abc.parser;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class SplitHeader {

    public static List<String> splitHeader(File file) throws IOException {
        Path path = file.toPath();
        List<String> lines = Files.readAllLines(path);
        String header = "";
        String body = "";
        boolean isHead = true;
        for (int i = 0; i<lines.size();i++) {
            String line = lines.get(i);
            if (line.contains("K:")) {
                isHead = false;
                header += lines.get(i);
            }
            else if (isHead) {
                header += line +"\n";
            } else if (i==lines.size()-1) {
                body += line;
            } else {
                body += line + "\n";
            }
            
        }
        return Arrays.asList(header,body);
    }
    
    public static void main(String[] args) throws IOException {
        File file = new File("sample_abc/fur_elise.abc");
        List<String> headbody = splitHeader(file);
        System.out.println(headbody.get(0));
        System.out.println(headbody.get(1));
    }
}
