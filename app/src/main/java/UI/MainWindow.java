package UI;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class MainWindow extends JFrame implements ActionListener{

    //Constant variables and PATHs
    static String RESOURCES_PATH = "../resources/"; 
    
    //Menu Declarations
    JMenuBar menuBar;
    ArrayList<JMenu> menus = new ArrayList<>();
    ArrayList<JMenuItem> menuItems = new ArrayList<>();

    //Tabbed Page Declarations
    JTabbedPane tabbedPane;
    ArrayList<JPanel> tabbedPanels = new ArrayList<>();

    //Constructor
    public MainWindow(){
        //Default settings for main application window
        this.setTitle("Finance Manager");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        

        //Layout for main frame
        this.setLayout(new BorderLayout());
        this.setSize(600,600);

        //Main Window menu bar
        this.configureMenuBar();
        this.configureTabbedMenus();
        

        //Finally display the window
        this.setResizable(false);
        this.setVisible(true);
         
    }

    //Set up the menu bar for the main application
    private void configureMenuBar(){
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
            try {
                for (String menuItemName : menuItemNames[i]){
                    //Dynamically add the menu items to the menus and menuItems list
                    JMenuItem menuItem = new JMenuItem(menuItemName);
                    menuItems.add(menuItem);
                    menu.add(menuItem);
    
                    //Add action listeners to each menu item
                    menuItem.addActionListener(this);
                }
            } catch (IndexOutOfBoundsException e) {
                break;
            }
    
        }

        //this.setJMenuBar(menuBar);
        this.revalidate();
        this.repaint();
    }

    //Set up the tabbed panel for the Main Application
    private void configureTabbedMenus(){
        
        tabbedPane = new JTabbedPane(JTabbedPane.LEFT);

        JPanel homePanel = new JPanel();
        JPanel updatePanel = new JPanel();


        tabbedPane.addTab("Home", null, homePanel, null);
        tabbedPane.addTab("Update", null, updatePanel, null);

        this.add(tabbedPane, BorderLayout.CENTER);


        this.revalidate();
        this.repaint();
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}
