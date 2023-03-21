import java.util.List;

public class InstructionEngine {

    List<String> instructions;
    LightGrid lightGrid;

    public LightGrid getLightGrid() {
        return lightGrid;
    }

    public void setLightGrid(LightGrid lightGrid) {
        this.lightGrid = lightGrid;
    }

    public void setInstructions(List<String> instructions) {
        this.instructions = instructions;
    }

    public Command instructionCommandIdentifier(String commandString) {
        Command command = null;
        String[] commandPiece = commandString.split(" ");
        if(commandPiece[0].equals("turn")) {
            if(commandPiece[1].equals("on")) {
                Position from = getPosition(commandPiece[2]);
                Position to = getPosition(commandPiece[4]);
                command = new SwitchOnCommand(lightGrid,from,to);
            }
            else if(commandPiece[1].equals("off")) {
                Position from = getPosition(commandPiece[2]);
                Position to = getPosition(commandPiece[4]);
                command = new SwitchOffCommand(lightGrid, from, to);
            }
        } else if(commandPiece[0].equals("toggle")) {
            Position from = getPosition(commandPiece[1]);
            Position to = getPosition(commandPiece[3]);
            command = new ToggleCommand(lightGrid, from, to);
        }
        return command;
    }

    public Position getPosition(String position) {
        Position pos=null;
        String[] posArray = position.split(",");

        if(posArray.length>1)
            pos = new Position(Integer.parseInt(posArray[0]),Integer.parseInt(posArray[1]));
        else
            System.out.println("incorrect instruction : light position incorrect");
        return pos;
    }
    public List<String> getInstructions() {
        return this.instructions;
    }
}
