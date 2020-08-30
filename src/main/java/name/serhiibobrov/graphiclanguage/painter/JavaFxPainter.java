package name.serhiibobrov.graphiclanguage.painter;

import javafx.geometry.Point2D;
import javafx.scene.Group;
import javafx.scene.shape.Line;
import name.serhiibobrov.graphiclanguage.Painter;
import name.serhiibobrov.graphiclanguage.command.LinePainter.Direction;

public class JavaFxPainter implements Painter {
    private Point2D origin;
    private Pen pen;
    private final Group root;

    public JavaFxPainter(Group root) {
        this.root = root;
        var scene = root.getScene();

        origin = new Point2D(scene.getWidth() / 2.0, scene.getHeight() / 2.0);
    }

    @Override
    public void putPen(Pen pen) {
        this.pen = pen;
    }

    @Override
    public void putAwayPen() {
        pen = null;
    }

    @Override
    public void paintLine(Direction direction, double length) {
        var directionPoint = getDirection(direction, length, origin);
        var line = new Line(origin.getX(), origin.getY(), directionPoint.getX(), directionPoint.getY());


        line.setStyle("-fx-stroke:"+ getPen().getColor());
        line.setStrokeWidth(getPen().getThickness());

        root.getChildren().add(line);

        origin = directionPoint;
    }


    private Pen getPen() {
        if (pen == null) {
            throw new IllegalStateException("No pen is selected");
        }

        return pen;
    }

    private Point2D getDirection(Direction direction, double length, Point2D source) {

        double x = source.getX();
        double y = source.getY();

        System.out.println(direction);

        System.out.println("length: " + length);
        System.out.println("before: x = " + x + " y = " + y);

        switch (direction) {
            case EAST:
                x += length;
                break;
            case WEST:
                x -= length;
                break;
            case NORTH:
                y -= length;
                break;
            case SOUTH:
                y += length;
                break;
        }

        return new Point2D(x, y);
    }
}
