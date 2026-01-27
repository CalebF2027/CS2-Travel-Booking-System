import java.util.Scanner;

public class Main {

public static void main(String[] args) {

    // Test out the constructor for Trip objects
    Safari s1 = new Safari("Caleb", "Kenya", 10, true);

    Scanner input = new Scanner(System.in);
    // LOOP for booking trips with client input
    boolean continueBooking = true; // flag to control loop
    while (continueBooking) {
        // 1. Call static bookTravel method to create object
        Safari currentTrip = bookTrip(input);
        // 2, Display the object's details
        System.out.println(currentTrip);
        // 3. Ask user if they want to continue booking
        System.out.println("Do you want to book another Safari trip? (y/n)");
        String response = input.nextLine();
        if (response.equals("n") ) {
            continueBooking = false; // stop the loop
        }
    }


} // end main method

// Methods don't have to just be for obkect classes
// Write a reusable process for creating obkects
public static Safari bookTrip(Scanner scan) {
    // 1. Create a blank travel object
    Safari newTrip = new Safari();

    // 2. Ask client for details
    System.out.println("What is your name?");
    String clientName = scan.nextLine();
    System.out.println("Where do you want to go?");
    String clientDestination = scan.nextLine();
    System.out.println("How many days?");
    int clientDuration = scan.nextInt();
    System.out.println("Do you need a hotel rental? Type true or false");
    boolean clientHotel = scan.nextBoolean();

    // 3. Call mutator methods (setters) to update the object
    newTrip.setTravelerName(clientName);
    newTrip.setDestination(clientDestination);
    newTrip.setDurationInDays(clientDuration);
    newTrip.setStayInHotels(clientHotel);

    // 4. Return the completed travel object
    return newTrip;
}


} // end main class
