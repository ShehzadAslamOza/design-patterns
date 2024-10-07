public class ShapeFactory {

    public static Shape Create(ShapeType shapeType) {

        if (shapeType.compareTo(ShapeType.CIRCLE) == 0) {
            return new Circle();
        } else if (shapeType.compareTo(ShapeType.SQUARE) == 0) {
            return new Square();
        } else if (shapeType.compareTo(ShapeType.TRIANGLE) == 0) {
            return new Triangle();
        }

        return null;

    }

}
