import FlyweightPattern.*;
import ProxyPattern.*;

public class Main {
    public static void main(String[] args) {
        // Proxy Pattern Demo
        Image image1 = new ProxyImage("image1.jpg");
        image1.displayThumbnail();
        image1.displayFullImage();

        Image agentImage = new AuthProxyImage("image2.jpg", "Agent");
        agentImage.displayFullImage();
        Image guestImage = new AuthProxyImage("image2.jpg", "Guest");
        guestImage.displayFullImage();

        // Flyweight Pattern Demo
        LocIconStyle hospitalStyle = IconStyleFactory.getStyle("hospital", "yellow", "bold");
        LocIconStyle restaurantStyle = IconStyleFactory.getStyle("restaurant", "blue", "italic");
        LocIconStyle gasStationStyle = IconStyleFactory.getStyle("gas", "green", "normal");

        LocationMarker[] markers = {
                new LocationMarker(30, 18, hospitalStyle),
                new LocationMarker(13, 35, hospitalStyle),
                new LocationMarker(10, 48, restaurantStyle),
                new LocationMarker(39, 70, gasStationStyle),
                new LocationMarker(45, 65, gasStationStyle)
        };

        for (LocationMarker marker : markers) {
            marker.render();
        }

        System.out.println("Unique styles used: " + IconStyleFactory.getStyleCount());
        System.out.println("Total markers created: " + LocationMarker.getTotalMarkers());
    }
}
