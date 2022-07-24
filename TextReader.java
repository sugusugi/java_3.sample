import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;
import java.io.FileReader;
import java.io.*;
import java.util.logging.*;

public class TextReader{
    private static Logger logger = Logger.getLogger(TextReader.class.getName());
    private String path;

    private TextReader(String path){
        this.path = path;
    }
    private void execute(){
        List<Integer> list = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(new File(path)))){
            String line;
            while((line = br.readLine()) != null){
                list.add(Integer.valueOf(line));
            }
        } catch(IOException e){
            e.printStackTrace();
        }
        Stream<Integer> stream = list.stream();
        stream.forEach(System.out::println);
    }

    public static void main(String[] args){
        logger.info(ObjectList.START.toString());
        new TextReader(args[0]).execute();
        logger.info(ObjectList.END.toString());
    }
}
