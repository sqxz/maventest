package Generic;

public class GenericMethod1 {
    private static int add(int a, int b){
        System.out.println(a + "+" + b + "=" + (a+b));
        return a;
    }
    private static <T> T genericAdd(T a, T b){
        System.out.println(a + "+" + b + "=" + a + b);
        return a;
    }

    public static void main(String[] args) {
        GenericMethod1.<String>genericAdd("a","b");
        GenericMethod1.<Integer>genericAdd(1,3);
    }
}
