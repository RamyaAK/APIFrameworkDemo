package builders;

import clients.auth.AuthRequest;

public class AuthDetailsBuilder {
    AuthRequest authRequest;

    public AuthDetailsBuilder() {
       authRequest = new AuthRequest();
       authRequest.setUsername("admin");
       authRequest.setPassword("password123");

    }

    public AuthRequest build(){
        return  authRequest;
    }




}
