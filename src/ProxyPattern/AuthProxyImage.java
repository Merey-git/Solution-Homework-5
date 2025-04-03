package ProxyPattern;

public class AuthProxyImage implements Image {
    private final String filename;
    private final String userRole;
    private RealImage realImage;

    public AuthProxyImage(String filename, String userRole) {
        this.filename = filename;
        this.userRole = userRole;
    }

    @Override
    public void displayThumbnail() {
        System.out.println("Displaying thumbnail: " + filename);
    }

    @Override
    public void displayFullImage() {
        if ("Agent".equals(userRole)) {
            if (realImage == null) {
                realImage = new RealImage(filename);
            }
            realImage.displayFullImage();
        } else {
            System.out.println("Access Denied: Only agents can view full images.");
        }
    }
}