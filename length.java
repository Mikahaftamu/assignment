public class length {
    public static double convertFromMeters(double meters, String unit) {
        unit = unit.toLowerCase();

        switch (unit) {
            case "m":
            case "meter":
            case "meters":
                return meters;
            case "km":
            case "kilometer":
            case "kilometers":
                return meters / 1000;
            case "cm":
            case "centimeter":
            case "centimeters":
                return meters * 100;
            case "mm":
            case "millimeter":
            case "millimeters":
                return meters * 1000;
            case "ft":
            case "foot":
            case "feet":
                return meters / 0.3048;
            case "in":
            case "inch":
            case "inches":
                return meters / 0.0254;
            case "yd":
            case "yard":
            case "yards":
                return meters / 0.9144;
            default:
                throw new IllegalArgumentException("Invalid unit: " + unit);
        }
    }