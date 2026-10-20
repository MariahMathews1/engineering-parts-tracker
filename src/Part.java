public class Part {

    private String partNumber;
    private String description;
    private String material;
    private String revision;

    public Part(String partNumber, String description, String material){
        if (partNumber == null || partNumber.isBlank()) {
            throw new IllegalArgumentException(
                    "Part number cannot be empty."
            );
        }

        if (description == null || description.isBlank()) {
            throw new IllegalArgumentException(
                    "Description cannot be empty."
            );
        }

        if (material == null || material.isBlank()) {
            throw new IllegalArgumentException(
                    "Material cannot be empty."
            );
        }
        this.partNumber = partNumber;
        this.description = description;
        this.material = material;
        this.revision = "A";
    }

    public String getPartNumber(){
        return partNumber;
    }
    public String getDescription(){
        return description;
    }
    public String getMaterial(){
        return material;
    }
    public String getRevision(){
        return revision;
    }

    public void setMaterial(String material){
        if (material == null || material.isBlank()) {
            System.out.println("Error: Material cannot be empty.");
            return;
        }

        this.material = material;
    }

    public void setDescription(String description){
        if(description == null || description.isBlank()){
            System.out.println("Error: Description cannot be empty");
            return;
        }
        this.description = description;
    }

    public void revisePart(){
        if (revision.equals("Z")) {
            throw new IllegalStateException("Another revision is not permitted");
        }

        char currentRevision = revision.charAt(0);
        currentRevision++;
        revision = String.valueOf(currentRevision);
    }




}
