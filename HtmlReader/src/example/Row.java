package example;

import java.time.LocalDate;

public class Row{
    LocalDate date;
    double rate;
    public Row(LocalDate date, double rate){
        this.date = date;
        this.rate = rate;
    }
    @Override
    public String toString(){
        return (date.toString() + "\t" + rate);
    }
}