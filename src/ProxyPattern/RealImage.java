package ProxyPattern;

class RealImage implements Image {
    private final String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("Loading high-resolution image: " + filename);
    }

    @Override
    public void displayThumbnail() {
        System.out.println("Displaying low-resolution thumbnail: " + filename);
    }

    @Override
    public void displayFullImage() {
        System.out.println("Displaying high-resolution image: " + filename);
    }
}