/*
 * Splash Screen for Software Engineering (CSCS3513) (TEAM 4)
 * Date: 9/13/2022
 * Team 4
 * 
 * Splash screen for the first screen of the laser tag project.
*/

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Toolkit;
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

    public static void main(String[] args) // This code will go in the main file, just placed here until main created.
    {
        SplashScreen splash = new SplashScreen();
        splash.showSplash();
        try
        {
            Thread.sleep(3000); // wait for 3 seconds
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
        splash.hideSplash();
        System.exit(1);
    }
}
