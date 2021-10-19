package tests.ReqRes;

import io.qameta.allure.*;
import org.testng.annotations.Test;

import static common.CommonTestData.SUCCESS_STATUS_CODE;
import static common.RequestBuilder.*;
import static org.hamcrest.Matchers.containsString;

@Feature("ReqRes API")
@Story("Update(Patch) User")
@Test
public class Patch_UpdateUserTest {

    @Description("As an API user, I want to update(Patch) a User")
    @Severity(SeverityLevel.CRITICAL)
    public void patchUsertest(){
        PatchUserResponse().
                then().
                assertThat().
                statusCode(SUCCESS_STATUS_CODE).
                body("name",containsString("Ndosi")).
                body("job",containsString("Engineer"));
    }
}
