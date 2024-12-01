package backend;

import java.awt.Color;
import java.awt.Point;
import java.io.Serializable;
import java.util.Map;

public abstract class ShapeToDraw implements Shape , Serializable {

    protected int positionX = 0;
    protected int positionY = 0;

    //protected String colorHex = "#000000";
    //protected String fillColorHex = "#FFFFFF";
    protected Color color = Color.BLACK;
    protected Color fillColor = Color.WHITE;

    @Override
     

    public void setPosition(Point position) {

        this.positionX = position.x;
        this.positionY = position.y;
        //System.out.println("Hello khaled");
    }

    @Override
    public Point getPosition() {
        return new Point(positionX, positionY);
    }

    @Override
    public abstract void setProperties(Map<String, Double> properties);

    @Override
    public abstract Map<String, Double> getProperties();

    @Override
    public void setColor(Color color) {
     //   this.colorHex = "#" + Integer.toHexString(color.getRGB()).substring(2).toUpperCase();
this.color = color;
    }

    @Override
    public Color getColor() {
        //return Color.decode(this.colorHex);
        return color;
    }

    @Override
    public void setFillColor(Color fillColor) {
        //this.fillColorHex = "#" + Integer.toHexString(fillColor.getRGB()).substring(2).toUpperCase();
        // System.out.println("Ana Khaled Ya Am");
        this.fillColor = fillColor;
    }

    @Override
    public Color getFillColor() {
        //return Color.decode(this.fillColorHex);
return fillColor;
    }

    @Override
    public abstract void draw(java.awt.Graphics canvas);

}
