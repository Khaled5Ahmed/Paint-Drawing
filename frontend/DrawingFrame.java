package frontend;

import backend.*;
import java.awt.Color;
import java.awt.Point;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DrawingFrame extends javax.swing.JFrame {

    DrawingPanel drawPanel = new DrawingPanel();

    public DrawingFrame() {

        drawPanel.setBounds(365, 150, 750, 420);
        this.add(drawPanel);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        frame = new javax.swing.JPanel();
        jInternalFrame = new javax.swing.JInternalFrame();
        rectangleButton = new javax.swing.JButton();
        circleButton = new javax.swing.JButton();
        squareButton = new javax.swing.JButton();
        lineButtton = new javax.swing.JButton();
        jComboBox = new javax.swing.JComboBox<>();
        colorizeButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        resizeButtom = new javax.swing.JButton();
        moveButtom = new javax.swing.JButton();
        saveButtom = new javax.swing.JButton();
        loadButtom = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        frame.setBackground(new java.awt.Color(102, 102, 255));

        jInternalFrame.setBackground(new java.awt.Color(255, 255, 255));
        jInternalFrame.setTitle("Vector Drawing Application");
        jInternalFrame.setVisible(true);

        javax.swing.GroupLayout jInternalFrameLayout = new javax.swing.GroupLayout(jInternalFrame.getContentPane());
        jInternalFrame.getContentPane().setLayout(jInternalFrameLayout);
        jInternalFrameLayout.setHorizontalGroup(
            jInternalFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrameLayout.setVerticalGroup(
            jInternalFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        rectangleButton.setBackground(new java.awt.Color(255, 255, 0));
        rectangleButton.setText("Rectangle");
        rectangleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rectangleButtonActionPerformed(evt);
            }
        });

        circleButton.setBackground(new java.awt.Color(255, 255, 0));
        circleButton.setText("Circle");
        circleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                circleButtonActionPerformed(evt);
            }
        });

        squareButton.setBackground(new java.awt.Color(255, 255, 0));
        squareButton.setText("Square");
        squareButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                squareButtonActionPerformed(evt);
            }
        });

        lineButtton.setBackground(new java.awt.Color(255, 255, 0));
        lineButtton.setText("Line Segment");
        lineButtton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lineButttonActionPerformed(evt);
            }
        });

        jComboBox.setBackground(new java.awt.Color(153, 153, 255));
        jComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Shape" }));
        jComboBox.setToolTipText("Choose Shape");
        jComboBox.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        colorizeButton.setBackground(new java.awt.Color(102, 102, 102));
        colorizeButton.setForeground(new java.awt.Color(255, 255, 255));
        colorizeButton.setText("Colorize");
        colorizeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorizeButtonActionPerformed(evt);
            }
        });

        deleteButton.setBackground(new java.awt.Color(102, 102, 102));
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Select Shape");

        resizeButtom.setBackground(new java.awt.Color(102, 102, 102));
        resizeButtom.setForeground(new java.awt.Color(255, 255, 255));
        resizeButtom.setText("Resize");
        resizeButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resizeButtomActionPerformed(evt);
            }
        });

        moveButtom.setBackground(new java.awt.Color(102, 102, 102));
        moveButtom.setForeground(new java.awt.Color(255, 255, 255));
        moveButtom.setText("Move");
        moveButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moveButtomActionPerformed(evt);
            }
        });

        saveButtom.setBackground(new java.awt.Color(102, 102, 102));
        saveButtom.setForeground(new java.awt.Color(255, 255, 255));
        saveButtom.setText("Save");
        saveButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtomActionPerformed(evt);
            }
        });

        loadButtom.setBackground(new java.awt.Color(102, 102, 102));
        loadButtom.setForeground(new java.awt.Color(255, 255, 255));
        loadButtom.setText("Load");
        loadButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadButtomActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout frameLayout = new javax.swing.GroupLayout(frame);
        frame.setLayout(frameLayout);
        frameLayout.setHorizontalGroup(
            frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jInternalFrame)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameLayout.createSequentialGroup()
                .addContainerGap(381, Short.MAX_VALUE)
                .addComponent(circleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(lineButtton)
                .addGap(89, 89, 89)
                .addComponent(squareButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(rectangleButton)
                .addGap(63, 63, 63))
            .addGroup(frameLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(frameLayout.createSequentialGroup()
                        .addComponent(resizeButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(moveButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(frameLayout.createSequentialGroup()
                            .addComponent(colorizeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(deleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(frameLayout.createSequentialGroup()
                            .addComponent(saveButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(loadButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        frameLayout.setVerticalGroup(
            frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jInternalFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lineButtton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(circleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(squareButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rectangleButton))
                .addGap(101, 101, 101)
                .addGroup(frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loadButtom)
                    .addComponent(saveButtom))
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteButton)
                    .addComponent(colorizeButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resizeButtom)
                    .addComponent(moveButtom))
                .addGap(186, 186, 186))
        );

        frameLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {colorizeButton, deleteButton, moveButtom, resizeButtom});

        frameLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {rectangleButton, squareButton});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(frame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(frame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rectangleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rectangleButtonActionPerformed
        String widthStr = JOptionPane.showInputDialog(null, "Enter width:");
        String lenghStr = JOptionPane.showInputDialog(null, "Enter Lenght:");
        String positionXStr = JOptionPane.showInputDialog(null, "Enter X of Position:");
        String positionYStr = JOptionPane.showInputDialog(null, "Enter Y of Position:");

        try {
            Double width = Double.parseDouble(widthStr);
            Double lenght = Double.parseDouble(lenghStr);
            int positionx = Integer.parseInt(positionXStr);
            int positiony = Integer.parseInt(positionYStr);
            Map<String, Double> properties = new HashMap<>();
            properties.put("Length", lenght);
            properties.put("Width", width);
            Rectangle rectangle = new Rectangle(properties);
            rectangle.setPosition(new Point(positionx, positiony));

            drawPanel.addShapes(rectangle);

            Map<String, Double> getedProperties = rectangle.getProperties();
            String propertiesString = rectangle.toString() + getedProperties.toString();

            jComboBox.addItem(propertiesString);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter valid numbers.");
        }


    }//GEN-LAST:event_rectangleButtonActionPerformed

    private void circleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_circleButtonActionPerformed
        String radiusStr = JOptionPane.showInputDialog(null, "Enter radius:");
        String positionXStr = JOptionPane.showInputDialog(null, "Enter X of Position:");
        String positionYStr = JOptionPane.showInputDialog(null, "Enter Y of Position:");

        try {
            Double radius = Double.parseDouble(radiusStr);
            int positionx = Integer.parseInt(positionXStr);
            int positiony = Integer.parseInt(positionYStr);

            Map<String, Double> properties = new HashMap<>();
            properties.put("Radius", radius);
            Circle circle = new Circle(properties);
            circle.setPosition(new Point(positionx, positiony));
            drawPanel.addShapes(circle);

            Map<String, Double> getedProperties = circle.getProperties();
            String propertiesString = circle.toString() + getedProperties.toString();

            jComboBox.addItem(propertiesString);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter valid numbers.");
        }
    }//GEN-LAST:event_circleButtonActionPerformed

    private void squareButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_squareButtonActionPerformed
        String sideStr = JOptionPane.showInputDialog(null, "Enter Side:");
        String positionXStr = JOptionPane.showInputDialog(null, "Enter X of Position:");
        String positionYStr = JOptionPane.showInputDialog(null, "Enter Y of Position:");

        try {
            Double side = Double.parseDouble(sideStr);
            int positionx = Integer.parseInt(positionXStr);
            int positiony = Integer.parseInt(positionYStr);
            Map<String, Double> properties = new HashMap<>();
            properties.put("Side", side);
            Square square = new Square(properties);
            Point point = new Point(positionx, positiony);
            square.setPosition(point);

            drawPanel.addShapes(square);
            System.out.println(drawPanel.getShapes().length);

            Map<String, Double> getedProperties = square.getProperties();
            String propertiesString = square.toString() + getedProperties.toString();

            jComboBox.addItem(propertiesString);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter valid numbers.");
        }


    }//GEN-LAST:event_squareButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed

        String selectedItem = (String) jComboBox.getSelectedItem();
        int selectedIndex = 0;
        if (selectedItem != null && !selectedItem.equals("Choose Shape")) {
            selectedIndex = jComboBox.getSelectedIndex();
        } else {
            JOptionPane.showMessageDialog(null, "Please select a valid shape.");
        }

        if (drawPanel.getShapes().length == 0) {
            JOptionPane.showMessageDialog(this, "There is no elememts to delete!");
            return;
        }

        if (selectedIndex != -1 && selectedIndex != 0) {
            jComboBox.removeItemAt(selectedIndex);
            Shape[] ListshapeToRemove = drawPanel.getShapes();
            Shape shapeToRemove = ListshapeToRemove[selectedIndex - 1];
            drawPanel.removeShape(shapeToRemove);
            drawPanel.repaint();
        } else {
            JOptionPane.showMessageDialog(null, "Please select a shape to delete.");
        }


    }//GEN-LAST:event_deleteButtonActionPerformed

    private void colorizeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorizeButtonActionPerformed

        if (drawPanel.getShapes().length == 0) {
            JOptionPane.showMessageDialog(this, "The list is empty!");
            return;
        }

        Shape[] Listshapes = drawPanel.getShapes();

        int selectedIndex = jComboBox.getSelectedIndex();

        if (selectedIndex != -1) {
            Color newColor = JColorChooser.showDialog(null, "Select Color", Color.BLACK);

            if (newColor != null) {
                if (selectedIndex > 0 && selectedIndex <= Listshapes.length) {
                    Listshapes[selectedIndex - 1].setFillColor(newColor);
                    drawPanel.repaint();
                } else {
                    JOptionPane.showMessageDialog(this, "Invalid shape selected!");
                }
            }
        }

    }//GEN-LAST:event_colorizeButtonActionPerformed

    private void lineButttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lineButttonActionPerformed
        String startStr = JOptionPane.showInputDialog(null, "Enter Start (x, y):");
        String endStr = JOptionPane.showInputDialog(null, "Enter End (x, y):");

        try {
            String[] startCoords = startStr.split(",");
            String[] endCoords = endStr.split(",");

            Double startX = Double.parseDouble(startCoords[0].trim());
            Double startY = Double.parseDouble(startCoords[1].trim());
            Double endX = Double.parseDouble(endCoords[0].trim());
            Double endY = Double.parseDouble(endCoords[1].trim());

            Map<String, Double> properties = new HashMap<>();
            properties.put("StartX", startX);
            properties.put("StartY", startY);
            properties.put("EndX", endX);
            properties.put("EndY", endY);
            LineSegment line = new LineSegment(properties);

            drawPanel.addShapes(line);
            Map<String, Double> getedProperties = line.getProperties();
            String propertiesString = line.toString() + getedProperties.toString();

            jComboBox.addItem(propertiesString);

        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter valid points in format 'x, y'.");
        }


    }//GEN-LAST:event_lineButttonActionPerformed

    private void resizeButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resizeButtomActionPerformed

        Shape[] Listshapes = drawPanel.getShapes();
        int selectedIndex = jComboBox.getSelectedIndex();
        String selectedItem = (String) jComboBox.getSelectedItem();

        if (selectedIndex == -1) {
            JOptionPane.showMessageDialog(null, "Select a valid shape first!");
            return;
        }

        if (selectedIndex > 0 && selectedIndex <= Listshapes.length) {

            JFrame resizeFrame = new JFrame("Resize Shape");
            resizeFrame.setSize(350, 250);
            resizeFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            resizeFrame.setLocationRelativeTo(null);
            resizeFrame.setResizable(false);

            JPanel panel = new JPanel();
            panel.setLayout(null);

            JLabel label1 = new JLabel();
            JTextField textField1 = new JTextField();
            JLabel label2 = new JLabel();
            JTextField textField2 = new JTextField();
            JButton resizeShapeButton = new JButton("Resize Shape");
            resizeShapeButton.setBounds(90, 100, 160, 30);

            if (selectedItem.split(" ")[0].equals("Square")) {
                label1.setText("Enter Side:");
                label1.setBounds(20, 20, 100, 25);
                textField1.setBounds(120, 20, 150, 25);
                panel.add(label1);
                panel.add(textField1);
                resizeShapeButton.setText("Resize Square");

                resizeShapeButton.addActionListener(e -> {
                    try {
                        double side = Double.parseDouble(textField1.getText());

                        Map<String, Double> properties = new HashMap<>();
                        properties.put("Side", side);

                        Listshapes[selectedIndex - 1].setProperties(properties);
                        resizeFrame.dispose();
                        jComboBox.removeItemAt(selectedIndex);
                        jComboBox.insertItemAt(Listshapes[selectedIndex - 1].toString() + Listshapes[selectedIndex - 1].getProperties().toString(), selectedIndex);
                        drawPanel.repaint();
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.");
                    }
                });
            } else if (selectedItem.split(" ")[0].equals("Rectangle")) {
                label1.setText("Enter Width:");
                label1.setBounds(20, 20, 100, 25);
                textField1.setBounds(120, 20, 150, 25);
                label2.setText("Enter Length:");
                label2.setBounds(20, 60, 100, 25);
                textField2.setBounds(120, 60, 150, 25);
                panel.add(label1);
                panel.add(textField1);
                panel.add(label2);
                panel.add(textField2);
                resizeShapeButton.setText("Resize Rectangle");

                resizeShapeButton.addActionListener(e -> {
                    try {
                        double width = Double.parseDouble(textField1.getText());
                        double length = Double.parseDouble(textField2.getText());

                        Map<String, Double> properties = new HashMap<>();
                        properties.put("Length", length);
                        properties.put("Width", width);

                        Listshapes[selectedIndex - 1].setProperties(properties);

                        resizeFrame.dispose();
                        jComboBox.removeItemAt(selectedIndex);
                        jComboBox.insertItemAt(Listshapes[selectedIndex - 1].toString() + Listshapes[selectedIndex - 1].getProperties().toString(), selectedIndex);
                        drawPanel.repaint();
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Invalid input. Please enter valid numbers.");
                    }
                });
            } else if (selectedItem.split(" ")[0].equals("Circle")) {
                label1.setText("Enter Radius:");
                label1.setBounds(20, 20, 100, 25);
                textField1.setBounds(120, 20, 160, 25);
                panel.add(label1);
                panel.add(textField1);
                resizeShapeButton.setText("Resize Circle");

                resizeShapeButton.addActionListener(e -> {
                    try {
                        double radius = Double.parseDouble(textField1.getText());

                        Map<String, Double> properties = new HashMap<>();
                        properties.put("Radius", radius);

                        Listshapes[selectedIndex - 1].setProperties(properties);
                        resizeFrame.dispose();
                        jComboBox.removeItemAt(selectedIndex);
                        jComboBox.insertItemAt(Listshapes[selectedIndex - 1].toString() + Listshapes[selectedIndex - 1].getProperties().toString(), selectedIndex);
                        drawPanel.repaint();
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.");
                    }
                });
            } else if (selectedItem.split(" ")[0].equals("Line")) {
                label1.setText("Enter Start point (x,y):");
                label1.setBounds(20, 20, 100, 25);
                textField1.setBounds(120, 20, 150, 25);
                label2.setText("Enter End (x,y):");
                label2.setBounds(20, 60, 100, 25);
                textField2.setBounds(120, 60, 150, 25);
                panel.add(label1);
                panel.add(textField1);
                panel.add(label2);
                panel.add(textField2);
                resizeShapeButton.setText("Resize Line");

                resizeShapeButton.addActionListener(e -> {
                    try {
                        String[] startCoords = textField1.getText().split(",");
                        String[] endCoords = textField2.getText().split(",");

                        if (startCoords.length != 2 || endCoords.length != 2) {
                            throw new IllegalArgumentException("Please enter valid coordinates in the format 'x, y'.");
                        }

                        Double startX = Double.parseDouble(startCoords[0].trim());
                        Double startY = Double.parseDouble(startCoords[1].trim());
                        Double endX = Double.parseDouble(endCoords[0].trim());
                        Double endY = Double.parseDouble(endCoords[1].trim());
                        Map<String, Double> properties = new HashMap<>();
                        properties.put("StartX", startX);
                        properties.put("StartY", startY);
                        properties.put("EndX", endX);
                        properties.put("EndY", endY);

                        Listshapes[selectedIndex - 1].setProperties(properties);

                        resizeFrame.dispose();
                        jComboBox.removeItemAt(selectedIndex);
                        jComboBox.insertItemAt(Listshapes[selectedIndex - 1].toString() + Listshapes[selectedIndex - 1].getProperties().toString(), selectedIndex);
                        drawPanel.repaint();

                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Invalid input. Please enter valid numbers.");
                    }
                });
            }

            panel.add(resizeShapeButton);
            resizeFrame.add(panel);
            resizeFrame.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Invalid shape selected!");
        }


    }//GEN-LAST:event_resizeButtomActionPerformed

    private void saveButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtomActionPerformed

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Save Shapes");

        int userSelection = fileChooser.showSaveDialog(this);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();

            try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileToSave))) {
                Shape[] shapesToSave = drawPanel.getShapes();
                out.writeObject(shapesToSave);
                JOptionPane.showMessageDialog(this, "Shapes saved successfully!");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Error saving shapes: " + ex.getMessage());
            }
        }

    }//GEN-LAST:event_saveButtomActionPerformed

    private void loadButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadButtomActionPerformed

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Load Shapes");

        int userSelection = fileChooser.showOpenDialog(this);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToLoad = fileChooser.getSelectedFile();

            try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileToLoad))) {
                Shape[] loadedShapes = (Shape[]) in.readObject();
                for (Shape shape : loadedShapes) {
                    drawPanel.addShapes(shape);
                    jComboBox.addItem(shape.toString() + "-" + shape.getProperties());
                }
                drawPanel.repaint();

                JOptionPane.showMessageDialog(this, "Shapes loaded successfully!");
            } catch (IOException | ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(this, "Error loading shapes: " + ex.getMessage());
            }
        }

    }//GEN-LAST:event_loadButtomActionPerformed

    private void moveButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moveButtomActionPerformed
        Shape[] Listshapes = drawPanel.getShapes();
        int selectedIndex = jComboBox.getSelectedIndex();
        String selectedItem = (String) jComboBox.getSelectedItem();

        if (selectedIndex == -1) {
            JOptionPane.showMessageDialog(null, "Select a valid shape first!");
            return;
        }

        if (selectedIndex > 0 && selectedIndex <= Listshapes.length) {

            JFrame moveFrame = new JFrame("Move Shape");
            moveFrame.setSize(300, 200);
            moveFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            moveFrame.setLocationRelativeTo(null);
            moveFrame.setResizable(false);

            JPanel panel = new JPanel();
            panel.setLayout(null);

            JLabel xLabel = new JLabel("Enter new X :");
            xLabel.setBounds(20, 20, 100, 25);
            panel.add(xLabel);

            JTextField xText = new JTextField();
            xText.setBounds(120, 20, 150, 25);
            panel.add(xText);

            JLabel yLabel = new JLabel("Enter new Y:");
            yLabel.setBounds(20, 60, 100, 25);
            panel.add(yLabel);

            JTextField yText = new JTextField();
            yText.setBounds(120, 60, 150, 25);
            panel.add(yText);

            JButton moveShapeButton = new JButton("Move Shape");
            moveShapeButton.setBounds(90, 100, 120, 30);
            panel.add(moveShapeButton);

            moveShapeButton.addActionListener(e -> {
                if (selectedItem.split(" ")[0].equals("Line")) {
                    try {
                        //  String[] startCoords = xText.getText().split(",");
                        //  String[] endCoords = yText.getText().split(",");

                        //  if (startCoords.length != 2 || endCoords.length != 2) {
                        //    throw new IllegalArgumentException("Please enter valid coordinates in the format 'x, y'.");
                        //}
                        //Double startX = Double.parseDouble(startCoords[0].trim());
                        //Double startY = Double.parseDouble(startCoords[1].trim());
                        //Double endX = Double.parseDouble(endCoords[0].trim());
                        //Double endY = Double.parseDouble(endCoords[1].trim());
                        //Map<String, Double> properties = new HashMap<>();
                        //properties.put("StartX", startX);
                        // properties.put("StartY", startY);
                        //properties.put("EndX", endX);
                        //properties.put("EndY", endY);
                        xLabel.setText("Enter new X of Centre:");
                        yLabel.setText("Enter new Y of Centre:");

                        Double xCentreNew = Double.parseDouble(xText.getText());    // Enter new x of center of line.
                        Double yCentreNew = Double.parseDouble(yText.getText());    // Enter new y of center of line.

                        Double startX = xCentreNew - ((drawPanel.getShapes()[selectedIndex - 1].getProperties().get("EndX")) - (drawPanel.getShapes()[selectedIndex - 1].getProperties().get("StartX"))) / 2;
                        Double startY = yCentreNew - ((drawPanel.getShapes()[selectedIndex - 1].getProperties().get("EndY")) - (drawPanel.getShapes()[selectedIndex - 1].getProperties().get("StartY"))) / 2;
                        Double endX = xCentreNew + ((drawPanel.getShapes()[selectedIndex - 1].getProperties().get("EndX")) - (drawPanel.getShapes()[selectedIndex - 1].getProperties().get("StartX"))) / 2;
                        Double endY = yCentreNew + ((drawPanel.getShapes()[selectedIndex - 1].getProperties().get("EndX")) - (drawPanel.getShapes()[selectedIndex - 1].getProperties().get("StartY"))) / 2;

                        Map<String, Double> properties = new HashMap<>();

                        properties.put("StartX", startX);
                        properties.put("StartY", startY);
                        properties.put("EndX", endX);
                        properties.put("EndY", endY);

                        Listshapes[selectedIndex - 1].setProperties(properties);
                        String newItemName = Listshapes[selectedIndex - 1].getProperties() + Listshapes[selectedIndex - 1].toString();

                        jComboBox.removeItemAt(selectedIndex);
                        jComboBox.insertItemAt(Listshapes[selectedIndex - 1].toString() + Listshapes[selectedIndex - 1].getProperties().toString(), selectedIndex);
                        // System.out.println(Listshapes[selectedIndex - 1].toString() + Listshapes[selectedIndex - 1].getProperties().toString());
                        drawPanel.repaint();
                        moveFrame.dispose();

                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Invalid input. Please enter valid points in format 'x, y'.");
                    }

                } else {
                    try {
                        int newPositionX = Integer.parseInt(xText.getText());
                        int newPositionY = Integer.parseInt(yText.getText());

                        Point point = new Point(newPositionX, newPositionY);
                        Listshapes[selectedIndex - 1].setPosition(point);

                        drawPanel.repaint();
                        moveFrame.dispose();

                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Invalid input. Please enter valid numbers.");
                    }
                }
            });

            moveFrame.add(panel);
            moveFrame.setVisible(true);

        } else {
            JOptionPane.showMessageDialog(this, "Invalid shape selected!");
        }

    }//GEN-LAST:event_moveButtomActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new DrawingFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton circleButton;
    private javax.swing.JButton colorizeButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JPanel frame;
    private javax.swing.JComboBox<String> jComboBox;
    private javax.swing.JInternalFrame jInternalFrame;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton lineButtton;
    private javax.swing.JButton loadButtom;
    private javax.swing.JButton moveButtom;
    private javax.swing.JButton rectangleButton;
    private javax.swing.JButton resizeButtom;
    private javax.swing.JButton saveButtom;
    private javax.swing.JButton squareButton;
    // End of variables declaration//GEN-END:variables
}
