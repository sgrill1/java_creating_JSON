import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class UserConstructor {

    private JSONObject user = new JSONObject();
    private String name;
    private int age;
    private String email;
    private JSONArray hobbies;

    public UserConstructor(String userName, int userAge, String userEmail, JSONArray userHobbies) {
        user.put("name", this.name = userName);
        user.put("age", this.age = userAge);
        user.put("email", this.email = userEmail);
        user.put("hobbies", this.hobbies = userHobbies);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public JSONArray getHobbies() {
        return hobbies;
    }

    public void printUserDetails(){
        System.out.println (user);
    }

    }

