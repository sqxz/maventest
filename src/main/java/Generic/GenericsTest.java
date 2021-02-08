package Generic;

import LearnExtend.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericsTest {
    public static void main(String[] args) {
        Person[] person = new Person[]{
                new Person("shen","man",98),
                new Person("bian","woman",78),
        };
        Arrays.sort(person);
    }
}
