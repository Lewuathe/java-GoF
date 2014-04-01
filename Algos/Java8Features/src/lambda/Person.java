package lambda;

import java.time.LocalDate;

/**
 * Created by sasakiumi on 4/1/14.
 */
public class Person {
    public enum Sex {
        MALE, FEMALE
    }

    String name;
    LocalDate birthday;
    Sex gender;
    String emailAddress;
    Integer age;

    public Person(String name, Sex gender, LocalDate birthday, Integer age) {
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.age = age;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public Sex getGender() {
        return gender;
    }

    public Integer getAge() {
        return age;
    }
}
