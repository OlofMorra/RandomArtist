/**
 * Author: Jan Heemstra & Olof Morra
 * Course: 2IP90
 */


package randomartist;

import java.awt.Graphics;

public class RandomStar extends RandomShape {
    // The coordinates of the center of the star
    private int midX;
    private int midY;
    
    // The height of the star 
    private int height;
    
    // Coordinates of the corners of the star (max 10)
    private int[] coordinateX = new int[10];
    private int[] coordinateY = new int[10];
    
    public RandomStar(int maxX, int maxY) {
        super(maxX, maxY);

        midX = random.nextInt(maxX);
        midY = random.nextInt(maxY);
        height = random.nextInt(maxY/4);
        
        createCoordinates();
    }
    
    // The height is divided in six where the center is 2/6 
    public void createCoordinates() {
        
        coordinateX[0] = (int) (midX - 0.5*height*Math.tan(Math.toRadians(36)));
        coordinateY[0] = (int) (midY - 0.5*height);
        
        coordinateX[1] = (int) (midX);
        coordinateY[1] = (int) (midY - 1.5*height);
        
        coordinateX[2] = (int) (midX + 0.5*height*Math.tan(Math.toRadians(36)));
        coordinateY[2] = (int) (midY - 0.5*height);
        
        coordinateX[3] = (int) (midX + 1.5*height*Math.sin(Math.toRadians(72)));
        coordinateY[3] = (int) (midY - 1.5*height*Math.cos(Math.toRadians(72)));
        
        coordinateX[4] = (int) (midX + ((0.5*height)/Math.cos(Math.toRadians(54)))*Math.cos(Math.toRadians(18)));
        coordinateY[4] = (int) (midY - ((0.5*height)/Math.cos(Math.toRadians(54)))*Math.sin(Math.toRadians(18)));
        
        coordinateX[5] = (int) (midX + 1.5*height*Math.cos(Math.toRadians(36)));
        coordinateY[5] = (int) (midY - 1.5*height*Math.sin(Math.toRadians(36)));
        
        coordinateX[6] = 90;
        coordinateY[6] = 90;
        
        for (int i = 0; i<6; i++) {
        System.out.println(coordinateX[i] + " " + coordinateY[i]);
        }
        System.out.println(midX + " " + midY + " " + height);
    }

    @Override
    void draw(Graphics g) {
        // Get a random color
        getRandomColor();
        
        // Set the color of the shape to 'color'
        g.setColor(color);
        
        g.drawPolygon(coordinateX, coordinateY, 10);
        
    }
}
