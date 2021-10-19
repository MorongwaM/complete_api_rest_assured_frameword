package tests.ReqRes;

import io.qameta.allure.*;
import org.testng.annotations.Test;

import static common.CommonTestData.*;
import static common.RequestBuilder.*;
import static org.hamcrest.Matchers.*;

@Feature("ReqRes API")
@Story("Get User List")
@Test
public class GetUserListTest {

    @Description("As an API user, I want to get the list of all Users")
    @Severity(SeverityLevel.BLOCKER)
    public void getUserListtest(){
        userListResponse().
                then().
                    assertThat().
                    statusCode(SUCCESS_STATUS_CODE).
                    body("data.id[0]", equalTo(7)).
                    body("data.first_name", hasItem("Michael"));

    }
}
