import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class LightTest {

    @Test
    public void testLightBrightness() {
        Light light = new Light(0);
        assertThat(light.getBrightness()).isEqualTo(0);

    }
}
