public class ToggleCommand implements Command{

    private LightGrid lightGrid;
    private Position from;
    private Position to;

    public ToggleCommand(LightGrid lightGrid, Position from , Position to) {
        this.lightGrid = lightGrid;
        this.from = from;
        this.to = to;
    }

    @Override
    public void execute() {
        int[][] lights = lightGrid.getLights();
        if(from.equals(to)) {
            lights[from.getxAxis()][from.getyAxis()] = lights[from.getxAxis()][from.getyAxis()] + 1;
        } else {
            for(int rows= from.getxAxis();rows<to.getxAxis();rows++) {
                for(int cols = from.getyAxis();cols<to.yAxis;cols++) {
                    lights[rows][cols] = lights[rows][cols]+2;
                }
            }
        }
    }
}
