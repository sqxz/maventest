/**
 * @ClassName Student
 * @Description TDD
 * @Author shenzhenghuan
 * @Date 2020/2/21 15:09
 **/
public class Student extends Person{
    private String score;

    public Student(String name, String sex, String score) {
        super(name, sex);   //任何class的构造方法，第一行语句必须是调用父类的构造方法;子类不会继承任何父类的构造方法。子类默认的构造方法是编译器自动生成的，不是继承的
        setScore(score);
    }


    public void setScore(String score){
        this.score = score;
    }

    public String getScore(){
        return  this.score;
    }

    @Override
    public void run(){
        System.out.println("student is running");
    }

}
