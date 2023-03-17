
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
public class CommandTest {

    @Test
    public void testCommandSwitchOnCreation() {
        LightGrid lightGrid = new LightGrid(1000,1000);
        Position from = new Position(20,20);
        Position to = new Position(40,40);
        Command command = new SwitchOnCommand(lightGrid,from,to);
        assertThat(command).isNotNull();
        assertThat(command).isInstanceOf(SwitchOnCommand.class);
    }

    @Test
    public void testCommandSwitchOffCreation() {
        LightGrid lightGrid = new LightGrid(1000,1000);
        Position from = new Position(20,20);
        Position to = new Position(40,40);
        Command command = new SwitchOffCommand(lightGrid,from,to);
        assertThat(command).isNotNull();
        assertThat(command).isInstanceOf(SwitchOffCommand.class);
    }

    @Test
    public void testCommandToggleCreation() {
        LightGrid lightGrid = new LightGrid(1000,1000);
        Position from = new Position(20,20);
        Position to = new Position(40,40);
        Command command = new ToggleCommand(lightGrid,from,to);
        assertThat(command).isNotNull();
        assertThat(command).isInstanceOf(ToggleCommand.class);
    }

    @Test
    public void testSwitchOnCommandExecution() {
        LightGrid lightGrid = new LightGrid(1000,1000);
        Position from = new Position(0,0);
        Position to = new Position(0,0);
        Command command = new SwitchOnCommand(lightGrid,from,to);
        command.execute();
        assertThat(lightGrid.getTotalBrightness()).isEqualTo(1);
    }

    @Test
    public void testSwitchOffCommandBoundaryCondition() {
        LightGrid lightGrid = new LightGrid(1000,1000);
        Position from = new Position(0,0);
        Position to = new Position(1000,1000);
        Command command = new SwitchOffCommand(lightGrid,from,to);
        command.execute();
        assertThat(lightGrid.getTotalBrightness()).isEqualTo(0);
    }
    @Test
    public void testToggleCommandExecution() {
        LightGrid lightGrid = new LightGrid(1000,1000);
        Position from = new Position(0,0);
        Position to = new Position(1000,1000);
        Command command = new ToggleCommand(lightGrid,from,to);
        command.execute();
        assertThat(lightGrid.getTotalBrightness()).isEqualTo(2000000);
    }


}
