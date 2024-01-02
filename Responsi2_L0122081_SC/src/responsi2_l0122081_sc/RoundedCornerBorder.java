/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsi2_l0122081_sc;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;

/**
 * The RoundedCornerBorder class provides a custom rounded border for Swing components.
 * It extends the AbstractBorder class and can be used to create rounded corners for components.
 *
 * @author franklynical
 */
public class RoundedCornerBorder extends javax.swing.border.AbstractBorder {

    /**
     * The radius of the rounded corners.
     */
    private int radius;

    /**
     * Constructs a RoundedCornerBorder with the specified radius.
     *
     * @param radius The radius of the rounded corners.
     */
    RoundedCornerBorder(int radius) {
        this.radius = radius;
    }

    /**
     * Returns the shape of the rounded border.
     *
     * @param x The x-coordinate of the component.
     * @param y The y-coordinate of the component.
     * @param w The width of the component.
     * @param h The height of the component.
     * @return The shape of the rounded border.
     */
    public Shape getBorderShape(int x, int y, int w, int h) {
        int r = radius;
        int r2 = 2 * r;
        int w2 = w - r2;
        int h2 = h - r2;
        Area round = new Area(new RoundRectangle2D.Float(x, y, w, h, r, r));
        Rectangle box = new Rectangle(x + r, y, w2, h2);
        round.add(new Area(box));
        return round;
    }

    /**
     * Paints the rounded border on the component.
     *
     * @param c      The component to paint the border on.
     * @param g      The graphics context.
     * @param x      The x-coordinate of the component.
     * @param y      The y-coordinate of the component.
     * @param width  The width of the component.
     * @param height The height of the component.
     */
    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        Shape border = getBorderShape(x, y, width - 1, height - 1);
        g2.setPaint(new Color(0x0, true));
        Area corner = new Area(new Rectangle2D.Double(x, y, width, height));
        corner.subtract(new Area(border));
        g2.fill(corner);
        g2.setPaint(Color.GRAY);
        g2.draw(border);
        g2.dispose();
    }

    /**
     * Returns the insets of the border.
     *
     * @param c The component.
     * @return The insets of the border.
     */
    @Override
    public Insets getBorderInsets(Component c) {
        return new Insets(4, 8, 4, 8);
    }

    /**
     * Returns the insets of the border, stored in the provided Insets object.
     *
     * @param c      The component.
     * @param insets The Insets object to store the insets.
     * @return The insets of the border.
     */
    @Override
    public Insets getBorderInsets(Component c, Insets insets) {
        insets.set(4, 8, 4, 8);
        return insets;
    }
}