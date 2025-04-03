package FlyweightPattern;
import java.util.HashMap;
import java.util.Map;
public class IconStyleFactory {
    private static final Map<String, LocIconStyle> styles = new HashMap<>();

    public static LocIconStyle getStyle(String icon, String color, String labelStyle) {
        String key = icon + "-" + color + "-" + labelStyle;
        styles.putIfAbsent(key, new LocIconStyle(icon, color, labelStyle));
        return styles.get(key);
    }

    public static int getStyleCount() {
        return styles.size();
    }
}