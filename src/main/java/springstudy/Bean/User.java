package springstudy.Bean;

import java.util.*;

public class User {
    private String userName;
    private Address address;
    private String[] books;
    private Map<String,String> score;
    private List<String> hobby;

    public String[] getBooks() {
        return books;
    }

    public void setBooks(String[] books) {
        this.books = books;
    }

    private Set<String> games;
    private Properties info;

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", address=" + address +
                ", books=" + Arrays.toString(books) +
                ", score=" + score +
                ", hobby=" + hobby +
                ", games=" + games +
                ", info=" + info +
                '}';
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Map<String, String> getScore() {
        return score;
    }

    public void setScore(Map<String, String> score) {
        this.score = score;
    }

    public List<String> getHobby() {
        return hobby;
    }

    public void setHobby(List<String> hobby) {
        this.hobby = hobby;
    }

    public Set<String> getGames() {
        return games;
    }

    public void setGames(Set<String> games) {
        this.games = games;
    }

    public Properties getInfo() {
        return info;
    }

    public void setInfo(Properties info) {
        this.info = info;
    }
}
