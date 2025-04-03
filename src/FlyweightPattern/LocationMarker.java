package FlyweightPattern;
public class LocationMarker {
    private static int totalMarkers = 0;
    private final int x, y;
    private final LocIconStyle style;

    public LocationMarker(int x, int y, LocIconStyle style) {
        this.x = x;
        this.y = y;
        this.style = style;
        totalMarkers++;
    }

    public void render() {
        System.out.println("Rendering marker at (" + x + ", " + y + ") with style " + style);
    }
    public static int getTotalMarkers() {
            return totalMarkers;
    }
}
