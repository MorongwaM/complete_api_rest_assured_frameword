package tests.ReqRes;

import io.qameta.allure.*;
import org.testng.annotations.Test;

import static common.CommonTestData.*;
import static common.RequestBuilder.*;
import static org.hamcrest.Matchers.*;

@Feature("ReqRes API")
@Story("Create New User")
@Test
public class Post_CreateNewUserTest {

    @Description("As an API user, I want to create a New User")
    @Severity(SeverityLevel.MINOR)
    public void createNewUsertest(){
        createNewUserResponse().
                then().
                assertThat().
                statusCode(CREATE_SUCCESS_STATUS_CODE).
                body("id",notNullValue()).
                body("name",containsString("Ndosi")).
                body("job",containsString("Engineer"));
    }
}
