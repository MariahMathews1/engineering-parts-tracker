import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PartTest {

    @Test
    void newPartShouldStartAtRevisionA(){
        Part part = new Part(
                "0000123",
                "Mounting Bracket",
                "Aluminum"
        );

        assertEquals("A", part.getRevision());
    }


    @Test
    void revisePartShouldAdvanceRevision() {

        Part part = new Part(
                "0000123",
                "Mounting Bracket",
                "Aluminum"
        );

        // Call the method that advances the revision.
        part.revisePart();

        // Write an assertion that expects revision B.
        assertEquals("B", part.getRevision());
    }

    @Test
    void blankPartNumberShouldThrowException() {

        assertThrows(
                IllegalArgumentException.class,
                () -> new Part("", "Bracket", "Steel")
        );
    }

    @Test
    void blankDescriptionShouldThrowException() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new Part("00000111", "", "Steel")
        );
    }

    @Test
    void blankMaterialShouldThrowException() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new Part("00000111", "jaw fixture", "")
        );
    }

    @Test
    void partAtRevisionZShouldNotBeAbleToRevise(){
        Part part = new Part(
                "0000123",
                "Mounting Bracket",
                "Aluminum"
        );
        for(int i = 0; i < 25; i++){
            part.revisePart();
        }

        assertThrows(IllegalStateException.class,
                () -> part.revisePart());

    }

}