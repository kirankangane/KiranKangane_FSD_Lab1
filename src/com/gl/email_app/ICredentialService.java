package com.gl.email_app;

public interface ICredentialService {

    String generateEmailAddress(String firstName, String lastName, int departCode);

    String generatePassword();

    void showCredentials(Employee employee);

}
