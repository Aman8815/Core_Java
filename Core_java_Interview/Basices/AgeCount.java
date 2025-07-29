package Basices;

import java.time.LocalDate;
import java.time.Period;

public class AgeCount {
    public static void main(String[] args) {
        
         LocalDate date = LocalDate.now();

         LocalDate d = LocalDate.of(2004,10, 04);

         Period p = Period.between(d,date);
         System.out.println(p.getYears());
    }
}
