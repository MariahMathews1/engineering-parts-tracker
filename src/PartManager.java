import java.util.HashMap;

public class PartManager {

    private HashMap<String, Part> parts;

    public PartManager(){
        parts = new HashMap<>();
    }

    public void addPart(Part part){
        String partNumber = part.getPartNumber();

        if (parts.containsKey(partNumber)){
            System.out.println("Error: This part already exists.");
            return;
        }

        parts.put(partNumber, part);
        System.out.println("Part added successfully!");

    }

    public Part findPart(String partNumber){
        return parts.get(partNumber);
    }

    public void displayAllParts(){
        for(Part part: parts.values()){

            System.out.println("--------------------");
            System.out.println("Part Number: " + part.getPartNumber());
            System.out.println("Description: " + part.getDescription());
            System.out.println("Material: " + part.getMaterial());
            System.out.println("Revision: " + part.getRevision());

        }
        if (parts.isEmpty()){
            System.out.println("--------------------");
            System.out.println("No parts have been added");
        }
    }
}
