package com.gl.email_app;

public class Employee {
    String firstName;
    String lastName;
    String email;
    String password;

    Employee(String firstName, String lastName){
        this.firstName = firstName ;
        this.lastName = lastName;
    }

    public String getfirstName() {
        return firstName;
    }

    public void setfirstNamel(String firstName) {
        this.firstName = firstName;
    }
    public String getlasttName() {
        return lastName;
    }

    public void setlasttName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
