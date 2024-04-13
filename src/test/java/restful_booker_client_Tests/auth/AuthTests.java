package restful_booker_client_Tests.auth;

import builders.AuthDetailsBuilder;
import clients.auth.AuthClient;
import clients.auth.AuthRequest;
import clients.auth.AuthResponse;
import org.testng.Assert;
import org.testng.annotations.Test;
import restful_booker_client_Tests.BaseTest;

public class AuthTests extends BaseTest {

    @Test
    public void userTokenCreationTest(){
        AuthRequest authRequest = new AuthDetailsBuilder().build();
        AuthResponse authResponse = new AuthClient().createTokenForUser(authRequest);
        Assert.assertEquals(authResponse.getHttpStatusCode(),200);
        Assert.assertNotNull(authResponse.getToken());
    }
}
