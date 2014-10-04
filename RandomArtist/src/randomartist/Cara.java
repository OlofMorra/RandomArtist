package randomartist;

/**
 * Author: Jan Heemstra & Olof Morra
 * Course: 2IP90
 */

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import randomartist.RandomShape;
import randomartist.RandomCircle;

/**
 * starter file for Random Artist homework assignment

 * @author huub & kees
 */

public class Cara extends JPanel implements ActionListener {
    Random random = new Random();
    ArrayList<RandomShape> shapes = new ArrayList<RandomShape>();
    
    public Cara() {
        setPreferredSize(new Dimension(400,300)); // make panel 400 by 300 pixels
        
        shapes.add(new RandomStar(200, 200));
        
    }

    @Override
    protected void paintComponent(Graphics g) { 
        super.paintComponent(g);     // clears the background
        
        // Loop this, 10 to 30 (or more) objects, random amount... 
        shapes.get(0).draw(g);

    }

    /**
     * redraws the Cara JPanel, when the button is pressed. 
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        regenerate();
        repaint();
    }

    public void regenerate() {
        // clear the shapes list
        //...
        
        // create random shapes 
        // ... 
    }
 }
