public class Teacher implements Comparable<Teacher>{
    public String name;

    public Teacher(String name){
        this.name = name;
    }

    public String toString(){
        return  name;
    }


    public int compareTo(Teacher o) {
        return this.name.compareTo(o.name);
    }
}
