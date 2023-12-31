package com.gl.email_app;

import java.util.Scanner;

public class EmailApplication {

    public void init(){
        Scanner scanner =new Scanner(System.in);
        String firstName, lastName, email, password;
        int departmentCode = 0;
        System.out.println("Please enter your first Name : ");
        firstName = scanner.nextLine();
        System.out.println("Please enter your lastName : ");
        lastName = scanner.nextLine();
        System.out.println("Please select your department code : ");
        boolean invalidDep= true ;
        while(invalidDep) {
            System.out.println("1. Technical");
            System.out.println("2. Admin");
            System.out.println("3. Human Resource");
            System.out.println("4. Legal");
            departmentCode = scanner.nextInt();
            if (departmentCode > 4 || departmentCode < 1){
                System.out.println("Please select valid department!!");
            } else {
                invalidDep = false;
            }
        }


        //create Email and password
        CredentialServiceImpl obj1 = new CredentialServiceImpl();
        email = obj1.generateEmailAddress(firstName,lastName, departmentCode);
        password = obj1.generatePassword();

        Employee employee = new Employee(firstName,lastName);
        employee.setEmail(email);
        employee.setPassword(password);

        obj1.showCredentials(employee);
    }
}
