/**
 * Author: Jan Heemstra & Olof Morra
 * Course: 2IP90
 */

package randomartist;

import java.awt.Graphics;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author s145358
 */
public class RandomPoem extends RandomShape{
    ArrayList<String> poem = new ArrayList<String>();
    Random random = new Random();
    

    public RandomPoem(int maxX, int maxY){
        super(maxX, maxY);
    
        int firstLineI = random.nextInt(4);
        
        switch(firstLineI) {
            case 0: poem.add("Yolo lol swag");
                break;
            case 1: introduction();
                break;
            case 2: potard();
                break;
            case 3: poem.add("Resize the window for guaranteed epilepsy!");
                break;
        }
    }
    
    void introduction() {
        String newLine = "";
        newLine += "Once upon a time there was a ";
        int person = random.nextInt(5);
        switch(person) {
            case 0: newLine += "boy";
                break;
            case 1: newLine += "man";
                break;
            case 2: newLine += "teacher";
                break;
            case 3: newLine += "girl";
                break;
            case 4: newLine += "lady";
                break;
        }
        newLine += " named ";
        int name = random.nextInt(3);
        switch (name) {
            case 0: newLine += "Kees";
                break;
            case 1: newLine += "Olof";
                break;
            case 2: newLine += "Jan";
                break;
            case 3: newLine += "Hodor";
                poem.add(newLine);
                hodor();
                return;
        }
        newLine += ".";
        poem.add(newLine);
        int gender = random.nextInt(2);
        String genderStr;
        if (gender == 0) {
            genderStr = "he";
        } else {
            genderStr = "she";
        }
        poem.add("And " + genderStr + " lived happily ever after.");
        poem.add("The end!");
    }
    
    void hodor() {
        poem.add("Hodor");
        poem.add("Hodor");
        poem.add("Hodor");
        poem.add("The end");
    }
    
    void potard() {
        poem.add("Boy iz makin out wen girl asks:");
        poem.add("'Boy, will U get me potard?'");
        poem.add("He dus");
        poem.add("Boy cumz back, and girl seys:");
        poem.add("'I am pregnet, will U stay mah BF?'");
        poem.add("N boy seys nooOOoOOo...");
        poem.add("Girl creys, nd runs away from boy");
        poem.add("But she didn't eat potard, so she haz low blood sugar");
        poem.add("AND SHE FOILS!");
        poem.add("Boy runs ovr 2 pick up her body");
        poem.add("She DED");
        poem.add("Boy seys: 'I sed I didn't want to stay your BF");
        poem.add("'cuz I wanted 2 B ur husband!'");
        poem.add("Boy iz angry, nd throws potard at woll");
        poem.add("A byootifull diamond ring waz insyd");
        poem.add("Graed up if you cry evertim");
        poem.add("");
        poem.add("Disclaimer: ");
        poem.add("The poptard tragidy is not my story.");
        poem.add("Search 'poptard tragidy' on youtube for the original.");
    }
    
    void draw(Graphics g) {
        Font f = new Font("Dialog", Font.PLAIN, 22);
        g.setFont(f);
        
        int lineHeight = 20;
        for (String line : poem) {
            g.drawString(line, 25, lineHeight);
            lineHeight += 20;
        }
    }
}
