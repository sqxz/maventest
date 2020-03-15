import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {

    final  static Logger logger = LogManager.getLogger(TreeMapTest.class);

    public TreeMapTest(){

    }


    public static void main(String[] args) {
/*        Map<Teacher,Integer> treeMap = new TreeMap<Teacher, Integer>(new Comparator<Teacher>() { //传入comparator对象，需要默认实现自定义排序算法
            public int compare(Teacher o1, Teacher o2) {
                return o1.name.compareTo(o2.name); //按照key值排序，(a<b)返回-1 (a==b)返回0 (a>b)返回1
            }
        });*/

        Map<Teacher,Integer> treeMap = new TreeMap<Teacher, Integer>();

        treeMap.put(new Teacher("mingai"),1);
        treeMap.put(new Teacher("shishu"),2);
        treeMap.put(new Teacher("ankang"),3);

        for (Teacher teacher : treeMap.keySet()){
            logger.info(teacher);
        }

        logger.info(treeMap.get(new Teacher("ankang")));

    }
}
