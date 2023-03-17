import java.util.ArrayList;
import java.util.List;

public class InstructionEngine {

    List<String> instructions;
    LightGrid lightGrid;

    public InstructionEngine(LightGrid lightGrid) {
        this.lightGrid = lightGrid;
    }

    public void setInstructions() {
        instructions = new ArrayList<>();
        instructions.add("turn on 887,9 through 959,629");
        instructions.add("turn on 454,398 through 844,448");
        instructions.add("turn off 539,243 through 559,965");
        instructions.add("turn off 370,819 through 676,868");
        instructions.add("turn off 145,40 through 370,997");
        instructions.add("turn off 301,3 through 808,453");
        instructions.add("turn on 351,678 through 951,908");
        instructions.add("toggle 720,196 through 897,994");
        instructions.add("toggle 831,394 through 904,860");
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
