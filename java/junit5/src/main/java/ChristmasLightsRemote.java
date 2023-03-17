import java.util.List;

public class ChristmasLightsRemote implements Remote{

    LightGrid lightGrid;
    InstructionEngine instructionEngine;

    public ChristmasLightsRemote(LightGrid lightGrid) {
        this.lightGrid = lightGrid;
    }
    @Override
    public void executeLight() {
        instructionEngine = new InstructionEngine(lightGrid);
        instructionEngine.setInstructions();
        List<String> instructions = instructionEngine.getInstructions();
        for(String instruction: instructions) {
            instructionEngine.instructionCommandIdentifier(instruction).execute();
        }
        System.out.println("Number of Lit Lights : "+lightGrid.getLitLights());
        System.out.println("Brightness : "+ lightGrid.getTotalBrightness());
    }




}
