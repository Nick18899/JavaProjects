package example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.stream.Stream;

public class HttpScannerParser{
    public static Stream<String> ParseToStrings(String target) throws IOException {
        return (new BufferedReader(new InputStreamReader(new URL(target).openConnection().getInputStream()))).lines();
    }
    public static void OutputRow(Row row){
        System.out.println(row.toString());
     }
}	