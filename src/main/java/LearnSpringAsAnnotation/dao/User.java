package LearnSpringAsAnnotation.dao;

import org.springframework.stereotype.Component;

@Component
public class User {
    private String name = "name";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
