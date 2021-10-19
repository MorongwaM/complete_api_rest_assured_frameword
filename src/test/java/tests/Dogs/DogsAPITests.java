package tests.Dogs;
import io.qameta.allure.*;
import org.testng.annotations.Test;
import static common.RequestBuilder.*;
import static common.CommonTestData.*;
import static org.hamcrest.Matchers.*;

@Feature("Dogs API")
@Story("Get Breeds List")
@Test
public class DogsAPITests {


    @Description("As an API user, I want to view the list of all breeds")
    @Severity(SeverityLevel.CRITICAL)
    public void getbreedsListtest(){
        getBreedListResponse().
                then().
                    assertThat().
                    statusCode(SUCCESS_STATUS_CODE);
    }

    @Description("As an API user, I want to verify that retriever is in the list")
    @Severity(SeverityLevel.NORMAL)
    public void getBreedsListAndVerifyRetriverIsInTheListtest(){
        getBreedListResponse().
                then().
                assertThat().
                statusCode(SUCCESS_STATUS_CODE).
                body(containsString("retriever"));
    }
}
