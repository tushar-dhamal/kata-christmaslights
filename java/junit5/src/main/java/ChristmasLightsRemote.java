import java.util.List;

public class ChristmasLightsRemote implements Remote{

    LightGrid lightGrid;
    InstructionEngine instructionEngine;

    public ChristmasLightsRemote(LightGrid lightGrid, InstructionEngine instructionEngine) {
        this.lightGrid = lightGrid;
        this.instructionEngine = instructionEngine;
    }
    @Override
    public void executeLight() {
        List<String> instructions = instructionEngine.getInstructions();
        for(String instruction: instructions) {
            instructionEngine.instructionCommandIdentifier(instruction).execute();
        }
        System.out.println("Number of Lit Lights : "+lightGrid.getLitLights());
        System.out.println("Brightness : "+ lightGrid.getTotalBrightness());
    }




}
