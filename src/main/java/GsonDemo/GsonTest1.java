package GsonDemo;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class GsonTest1 {
    public static void main(String[] args) {
        Gson gson = new Gson();
        JsonObject json = gson.fromJson("{\"code\":0,\"msg\":\"success\",\"data\":{}}",JsonObject.class);
        System.out.println(json);

        User user = new User("bob",20);
        String jsonObject = gson.toJson(user);
        System.out.println(jsonObject);

        String jsonString = "{\"name\":\"bob\",\"age\":20}";
        User user1 = gson.fromJson(jsonString,User.class);
        System.out.println("{\"name\":\""+user1.name+"\","+"\"age\":"+user1.age+"}");
    }
}
