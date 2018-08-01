package emailapplication;

public class Main {
    public static void main(String[] args) {
        Email firstEmail = new Email("Oleh", "Maslo");
        System.out.println(firstEmail.showInfo());

        //Set and sout info
//        firstEmail.setAltEmail("olejukmaslo@gmail.com");
//        System.out.println(firstEmail.getAlternateEmail());
//
//        firstEmail.setPassword("password12345");
//        System.out.println(firstEmail.getPassword());
    }
}
