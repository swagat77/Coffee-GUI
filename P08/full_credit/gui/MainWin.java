 package gui;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import javax.swing.JToolBar;
import javax.swing.JButton;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import java.awt.Font;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.awt.image.BufferedImage;

import java.io.File;
import java.io.IOException;

import store.Store;
import store.Product;
import store.Donut;
import store.Frosting;
import store.Filling;
import store.Java;
import store.Darkness;
import store.Shot;

public class MainWin extends JFrame {

    // ///////////////////////////////////////////////////////////////////
    // Constructors

    public MainWin(String title) {
        super(title);
        store = new Store("JADE");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        
        // /////// ////////////////////////////////////////////////////////////////
        // M E N U
        // Add a menu bar to the PAGE_START area of the Border Layout

        JMenuBar menubar = new JMenuBar();
        submenu=new JmenuBar();
        JMenuItem a1,a2,a3,a4;
        JMenu     mFile    = new JMenu("File");
        JMenuItem mQuit    = new JMenuItem("Quit");
        JMenu     mCreate  = new JMenu("Create");
        JMenuItem mJava    = new JMenuItem("Java");
        JMenuItem mDonut   = new JMenuItem("Donut");
        JMenu     mHelp    = new JMenu("Help");
        JMenuItem mAbout   = new JMenuItem("About");
        JMenu mNew    = new JMenu("New");
        JMenum Open   = new JMenu("Open");
        JMenu mSave   = new JMenu("Save");
        JMenu mSaveas = new JMenu("Save as");
        mFile.add(mNew);
        mFile.add(mOpen);
        mFile.add(mSave);
        mFile.add(mSaveas);
        
        mQuit .addActionListener(event -> onQuitClick());
        mJava .addActionListener(event -> onCreateJavaClick());
        mDonut.addActionListener(event -> onCreateDonutClick());
        mAbout.addActionListener(event -> onAboutClick());

        
        mFile  .add(mQuit);
        mCreate.add(mJava);
        mCreate.add(mDonut);
        mHelp  .add(mAbout);
        
        menubar.add(mFile);
        menubar.add(mCreate);
        menubar.add(mHelp);
        
        setJMenuBar(menubar);
        
        // ///////////// //////////////////////////////////////////////////////////
        // T O O L B A R
        // Add a toolbar to the PAGE_START region below the menu
        JToolBar toolbar = new JToolBar("JADE Controls");

        // Create the 3 buttons using the icons provided
        bJava  = new JButton(new ImageIcon("gui/resources/new_java.png"));
          bJava.setActionCommand("Create new Java");
          bJava.setToolTipText("Create a new coffee selection");
          toolbar.add(bJava);
          bJava.addActionListener(event -> onCreateJavaClick());

        bDonut = new JButton(new ImageIcon("gui/resources/new_donut.png"));
          bDonut.setActionCommand("Create new donut");
          bDonut.setToolTipText("Create a new donut selection");
          toolbar.add(bDonut);
          bDonut.addActionListener(event -> onCreateDonutClick());

        JButton bAbout = new JButton(new ImageIcon("gui/resources/about.png"));//I have used suggested soltion from sprint 2 
          bAbout.setActionCommand("About JADE Manager");
          bAbout.setToolTipText("About JADE Manager");
          toolbar.add(bAbout);
          bAbout.addActionListener(event -> onAboutClick());

        getContentPane().add(toolbar, BorderLayout.PAGE_START);
        
        
        // /////////////////////////// ////////////////////////////////////////////
        // D A T A   D I S P L A Y
        // Provide a text entry box to show output
        data = new JLabel();
        data.setFont(new Font("SansSerif", Font.BOLD, 12));
        add(data, BorderLayout.CENTER);

        // S T A T U S   B A R   D I S P L A Y ////////////////////////////////////
        // Provide a status bar for game messages
        msg = new JLabel();
        add(msg, BorderLayout.PAGE_END);
        
        // Initialize the dislay
        updateDisplay();
        
        // Make everything in the JFrame visible
        setVisible(true);
    }
    
    // ///////////////////////////////////////////////////////////////////
    // Action Listeners
    
    protected void onCreateJavaClick() {  // Create a new Java product
        try {
            String name = getString("Java name?");
            double price = getDouble("Price?");
            double cost = getDouble("Cost?");
            Darkness darkness = (Darkness) selectFromArray("Darkness?", Darkness.values());
            Java java = new Java(name, price, cost, darkness);
            while(true) {
                Shot shot = (Shot) selectFromArray("Shot?", Shot.values());
                if(shot.equals(Shot.None)) break;
                java.addShot(shot);
            }
            store.addProduct(java);
            updateDisplay();
        } catch (CancelDialogException e) { // ignore a Cancel
        } catch(Exception e) {
            msg.setText("Failed to create new Java: " + e.getMessage());
        }
    }
    protected void onSaveClick(){  //from the lecture
 final   jFileChooser in=new JFileChooser(filename);
 FileFilter files= new FileNameExtensionFilter(" Jade Files","Jade");
 in.addChoosableFileFilter(files);
 in.setFileFilter(files);
 int result=in.showSaveDialog(this);
 if(result==JFileChooser.APPROVE_OPTION){
   filename=in.getSelectedFile();
        if(!filename=new File(filename.getAbsolutePath()+".jade");
   onSaveClick();

 }
 }
 protected void onSaveAsClick(){
  final JFileChooser in= new JFileChooser(filename);
 FileFilter files= new FileNameExtensionFilter(" Jade Files","Jade");
 in.addChoosableFileFilter(files);
 in.setFileFilter(files);
 int result=in.showSaveDialog(this);
 if(result==JFileChooser.APPROVE_OPTION){
   filename=in.getSelectedFile();
        if(!filename.getAbsolutePath().edsWith(".jade+");
        filename= new File(filename.getAbsolutePath()+".jade");
   onSaveClick();
   }
   } 
   protected void onOpenClick(){ //from lecture 15
   JFileChooser in=new  JFileChooser(filename);
   FileFilter files =new FileNameExtensionFilter("Jade files","Jade");
   in.addChoosableFileFilter(files);
   in.setFileFilter(files);
   int result= in.showOpenDialog(this);
   if(result==JFileChooser.APPROVE_OPTION){
   filename=in.getSelectedFile();
   try(BufferedReader ab=new BufferedReader(new FileReader(filename))){
   jade=new jade(ab);
   if(computer.isSelected())
        computer.doClick();
        setSticks();
        }
        catch(Exception e){
        JoptionPane.showMessageDialog(this,"Unable to open"+filename+"\n"+e,"Failed",JoptionPane.ERROR_MESSAGE);
        }
     }
  }
        protected void onNewClick(){
        MainWin b=new MainWin();// calling functions so that the new game reiterates the main windowas before
        b.MainWin();
       }
        
   
    protected void onCreateDonutClick() {  // Create a new Java product
        try {
            String name = getString("Donut name?");
            double price = getDouble("Price?");
            double cost = getDouble("Cost?");
            Frosting frosting = (Frosting) selectFromArray("Select a Frosting", Frosting.values());
            Filling filling = (Filling) selectFromArray("Select a Filling", Filling.values());
            String[] options = {"No Sprinkles", "Sprinkles"};
            boolean sprinkles = (JOptionPane.showOptionDialog(this, "Sprinkles?", "", 
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, options, options[0]) == 1);
            store.addProduct(new Donut(name, price, cost, frosting, filling, sprinkles));
            updateDisplay();
        } catch (CancelDialogException e) { // ignore a Cancel
        } catch(Exception e) {
            msg.setText("Failed to create new Donut: " + e);
        }
    }
            
    protected void onAboutClick() {                 // Display About dialog //have used suggested solution from sprint 2
        JDialog about = new JDialog();
        about.getContentPane().setLayout(new BoxLayout(about.getContentPane(), BoxLayout.PAGE_AXIS));
        about.setTitle("Java and Donut Express");
        about.setSize(640,600);
        
        try {
            BufferedImage myPicture = ImageIO.read(new File("gui/resources/logo.png"));
            JLabel logo = new JLabel(new ImageIcon(myPicture));
            logo.setAlignmentX(JLabel.CENTER_ALIGNMENT);
            about.add(logo);
        } catch(IOException e) {
        }
        
        JLabel title = new JLabel("<html>"
          + "<p><font size=+3>Java and Donut Express</font></p>"
          + "</html>");
        title.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        about.add(title);
//i have used suggested solution from sprint 2 which belongs to professor rice
        JLabel copyright = new JLabel("<html>"
          + "<p>Version 0.2</p>"
          + "<p>Copyright 2021 by George F. Rice</p>"
          + "<p>Licensed under Gnu GPL 3.0</p>"
          + "<br/>"
          + "</html>");
        copyright.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        about.add(copyright);
                    
       JLabel artists = new JLabel("<html>"
          + "<p>JADE Logo by SaxDeux, licensed under CC BY-SA 3.0</p>"
          + "<p><font size=-2>https://commons.wikimedia.org/wiki/File:Logo_JADE.png</p>"
          + "<p>Flat Coffee Cup Icon by superawesomevectors, licensed under CC BY-SA 3.0</p>"
          + "<p><font size=-2>http://fav.me/dbf6otc</p>"
          + "<p><font size=-2>https://creativecommons.org/licenses/by-sa/3.0/us/</p>"
          + "<p>Donut Icon by Hazmat2 via Hyju, public domain</p>"
          + "<p><font size=-2>https://en.wikipedia.org/wiki/File:Simpsons_Donut.svg</p>"
          + "<p>Help Icon by Vector Stall via the Flat Icon license</p>"
          + "<p><font size=-2>https://www.flaticon.com/premium-icon/question-mark_3444393</p>"
          + "<br/>"
          + "</html>");
        artists.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        about.add(artists);
//i have used suggested solution from sprint 2 which belongs to professor rice
        JButton ok = new JButton("OK");
        ok.setAlignmentX(JButton.CENTER_ALIGNMENT);
        ok.addActionListener(event -> about.setVisible(false));
        about.add(ok);
        
        about.pack();
        about.setVisible(true);
     }
    protected void onQuitClick() {dispose();}  

    // ///////////////////////////////////////////////////////////////////
    // Utilities
    
    // Thrown if the Cancel button on a dialog is clicked
    protected class CancelDialogException extends Exception {
        public CancelDialogException() {
            super("Dialog canceled");
        }
    }
    private String getString(String prompt) throws CancelDialogException {
        String newPrompt = prompt;
        while(true) {
            try {
                newPrompt = JOptionPane.showInputDialog(this, newPrompt);
                if(newPrompt == null || newPrompt.length() == 0) 
                    throw new CancelDialogException();
                break;
            } catch (CancelDialogException e) {
                throw e;  // Rethrow to signal Cancel was clicked
            } catch (Exception e) {
                newPrompt = "ERROR: Invalid string '" + newPrompt + "\n" + prompt;
            }
        }
        return newPrompt;
    }
    
    private double getDouble(String prompt) throws CancelDialogException {
        String newPrompt = prompt;
        double result = 0.0;
        while(true) {
            try {
                newPrompt = JOptionPane.showInputDialog(this, newPrompt);
                if(newPrompt == null) throw new CancelDialogException();
                result = Double.parseDouble(newPrompt);
                break;
            } catch (CancelDialogException e) {
                throw e;  // Rethrow to signal Cancel was clicked
            } catch (Exception e) {
                newPrompt = "ERROR: Invalid double '" + newPrompt + "\n" + prompt;
            }
        }
        return result;
    }
    
    private Object selectFromArray(String prompt, Object[] options) throws CancelDialogException {
        JComboBox<Object> comboEnum = new JComboBox<>();
        comboEnum.setModel(new DefaultComboBoxModel<Object>(options));
        int button = JOptionPane.showConfirmDialog(this, comboEnum, prompt, 
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(button == JOptionPane.CANCEL_OPTION) throw new CancelDialogException();
        return comboEnum.getSelectedItem();
    }
    
    private void updateDisplay() {
        data.setText("<html>" + store.toString()
                                     .replaceAll("<","&lt;")
                                     .replaceAll(">", "&gt;")
                                     .replaceAll("\n", "<br/>")
                              + "</html>");
    }

    // ///////////////////////////////////////////////////////////////////
    // Main

    public static void main(String[] args) {
        MainWin myApp = new MainWin("JADE");
        myApp.setVisible(true);
    }
    
    // ///////////////////////////////////////////////////////////////////
    // Attributes

    private Store store;
    private File filename;
    private JLabel data;                    // Display of output in main window
    private JLabel msg;                     // Status message display
    private JButton bJava;                  // Button to select 1 stick
   private JButton bDonut;                 // Button to select 2 sticks
   private jButton bNew;
   private jButton bOpen;
   private jButton bSave;
   private jButton bSaveas;
   
