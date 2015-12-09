package abc.parser;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

public class SplitHeader {

    /**
     * Takes in an abc music file and divides it into the header and body
     * @param file the abc music file to be divided
     * @return a list of Strings of size 2 containing the header and the body of file as Strings
     * @throws IOException
     */
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
            } else {
                body += line + "\n";
            }
        }
        return Arrays.asList(header,body);
    }
}
