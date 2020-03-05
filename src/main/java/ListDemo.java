import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListDemo {
    final static Logger logger = LogManager.getLogger(ListDemo.class);
    public static List<String> name;
    public ListDemo(){
        List<String> name = new ArrayList<String>();
        name.add("shenzhenghuan");
        name.add("bianyi");
        name.add("xiaoxiaoshen");
        this.name = name;
    }

    public static void main(String[] args) {
        new ListDemo();

        String[] array = name.toArray(new String[name.size()]);// list转化为array

        List<String> list = Arrays.asList(array); //array转化为list

        boolean isExit = list.contains(new String("shenzhenghuan"));
        logger.info(isExit);

        int index = list.indexOf(new String("bianyi"));
        logger.info(index);



        for (String n: list)
        {

            logger.info(n);
        }


        List<Student> students = new ArrayList<Student>();
        students.add(new Student("shen","111111",100));
        students.add(new Student("bian","222222",99));

        boolean isEquals = students.get(0).equals(new Student("shen","111111",100));
        boolean isStudentExit = students.contains(new Student("shen","111111",100));
        logger.info(isEquals);
        logger.info(isStudentExit);

    }

}
