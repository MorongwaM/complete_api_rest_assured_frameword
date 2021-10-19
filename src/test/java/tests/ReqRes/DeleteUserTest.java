package tests.ReqRes;

import io.qameta.allure.*;
import org.testng.annotations.Test;

import static common.CommonTestData.*;
import static common.RequestBuilder.*;

@Feature("ReqRes API")
@Story("Delete User")
@Test
public class DeleteUserTest {

    @Description("As an API user, I want to delete a User")
    @Severity(SeverityLevel.NORMAL)
    public void deleteUsertest(){
        DeleteUserResponse().
                then().
                assertThat().
                statusCode(DELETE_SUCCESS_STATUS_CODE);
    }
}
