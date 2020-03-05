

public class Student implements Comparable<Student>{
    private String name;
    private String password;
    private int score;

    public Student(String name,String password,int score){
        this.name = name;
        this.password = password;
        this.score = score;
    }

    public int getScore(){
        return score;
    }

    public String getLevel(String title){
        if (title.equals("优秀")){
            return "A";
        }else
            return "B";
    }

    public static String getGrade(){
        return "一年级";
    }

    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }

    public String toString(){

        return this.name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return score == student.score &&
                name.equals(student.name) &&
                password.equals(student.password);
    }

  /*  @Override
    public int hashCode() {
        return Objects.hash(name, password, score);
    }*/
}
