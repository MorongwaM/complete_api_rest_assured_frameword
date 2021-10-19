package common;

import io.restassured.response.Response;

import static common.BasePaths.*;
import static common.ContentType.*;
import static common.PayloadBuilder.*;
import static io.restassured.RestAssured.given;

public class RequestBuilder {

    public static Response getBreedListResponse(){
        return given().
                when().
                get(BREEDS_BASE_PATH + "/" + BREEDS_LIST).
                then().
                log().all().
                extract().response();
    }


    public static Response userListResponse(){
        return given().
                when().
                get(USERS_PATH).
                then().
                log().all().
                extract().response();
    }



    public static Response createNewUserResponse(){
        return given().
                    when().
                    body(createNewUserObject()).
                    contentType(ReqRes_ContentType).
                    log().all().
                    post(CREATE_NEW_USER_PATH).
                    then().
                    log().all().
                    extract().response();
    }







    public static Response UpdateUserResponse(){
        return given().
                when().
                body(updateUserObject()).
                contentType(ReqRes_ContentType).
                log().all().
                put(UPDATE_USER_PATH).
                then().
                log().all().
                extract().response();
    }





    public static Response PatchUserResponse(){
        return given().
                when().
                body(createNewUserObject()).
                contentType(ReqRes_ContentType).
                log().all().
                patch(UPDATE_USER_PATH).
                then().
                log().all().
                extract().response();
    }

    public static Response DeleteUserResponse(){
        return given().
                when().
                delete(UPDATE_USER_PATH).
                then().
                log().all().
                extract().response();
    }

}
