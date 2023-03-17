public class ChristmasLights {

    public static void main(String args[]) {
        LightGrid lightGrid = new LightGrid(1000,1000);
        Remote remote = new ChristmasLightsRemote(lightGrid);
        remote.executeLight();
    }
}
