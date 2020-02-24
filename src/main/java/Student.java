
public class Student {
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
}
