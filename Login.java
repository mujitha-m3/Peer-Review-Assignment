import java.util.Scanner;

public class Login {
    public static void main(String[] Args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name?");
        String firstName = scan.nextLine();

        System.out.println("Enter your last name?");
        String lastName = scan.nextLine();

        System.out.println("Enter your business domain?");
        String domain = scan.nextLine();

        if(firstName.isEmpty() || lastName.isEmpty()){
            System.out.println("Error! First and/or last name is missing");
        } else{
            
        }
    }
}