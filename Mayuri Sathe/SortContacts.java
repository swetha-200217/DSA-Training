import java.util.*;

public class SortContacts {

    // Function to sort contacts by last name
    public static List<String> sortContacts(List<String> contacts) {
        // Sort the list using a custom comparator
        Collections.sort(contacts, new Comparator<String>() {
            @Override
            public int compare(String contact1, String contact2) {
                // Extract last names
                String lastName1 = contact1.split(" ")[1];
                String lastName2 = contact2.split(" ")[1];

                // Compare last names
                return lastName1.compareTo(lastName2);
            }
        });

        return contacts;
    }

    // Main method to test the function
    public static void main(String[] args) {
        List<String> contacts = new ArrayList<>(Arrays.asList("John Smith", "Jane Doe", "Alice Johnson", "Chris Doe"));
        List<String> sortedContacts = sortContacts(contacts);

        System.out.println("Sorted Contacts: " + sortedContacts);
        // Output: ["Jane Doe", "Chris Doe", "Alice Johnson", "John Smith"]
    }
}
