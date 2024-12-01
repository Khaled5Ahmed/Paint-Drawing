package backend;

import java.awt.*;
import java.io.Serializable;
import java.util.Map;

public class LineSegment extends ShapeToDraw {

    private Point start;
    private Point end;

    private static int idCounter = 0;
    private int ID;

    public LineSegment(Map<String, Double> properties) {
        int startX = properties.get("StartX").intValue();
        int startY = properties.get("StartY").intValue();
        int endX = properties.get("EndX").intValue();
        int endY = properties.get("EndY").intValue();
        this.start = new Point(startX, startY);
        this.end = new Point(endX, endY);

        this.ID = idCounter++;

    }

    @Override
    public void setProperties(Map<String, Double> properties) {
        if (properties.containsKey("StartX") && properties.containsKey("StartY")
                && properties.containsKey("EndX") && properties.containsKey("EndY")) {
            int startX = properties.get("StartX").intValue();
            int startY = properties.get("StartY").intValue();
            int endX = properties.get("EndX").intValue();
            int endY = properties.get("EndY").intValue();

            this.start = new Point(startX, startY);
            this.end = new Point(endX, endY);
        }
    }

    @Override
    public Map<String, Double> getProperties() {
        return Map.of(
                "StartX", (double) start.x,
                "StartY", (double) start.y,
                "EndX", (double) end.x,
                "EndY", (double) end.y
        );
    }

    @Override
    public void draw(Graphics canvas) {
     //   Color color = getColor();

        canvas.setColor(color);
        canvas.drawLine(start.x, start.y, end.x, end.y);
    }

    public int getID() {
        return ID;
    }

    @Override
    public String toString() {
        return "Line "+ID;
    }
}
