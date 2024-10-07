public class Client {

    public static void main(String[] args) {

        // Get a circle
        Shape circle = ShapeFactory.Create(ShapeType.CIRCLE);
        assert circle != null;
        circle.draw();

        // Get a square
        Shape square = ShapeFactory.Create(ShapeType.SQUARE);
        assert square != null;
        square.draw();

        // Get a triangle
        Shape triangle = ShapeFactory.Create(ShapeType.TRIANGLE);
        assert triangle != null;
        triangle.draw();
    }
}
