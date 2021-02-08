package LearnExtend;

/**
 * @ClassName LearnMethod
 * @Description TDD
 * @Author shenzhenghuan
 * @Date 2020/2/21 14:27
 **/
public class Person implements Comparable<Person>{
        protected String name;  //private改为protected。用protected修饰的字段可以被子类访问
        protected String sex;
        protected int score;

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

        public void setScore(int score){
            this.score = score;
        }

        public int getScore(){
            return this.score;
        }


        public Person(String name,String sex,int score){
            setName(name);
            setSex(sex);
            setScore(score);
        }

        public void run(){
            System.out.println("person is running");
        }

    public int compareTo(Person other) {
        return this.name.compareTo(other.name);
    }
}
