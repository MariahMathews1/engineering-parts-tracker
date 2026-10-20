
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PartManagerTest {

    @Test
    void addedPartShouldBeFound() {

        // Arrange
        PartManager manager = new PartManager();

        Part part = new Part(
                "0000123",
                "Mounting Bracket",
                "Aluminum"
        );

        // Act
        manager.addPart(part);
        Part found = manager.findPart("0000123");

        // Assert
        assertNotNull(found);
        assertSame(part, found);
    }

    @Test
    void unknownPartShouldReturnNull(){
        PartManager manager = new PartManager();
        Part found = manager.findPart("00000001");

        assertEquals(null, found);
    }

    @Test
    void duplicatePartNumberShouldNotReplaceOriginal(){
        PartManager manager = new PartManager();
        Part original = new Part("100", "Bracket", "Steel");
        Part duplicate = new Part("100", "Plate", "Copper");
        manager.addPart(original);
        manager.addPart(duplicate);

        Part found = manager.findPart("100");
        assertEquals("Bracket", found.getDescription());
    }

    @Test
    void differentPartNumbersShouldBothBeStored(){
        PartManager manager = new PartManager();
        Part part1 = new Part("100", "Bracket", "Steel");
        Part part2 = new Part("200", "Plate", "Copper");
        manager.addPart(part1);
        manager.addPart(part2);

        Part found1 = manager.findPart("100");
        Part found2 = manager.findPart("200");
        assertSame(part1, found1);
        assertEquals(part2, found2);
    }

}
