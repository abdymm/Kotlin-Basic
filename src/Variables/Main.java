package Variables;

public class Main {
    public static void main(String[] args) {
        final int yearDate = 1993;
        final int age = 23;
        //age = 24; error cannot assign final


        String firstName = "Abdy";
        String lastName = "Malik Mulky";
        String hobby = "Reading";

        System.out.println(firstName + " " + lastName + ", Hobby : " + hobby + ", Born : " + yearDate);

        hobby = "Gaming";
        System.out.println(firstName + " " + lastName + ", Hobby : " + hobby + ", Born : " + yearDate);
    }
}
