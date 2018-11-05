import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONPractice {

    public static void main(String[] args) {

        JSONArray daveHobbies = new JSONArray ();
        daveHobbies.add("football");
        daveHobbies.add("golf");

        UserConstructor dave = new UserConstructor("dave",23,"dave@gmail.com",daveHobbies);
        dave.printUserDetails ();

//        JSONObject susan = new JSONObject();
//        susan.put("name", "Susan");
//        susan.put("age", 23);
//        susan.put("email", "Susan@email.com");
//
//        JSONArray hobbies = new JSONArray();
//        hobbies.add("football");
//        hobbies.add("karate");
//
//        System.out.println(hobbies);

    }
}
