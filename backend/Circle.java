package backend;

import java.awt.*;
import java.io.Serializable;
import java.util.Map;

public class Circle extends ShapeToDraw  {

    private static final long serialVersionUID = 1L;
    
    private double radius;
    
    private static int idCounter = 0; 
    private int ID ;

    public Circle(Map<String, Double> properties) {
        this.radius = properties.get("Radius").intValue();       
        this.ID = idCounter++ ;
    }

    @Override
    public void setProperties(Map<String, Double> properties) {
        this.radius = properties.get("Radius").intValue();
    }

    @Override
    public Map<String, Double> getProperties() {
        return Map.of("Radius", radius);
    }

    @Override
    public void draw(Graphics canvas) {
      //  Color fillColor = getFillColor();
      //  Color color = getColor();       
        if (fillColor != null) {
            canvas.setColor(fillColor);
            canvas.fillOval(positionX - (int) radius, positionY - (int) radius, (int) radius * 2, (int) radius * 2);
        }
        if (color != null) {
            canvas.setColor(color);
            canvas.drawOval(positionX - (int) radius, positionY - (int) radius, (int) radius * 2, (int) radius * 2);
        }
    }

    public int getID(){
        return ID;
    }
    
    @Override
    public String toString() {
        return "Circle "+ID;
    }
}
