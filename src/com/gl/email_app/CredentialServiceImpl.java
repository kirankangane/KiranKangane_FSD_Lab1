package com.gl.email_app;

import java.util.Locale;

public class CredentialServiceImpl implements ICredentialService{

    @Override
    public String generateEmailAddress(String firstName, String lastName, int departCode) {
        StringBuilder emailAdress = new StringBuilder();
        emailAdress.append(firstName);
        emailAdress.append(lastName);
        emailAdress.append('@');
        //(Technical, Admin, Human Resource, Legal)
        if(departCode == 1){
            emailAdress.append("tech");
        } else if (departCode == 2){
            emailAdress.append("admin");
        } else if (departCode == 3){
            emailAdress.append("hr");
        } else if (departCode == 4){
            emailAdress.append("legal");
        } else {
            System.out.println("Deploart code is not valid : " + departCode);
        }
        emailAdress.append('.');
        emailAdress.append("gl");
        emailAdress.append('.');
        emailAdress.append("com");
        return emailAdress.toString().toLowerCase(Locale.ROOT);
    }

    @Override
    public String generatePassword() {
        String allCaps = "QWERTYUIOPASDFGHJKLZXCVBNM";
        String allSmall = "poiuytrewqasdfghjklmnbvcxz";
        String numbers = "0123456789";
        String specialCharacters = "~@#$%^&*()-=+<>?'][}{";
        String allChar = allCaps + allSmall +numbers + specialCharacters;
        StringBuilder password = new StringBuilder();
        java.util.Random randomNumber = new java.util.Random();

        for (int i = 0 ; i < 6; i ++){
            password.append(allChar.charAt(randomNumber.nextInt(allChar.length()-1)));
        }

        password.append(allCaps.charAt(randomNumber.nextInt(allCaps.length()-1)));
        password.append(allSmall.charAt(randomNumber.nextInt(allSmall.length()-1)));
        password.append(numbers.charAt(randomNumber.nextInt(numbers.length()-1)));
        password.append(specialCharacters.charAt(randomNumber.nextInt(specialCharacters.length()-1)));

        return password.toString();
    }

    @Override
    public void showCredentials(Employee employee) {
        System.out.println("Dear " + employee.firstName + " your generated credentials are as follows : ");
        System.out.println("Email    --> " + employee.getEmail());
        System.out.println("Password --> " + employee.getPassword());
    }
}
