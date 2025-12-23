import java.util.Scanner;

public class PersonHeightCM {
    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);

        System.out.print("PERSON NAME: ");
        String name = s1.nextLine();

        System.out.print("ENTER HEIGHT IN CENTIMETER: ");
        int centimeter = s1.nextInt();

        if (centimeter <150) {
            System.out.println(name + " IS SHORT PERSON: ");
        } else if (centimeter <= 160) {
            System.out.println(name + " IS AVERAGE PERSON: ");
        } else {
            System.out.println(name + " IS TALL PERSON: ");
        }
        s1.close();
    }
}
