package frontend;

import backend.DrawingEngine;
import backend.Shape;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

public class DrawingPanel extends JPanel implements DrawingEngine {

    private List<Shape> shapes;

    public DrawingPanel() {
        this.shapes = new ArrayList<>();
        setPreferredSize(new Dimension(600, 500));
        setBackground(Color.WHITE);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        refresh(g);

    }

    
    @Override
    public void addShapes(Shape shape) {
        if (shape != null) {
            shapes.add(shape);
            repaint();
        }
    }

    @Override
    public void removeShape(Shape shape) {
        if (shape != null) {
            shapes.remove(shape);
            repaint();

        }
    }

    @Override
    public Shape[] getShapes() {
        return shapes.toArray(new Shape[0]);
    }

    @Override
    public void refresh(Graphics canvas) {
        for (Shape shape : shapes) {
            shape.draw(canvas);
        }
    }
}
