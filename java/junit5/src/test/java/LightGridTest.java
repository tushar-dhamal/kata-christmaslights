import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LightGridTest {
    @Test
    public void testCreateLightGrid() {
        LightGrid lightGrid = new LightGrid(1000,1000);
        assertEquals(lightGrid.getRows(),1000);
        assertEquals(lightGrid.getColumns(),1000);
    }
}
