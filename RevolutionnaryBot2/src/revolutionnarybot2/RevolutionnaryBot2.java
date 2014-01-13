/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package revolutionnarybot2;

import java.awt.AWTException;

/**
 *
 * @author Piotr
 */
public class RevolutionnaryBot2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws AWTException {
      MaliciousRobot rob = new MaliciousRobot(500, 10);
      LaunchWindow w = new LaunchWindow();
      w.setBot(rob);
    }
    
}
