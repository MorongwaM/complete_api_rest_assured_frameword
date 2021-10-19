package tests.ReqRes;

import common.RequestBuilder;
import io.qameta.allure.*;
import org.testng.annotations.*;

import static common.CommonTestData.*;
import static common.RequestBuilder.*;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.notNullValue;

@Feature("ReqRes API")
@Story("Update(Put) User")
@Test
public class Put_UpdateUserTest {

    @Description("As an API user, I want to update a User")
    @Severity(SeverityLevel.TRIVIAL)
    public void updateUsertest(){
        UpdateUserResponse().
                then().
                assertThat().
                statusCode(SUCCESS_STATUS_CODE).
                body("name",containsString("Ndosi")).
                body("job",containsString("Engineer"));
    }
}
