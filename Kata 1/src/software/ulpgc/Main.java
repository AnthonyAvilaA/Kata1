package software.ulpgc;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person persona = new Person("Anthony", LocalDate.of(2004,9,2));
        System.out.println(persona);
    }
}
