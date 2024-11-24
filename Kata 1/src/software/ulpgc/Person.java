package software.ulpgc;

import java.time.LocalDate;

public class Person {
    private static final int DAYS_PER_YEARS = 365;
    private final String name;
    private final LocalDate birthDate;

    public Person(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getAge() {
        return toYears(LocalDate.now().toEpochDay() - birthDate.toEpochDay());
    }

    private int toYears(long l) {
        return (int) (l/DAYS_PER_YEARS);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + getAge() + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
