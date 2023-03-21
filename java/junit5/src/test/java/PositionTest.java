import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class PositionTest {
    @Test
    public void testCreatePosition() {
        Position position = new Position(0,0);
        assertThat(position).isNotNull();
        assertThat(position.getxAxis()).isEqualTo(0);
        assertThat(position.getyAxis()).isEqualTo(0);
    }
}
