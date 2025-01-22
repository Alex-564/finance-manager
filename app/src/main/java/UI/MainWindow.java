package UI;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class MainWindow {
    

    public MainWindow(){
    
        JFrame mainWindow = new JFrame();

        //Default settings for main application window
        mainWindow.setTitle("Finance Manager");
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindow.setResizable(false);

        //Layout for main frame
        mainWindow.setLayout(new BorderLayout());
        mainWindow.setSize(800,800);
        mainWindow.setVisible(true);
        
        //Main application tabbed pane to cycle between tabs
        JTabbedPane mainTabbedPane = new JTabbedPane();
        
        
        
        
        


    }



}
