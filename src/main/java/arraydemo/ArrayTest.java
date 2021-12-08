package arraydemo;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class ArrayTest {

    public static void main(String[] args) {
        Set<String> cardIds = new TreeSet<String>();
        cardIds.add("001");
        cardIds.add("002");
        cardIds.add("003");
        cardIds.add("004");
        Set<String> specs = new TreeSet<String>();
        specs.add("aaa");
        specs.add("bbb");
        specs.add("ccc");
        specs.add("ddd");

        Object[][] objects = new Object[cardIds.size()][2];

        int i=0;
        for (String cardId : cardIds) {
            objects[i][0] = cardId;
            i++;
        }
        int j = 0;
        for (String spec : specs) {
            objects[j][1] = spec;
            j++;
        }
        System.out.println(Arrays.deepToString(objects));
    }
}
