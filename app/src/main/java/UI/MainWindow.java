package UI;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MainWindow extends JFrame implements ActionListener{
    
    //private JFrame mainWindow;
    JMenuBar menuBar;
    JMenu fileMenu;
    JMenu helpMenu;
    JMenuItem exportItem;
    JMenuItem exitItem;

    public MainWindow(){
    
        //mainWindow = new JFrame();

        //Default settings for main application window
        this.setTitle("Finance Manager");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);

        //Layout for main frame
        this.setLayout(new BorderLayout());
        this.setSize(800,800);
        this.setVisible(true);
        
        //Main Window menu bar
        this.configureMenubar();
        
    }

    private void configureMenubar(){
        
        //Configure Menu Bar 
        menuBar = new JMenuBar();
        this.setJMenuBar(menuBar);

        //Configure Menus
        fileMenu = new JMenu("File");
        helpMenu = new JMenu("Help");

        //Configure Menu Items
        exportItem = new JMenuItem("Export");
        exitItem = new JMenuItem("Exit");


        fileMenu.add(exportItem);
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);
        menuBar.add(helpMenu);

        this.setJMenuBar(menuBar);
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}
