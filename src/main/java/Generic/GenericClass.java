package Generic;

import java.util.ArrayList;
import java.util.List;

/**
 * 范型的实现方式是擦拭法，会把<T>视为object处理，在需要转型的时候，编译器会根据T的类型自动为我们实行安全地强制转型
 * @param <T>不能是基本类型，例如int,因为实际类型是Object，Object类型无法持有基本类型
 *           无法取得带范型的Class
 *           无法判断带范型的类型
 *           不能实例化T类型
 */

public class GenericClass<T> {
    private T data;
    public T getData(){
        return data;
    }
    public void setData(T data){
        this.data = data;
    }

    public GenericClass(T data){
        this.data = data;
    }

    public static <K> GenericClass<K> create(K data){    //静态方法不能用类的范型类型
        return new GenericClass<K>(data);
    }

    public static void main(String[] args) {
        GenericClass<String> p1 = new GenericClass("stringData");
        GenericClass<Integer> p2 = new GenericClass(1);
        Class c1 = p1.getClass();
        Class c2 = p2.getClass();
        if (c1 == c2 && c1 == GenericClass.class){
            System.out.println("true");
        }
    }
}
