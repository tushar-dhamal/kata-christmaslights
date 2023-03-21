import java.util.ArrayList;
import java.util.List;

public class ChristmasLights {

    public static void main(String args[]) {

        List<String> instructions = new ArrayList<>();
        instructions.add("turn on 887,9 through 959,629");
        instructions.add("turn on 454,398 through 844,448");
        instructions.add("turn off 539,243 through 559,965");
        instructions.add("turn off 370,819 through 676,868");
        instructions.add("turn off 145,40 through 370,997");
        instructions.add("turn off 301,3 through 808,453");
        instructions.add("turn on 351,678 through 951,908");
        instructions.add("toggle 720,196 through 897,994");
        instructions.add("toggle 831,394 through 904,860");


        LightGrid lightGrid = new LightGrid(1000,1000);
        InstructionEngine instructionEngine = new InstructionEngine();
        instructionEngine.setInstructions(instructions);
        instructionEngine.setLightGrid(lightGrid);
        Remote remote = new ChristmasLightsRemote(lightGrid, instructionEngine);
        remote.executeLight();




    }


}
