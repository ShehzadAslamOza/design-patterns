public enum ShapeType {
    CIRCLE("CIRCLE"),
    SQUARE("SQUARE"),
    TRIANGLE("TRIANGLE");

    private final String shapeName;

    ShapeType(String shapeName) {
        this.shapeName = shapeName;
    }

    public String getShapeName() {
        return shapeName;
    }
}