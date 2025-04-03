package ProxyPattern;

public class ProxyImage implements Image {
    private final String filename;
    private RealImage realImage;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void displayThumbnail() {
        System.out.println("Displaying cached low-resolution thumbnail: " + filename);
    }

    @Override
    public void displayFullImage() {
        if (realImage == null) {
            realImage = new RealImage(filename);
        }
        realImage.displayFullImage();
    }
}