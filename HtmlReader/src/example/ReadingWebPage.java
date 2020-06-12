package example;
import java.io.IOException;
import java.time.LocalDate;
import java.util.stream.Stream;

public class ReadingWebPage {
 static Stream<Row> CreateStreamWithQuotes() throws IOException{
	 
    return (HttpScannerParser.ParseToStrings("http://export.rbc.ru/free/selt.0/free.fcgi?period=DAILY&tickers=USD000000TOD&separator=X&data_format=BROWSER&lastdays=30")).map((String s) -> s.split("X")).map((String[] r) -> new Row(LocalDate.parse(r[1]), Double.parseDouble(r[2])));
} 
}
