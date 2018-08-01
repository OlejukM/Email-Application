package emailapplication;
import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private int passwordLength = 10;
    private String email;
    private String department;
    private int mailBoxCapacity = 999;
    private String alternateEmail;
    private String company = "true.com";

    // Constructor to receive the first and last name

    public Email (String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email Created: " + this.firstName + " " + this.lastName);


        //Method which asks for department and then returns it
        this.department = setDepartment();
        System.out.println("Department is: " + this.department);

        //Method that returns a random password
        this.password = randomPassword(passwordLength);
        System.out.println("Your password is: " + this.password);

        //Generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + company;
        System.out.println("Your email is: " + email);

    }

    // Ask for the department

    private String setDepartment(){
        System.out.print("Choose Department from the list: \n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter here: ");
        Scanner in = new Scanner(System.in);
        int departmentChoice = in.nextInt();
            if (departmentChoice == 1){
                return "sales";
        } else if(departmentChoice == 2){
                return "development";
            } else if (departmentChoice == 3){
                return "accounting";
            } else {
                return "";
            }
    }

    //Generate a random password

    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        char [] password = new char[length];
        for (int i=0; i<length; i++){
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    //Set the mailbox capacity

    public void setMailBox(int capacity){
        this.mailBoxCapacity = capacity;
    }

    //Set the alternate email
    public void setAltEmail (String altEmail){
        this.alternateEmail = altEmail;
    }

    //Change the password

    public void setPassword (String password){
        this.password = password;
    }

    public int getMailBoxCapacity(){
        return mailBoxCapacity;
    }

    public String getAlternateEmail(){
        return alternateEmail;
    }

    public String getPassword(){
        return password;
    }

    public String showInfo(){
        return "DISPLAY NAME: " + firstName + " " + lastName + "\n" +
                "COMPANY MAIL: " + email + "\n" +
                "MAIL COPACITY: " + mailBoxCapacity + " mb";
    }
}
