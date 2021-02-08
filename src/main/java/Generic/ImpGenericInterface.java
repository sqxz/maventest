package Generic;

public class ImpGenericInterface<T> implements GenericInterface<T> {
    private T data;

    public void setData(T data){
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public static void main(String[] args) {
        ImpGenericInterface<Integer> impGenericInterface = new ImpGenericInterface<Integer>();
        impGenericInterface.setData(123);
        System.out.println(impGenericInterface.getData());
    }
}
