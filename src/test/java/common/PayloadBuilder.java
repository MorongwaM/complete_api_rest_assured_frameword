package common;

import org.json.simple.JSONObject;

public class PayloadBuilder {

    public static JSONObject createNewUserObject(){
        JSONObject jsonObject = new JSONObject();

        jsonObject.put("name", "Ndosi");
        jsonObject.put("job", "Engineer");

        return jsonObject;
    }

    public static JSONObject updateUserObject(){
        JSONObject jsonObject = new JSONObject();

        jsonObject.put("name", "Ndosi");
        jsonObject.put("job", "Engineer");

        return jsonObject;
    }


}
