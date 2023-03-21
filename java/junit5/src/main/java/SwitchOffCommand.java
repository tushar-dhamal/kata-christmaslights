import java.util.Arrays;

public class SwitchOffCommand implements Command {

    private LightGrid lightGrid;
    private Position from;
    private Position to;

    public SwitchOffCommand(LightGrid lightGrid, Position from, Position to) {
        this.lightGrid = lightGrid;
        this.from = from;
        this.to = to;
    }

    @Override
    public void execute() {
        int[][] lights = lightGrid.getLights();
        if(from.equals(to)) {
            lights[from.getxAxis()][from.getyAxis()] = Math.max(0,lights[from.getxAxis()][from.getyAxis()]-1);
        }
        for(int rows= from.getxAxis();rows<to.getxAxis();rows++) {
            for(int cols = from.getyAxis();cols<to.yAxis;cols++) {

                lights[rows][cols] = Math.max(0,lights[rows][cols]-1);
            }
        }
    }
}
