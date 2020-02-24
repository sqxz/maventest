/**
 * @ClassName LearnMethod
 * @Description TDD
 * @Author shenzhenghuan
 * @Date 2020/2/21 14:27
 **/
public class Person {
        protected String name;  //private改为protected。用protected修饰的字段可以被子类访问
        protected String sex;

        public void setName(String name){
            this.name = name;
        }

        public String getName(){
            return this.name;
        }

        public void setSex(String sex){
            this.sex = sex;
        }

        public String getSex(){
            return this.sex;
        }


        public Person(String name,String sex){
            setName(name);
            setSex(sex);
        }

        public void run(){
            System.out.println("person is running");
        }

}
