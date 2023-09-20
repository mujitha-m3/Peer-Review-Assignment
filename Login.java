import java.util.Scanner;

public class Login {
    public static void main(String[] Args){
        Scanner scan = new Scanner(System.in);
        
        // Ask the user to input their first name, last name, and domain.
        System.out.println("Enter your first name:");
        String firstName = scan.nextLine();

        System.out.println("Enter your last name:");
        String lastName = scan.nextLine();

        System.out.println("Enter your business domain:");
        String domain = scan.nextLine();

        // Check if first name or last name is missing. 
        if(firstName.isEmpty() || lastName.isEmpty()){
            System.out.println("Error! First and/or last name is missing");
        } else{
            // If both names are provided, generate email and username.
           String email = GenerateEmail(firstName, lastName, domain);
           String username = GenerateUsername(firstName, lastName);

            // Print the generated email and username.
           System.out.println("Genarated Email: " + email);
           System.out.println("Genarated Username: " + username);
        }
        scan.close();
    }
    
    // Method to generate an email address based on first name, last name, and domain.
    public static String GenerateEmail(String firstName, String lastName, String domain){
        String email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + domain.toLowerCase();
        return email;
    }

    /* Method to generate a username based on the first four characters of the first name
     and the last four characters of the last name.*/ 
    public static String GenerateUsername(String firstName, String lastName){
        String username = firstName.substring(0, 4).toLowerCase() + lastName.substring(0, 4).toLowerCase();
        return username; 
    }
}