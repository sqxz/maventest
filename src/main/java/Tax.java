/**
 * 	abstract class	interface
 * 继承	abstract class只能extends一个class	interface可以implements多个interface
 * 字段	abstract class可以定义实例字段	interface不能定义实例字段
 * 抽象方法	abstract class可以定义抽象方法	interface可以定义抽象方法
 * 非抽象方法	abstract class可以定义非抽象方法	interface可以定义default方法
 */



public interface Tax {
    Integer getTax(int income);//接口定义的所有方法默认都是public abstract的
}
