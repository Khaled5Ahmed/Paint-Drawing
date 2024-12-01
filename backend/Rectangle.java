package backend;

import java.awt.*;
import java.io.Serializable;
import java.util.Map;

public class Rectangle extends ShapeToDraw  {

    private double length;
    private double width;

    private static int idCounter = 0; 
    private int ID ;
    
    public Rectangle(Map<String, Double> properties) {
        this.length = properties.get("Length").intValue();
        this.width = properties.get("Width").intValue();
        this.ID = idCounter++;

        //this.length=10;
        //this.width=12;
    }

    @Override
    public void setProperties(Map<String, Double> properties) {

        this.length = properties.get("Length").intValue();
        this.width = properties.get("Width").intValue();
    }

    @Override
    public Map<String, Double> getProperties() {
        return Map.of("Length", length, "Width", width);
    }

    @Override
    public void draw(Graphics canvas) {
       // Color fillColor = getFillColor();
        //Color color = getColor();

        if (fillColor != null) {
            canvas.setColor(fillColor);
            canvas.fillRect(positionX, positionY, (int) width, (int) length);
        }
        if (color != null) {
            canvas.setColor(color);
            canvas.drawRect(positionX, positionY, (int) width, (int) length);
        }
        // System.out.println("Hello World");
    }

    @Override
    public String toString() {
        return "Rectangle "+ID;
    }
}
