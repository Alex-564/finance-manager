package UI;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MainWindow extends JFrame implements ActionListener{
    
    JMenuBar menuBar;
    ArrayList<JMenu> menus = new ArrayList<>();
    ArrayList<JMenuItem> menuItems = new ArrayList<>();

    public MainWindow(){
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

        //Configure Menus and Menu Items
        String[] menuNames = {"File", "Help"};
        String[][] menuItemNames = {{"Export","Exit"}};

        //Iterate through all menu names
        for (int i = 0; i < menuNames.length; i++) {
            //Dynamically add the menuNames to the menubar and menus list
            String menuName = menuNames[i];
            JMenu menu = new JMenu(menuName);
            menus.add(menu);
            menuBar.add(menu);
        
            //Each menu has associated menuItems to be added
            for (String menuItemName : menuItemNames[i]){
                //Dynamically add the menu items to the menus and menuItems list
                JMenuItem menuItem = new JMenuItem(menuItemName);
                menuItems.add(menuItem);
                menu.add(menuItem);

                //Add action listeners to each menu item
                menuItem.addActionListener(this);
            }
        }

        //this.setJMenuBar(menuBar);
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}
