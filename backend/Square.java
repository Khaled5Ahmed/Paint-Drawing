package backend;

import java.awt.*;
import java.io.Serializable;
import java.util.Map;

public class Square extends ShapeToDraw  {

    private double side;

    private static int idCounter = 0;
    private int ID;

    public Square(Map<String, Double> properties) {
        this.side = properties.get("Side").intValue();
        this.ID = idCounter++;

    }

    @Override
    public void setProperties(Map<String, Double> properties) {
        this.side = properties.get("Side").intValue();
    }

    @Override
    public Map<String, Double> getProperties() {
        return Map.of("Side", side);
    }

    @Override
    public void draw(Graphics canvas) {
       // Color fillColor = getFillColor();
       // Color color = getColor();

        if (fillColor != null) {
            canvas.setColor(fillColor);
            canvas.fillRect(positionX, positionY, (int) side, (int) side);
        }
        if (color != null) {
            canvas.setColor(color);
            canvas.drawRect(positionX, positionY, (int) side, (int) side);
        }
    }

    public int getID() {
        return ID;
    }

    @Override
    public String toString() {
        return "Square "+ID;
    }
}
