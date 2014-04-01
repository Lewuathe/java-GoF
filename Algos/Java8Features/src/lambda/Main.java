package lambda;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Created by sasakiumi on 4/1/14.
 */
public class Main {
    public static void main(String[] args) {
        List<Person> plist = new ArrayList<>();
        plist.add(new Person("Takeshi", Person.Sex.MALE, LocalDate.of(2014, 2, 23), 14));
        plist.add(new Person("Shizuka", Person.Sex.FEMALE, LocalDate.of(2014, 1, 1), 13));
        plist.add(new Person("Nobita", Person.Sex.MALE, LocalDate.of(1989, 6, 26), 18));
        plist.add(new Person("Suneo", Person.Sex.MALE, LocalDate.of(1988, 10, 23), 20));
//        printPerson(plist);
        Predicate<Person> pred = p -> p.getAge() >= 18;
//        printPersonWithLambda(plist, pred);
//        consumerWithPred(plist, p -> p.getAge() >= 18, p -> System.out.println(p.getName()));
//        int sum = sumWithPred(plist, p -> p.getAge() <= 14, p -> p.getAge());
//        System.out.println(sum);
        processElements(plist,
                p -> p.getAge() >= 18 && p.getGender() == Person.Sex.MALE,
                p -> p.getName(),
                s -> System.out.println("Mr. " + s));
        plist.stream().filter(p -> p.getGender() == Person.Sex.FEMALE)
                .map(p -> p.getName())
                .forEach(s -> System.out.println("Ms. " + s));
        double ave = plist.stream().filter(p -> p.getAge() >= 18)
                .mapToInt(Person::getAge)
                .average()
                .getAsDouble();
        System.out.println(ave);
    }

    public static void printPerson(List<Person> plist) {
        for (Person p : plist) {
            if (p.getAge() >= 18) {
                System.out.println(p.getName());
            }
        }
    }

    public static void printPersonWithLambda(List<Person> plist, Predicate<Person> pred) {
        for (Person p : plist) {
            if (pred.test(p)) {
                System.out.println(p.getName());
            }
        }
    }

    public static void consumerWithPred(List<Person> plist, Predicate<Person> pred, Consumer<Person> cons) {
        for (Person p : plist) {
            if (pred.test(p)) {
                cons.accept(p);
            }
        }
    }

    public static int sumWithPred(List<Person> plist, Predicate<Person> pred, Function<Person, Integer> function) {
        int sum = 0;
        for (Person p : plist) {
            if (pred.test(p)) {
                sum += function.apply(p);
            }
        }
        return sum;
    }

    public static <X, Y> void processElements(Iterable<X> source,
                                              Predicate<X> tester,
                                              Function<X, Y> mapper,
                                              Consumer<Y> block) {
        for (X p : source) {
            if (tester.test(p)) {
                Y data = mapper.apply(p);
                block.accept(data);
            }
        }
    }
}
