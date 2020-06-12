package example;

import java.util.stream.Stream;
import java.io.IOException;

public class App 
{
    public static void main( String args[])throws IOException{
        Stream<Row> vc = ReadingWebPage.CreateStreamWithQuotes();
        vc.forEach(HttpScannerParser::OutputRow);
    }
}