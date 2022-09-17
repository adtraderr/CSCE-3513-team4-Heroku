/*
 * Splash Screen for Software Engineering (CSCS3513) (TEAM 4)
 * Date: 9/13/2022
 * Team 4
 * 
 * Splash screen for the first screen of the laser tag project.
*/

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;

public class SplashScreen extends JFrame
{
    public SplashScreen()
    {
        this.setTitle("Laser Tag");
        this.setSize(1280,720);
        this.setFocusable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.BLACK);
        
        ImageIcon splash_logo = new ImageIcon("SplashScreenLogo.png"); // load logo image from file
        JLabel label = new JLabel(splash_logo); // create label to add logo to
        this.getContentPane().add(label); // add label to the content pane
    }

    public void showSplash() //Shows the splash screen
    {
        this.setVisible(true);
    }

    public void hideSplash() //Hides the splash screen
    {
        this.setVisible(false);
    }
}
