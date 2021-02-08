package reflectdemo.field;

public class Student {
    public String name;
    public int score;

    public Student(String name,int score){
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String toString(){
        return  name+"的分数是"+score;
    }

    private String charge(int score){
        if (score > 80){
            return "优秀";
        }else {
            return "一般";
        }
    }
}
