import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        PartManager manager = new PartManager();

        boolean running = true;

        while (running){
            System.out.println("--------------------");
            System.out.println("Engineering Parts Tracker");
            System.out.println("1. Add Part");
            System.out.println("2. View All Parts");
            System.out.println("3. Search for Part");
            System.out.println("4. Revise Part");
            System.out.println("5. Exit");
            System.out.println("--------------------");

            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine();
            System.out.println("--------------------");

            switch (choice) {

                case "1":
                    System.out.println("Add Part selected.");
                    System.out.print("Enter your part number: ");
                    String partNumber = scanner.nextLine();
                    System.out.print("Enter your part description: ");
                    String description = scanner.nextLine();
                    System.out.print("Enter your part material: ");
                    String material = scanner.nextLine();
                    try {
                        Part newPart = new Part(partNumber, description, material);
                        manager.addPart(newPart);

                    } catch (IllegalArgumentException e) {
                        System.out.println("Error: " + e.getMessage());
                    }

                    break;

                case "2":
                    System.out.println("View All Parts selected.");
                    manager.displayAllParts();
                    break;

                case "3":
                    System.out.println("Search Part selected.");

                    System.out.print("Enter part number: ");
                    String searchNumber = scanner.nextLine();

                    Part found = manager.findPart(searchNumber);
                    if (found != null){
                        System.out.println("Part was found");
                        System.out.println("Part Number: " + found.getPartNumber());
                        System.out.println("Description: " + found.getDescription());
                        System.out.println("Material: " + found.getMaterial());
                        System.out.println("Revision: " + found.getRevision());
                    }else{
                        System.out.println("Part was not found");
                    }
                    break;

                case "4":
                    System.out.println("Revise Part selected.");
                    System.out.print("Enter part number: ");
                    String partToRevise = scanner.nextLine();

                    Part partToUpdate = manager.findPart(partToRevise);

                    if(partToUpdate != null){
                        System.out.println("Current Revision: " + partToUpdate.getRevision());
                        System.out.print("Revise this part? (Y/N): ");
                        String confirmation = scanner.nextLine();
                        if (confirmation.equalsIgnoreCase("Y")) {
                            try {
                                partToUpdate.revisePart();
                                System.out.println("Part revised successfully!");
                                System.out.println("New revision: " + partToUpdate.getRevision());
                            } catch (IllegalStateException e) {
                                System.out.println("Error: " + e.getMessage());
                            }
                        } else if (confirmation.equalsIgnoreCase("N")) {
                            System.out.println("Revision cancelled.");
                        } else {
                            System.out.println("Invalid confirmation. Revision cancelled.");
                        }
                    }else{
                        System.out.println("Error: Part was not found or could not be revised.");
                    }
                    break;

                case "5":
                    System.out.println("Exiting application...");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

    }
}
