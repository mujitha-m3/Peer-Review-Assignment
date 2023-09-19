import java.util.Scanner;

public class Login {
    public static void main(String[] Args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name:");
        String firstName = scan.nextLine();

        System.out.println("Enter your last name:");
        String lastName = scan.nextLine();

        System.out.println("Enter your business domain:");
        String domain = scan.nextLine();

        if(firstName.isEmpty() || lastName.isEmpty()){
            System.out.println("Error! First and/or last name is missing");
        } else{
           String email = GenerateEmail(firstName, lastName, domain);
           String username = GenerateUsername(firstName, lastName);

           System.out.println("Genarated Email: " + email);
           System.out.println("Genarated Username: " + username);
        }
        scan.close();
    }

    public static String GenerateEmail(String firstName, String lastName, String domain){
        String email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + domain.toLowerCase();
        return email;
    }

    public static String GenerateUsername(String firstName, String lastName){
        String username = firstName.substring(0, 4).toLowerCase() + lastName.substring(0, 4).toLowerCase();
        return username; 
    }
}