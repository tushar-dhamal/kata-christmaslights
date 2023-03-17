public class LightGrid {
    private int rows;
    private int columns;

    private int[][] lights;
    public LightGrid(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.lights = new int[rows][columns];
    }

    public long getLitLights() {
        long litLight = 0;
        for(int rows = 0; rows<this.rows;rows++) {
            for(int cols = 0; cols<this.columns;cols++) {
                if(lights[rows][cols]>0)
                    litLight = litLight + 1;
            }
        }
        return litLight;
    }
    public long getTotalBrightness() {
        long brightness = 0;
        for(int rows = 0; rows<this.rows;rows++) {
            for(int cols = 0; cols<this.columns;cols++) {
                brightness = brightness + this.lights[rows][cols];
            }
        }
        return brightness;
    }
    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    public int[][] getLights() {
        return lights;
    }

    public void setLights(int[][] lights) {
        this.lights = lights;
    }
}
