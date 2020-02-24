/**
 * @ClassName Demo
 * @Description TDD
 * @Author shenzhenghuan
 * @Date 2020/2/20 15:17
 **/
public class Demo {
    public static void main(String[] args) {
        Person person = new Person("bian","woman");
        person.getName();
        person.getSex();

        Person student = new Student("szh","man","100");

        student.run();

        String[] names = new String[]{"1","2"};
        for (String name:names) {
            System.out.println(name);
        }
    }
}
