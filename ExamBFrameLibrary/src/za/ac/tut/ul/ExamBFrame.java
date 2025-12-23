/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.ul;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import model.PracticalCandidate.PracticalCandidate;

/**
 *
 * @author 08188
 */
public class ExamBFrame extends JFrame {

    private JMenuBar menuBar;
    private JMenu TestMenu;
    private JMenu ViewMenu;
    private JMenu HelpMenu;

    private JPanel learnerTestPnl;
    private JPanel LnamePnl;
    private JPanel languagePnl;
    private JPanel durationPnl;
    private JPanel EnviromentPnl;
    private JPanel IDEsPnl;
    private JPanel ActionsPnl;
    private JPanel BtnRadPnl;
    private JPanel BtnPnl;
    private JPanel NotePnl;
    private JPanel DetailsPnl;
    private JPanel learnerTestEnviromentCombinedPnl;
    private JPanel ActionsNoteCombinedPnl;
    private JPanel mainPnl;

    private JLabel LnameLbl;
    private JLabel languageLbl;
    private JLabel durationLbl;
    private JLabel noteLbl;
    private JLabel darkModeLbl;
    private JLabel disableLbl;

    private JTextField LnameTxt;

    private JComboBox languageBox;
    private JComboBox DurationBox;

    private ButtonGroup btnGrp;

    private JRadioButton intelliID;
    private JRadioButton Eclipse;
    private JRadioButton VsCode;

    private JCheckBox darkMode;
    private JCheckBox disableInternet;

    private JButton beginT;
    private JButton saveC;
    private JButton cancel;
    private JButton reset;
    private JButton verify;

    private JTextArea details;
    private JScrollPane detailsScroll;
    
  private ArrayList<PracticalCandidate> candidate;
    
    public ExamBFrame() {

        setTitle("Exam B");
        setSize(700, 800);
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setDefaultLookAndFeelDecorated(true);

        // Initialize menu bar and menus
        candidate = new ArrayList<>();
       
        
        
        menuBar = new JMenuBar();

        TestMenu = new JMenu("Test");
        ViewMenu = new JMenu("View");
        HelpMenu = new JMenu("Help");

        menuBar.add(TestMenu);
        menuBar.add(ViewMenu);
        menuBar.add(HelpMenu);

        setJMenuBar(menuBar);

        // Initialize panels
        learnerTestPnl = new JPanel(new GridLayout(3, 1, 1, 1));
        learnerTestPnl.setBorder(new TitledBorder(new LineBorder(Color.red, 1), "learner & Test"));

        LnamePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        languagePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        durationPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));

        EnviromentPnl = new JPanel(new GridLayout(1, 1, 1, 1));
        EnviromentPnl.setBorder(new TitledBorder(new LineBorder(Color.RED, 1), "Enviroment"));

        BtnRadPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        learnerTestEnviromentCombinedPnl = new JPanel(new BorderLayout());

        ActionsPnl = new JPanel(new GridLayout(1, 1, 1, 1));
        ActionsPnl.setBorder(new TitledBorder(new LineBorder(Color.RED, 1), "Actions"));

        BtnPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));

        NotePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        ActionsNoteCombinedPnl = new JPanel(new BorderLayout());

        DetailsPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));

        // Initialize components
        LnameLbl = new JLabel("Learner Name:        ");
        languageLbl = new JLabel("Language:         ");
        durationLbl = new JLabel("Duration:         ");

        // Initialize text field that was missing
        LnameTxt = new JTextField(20);

        languageBox = new JComboBox();
        languageBox.addItem("Java");
        languageBox.addItem("Python");

        DurationBox = new JComboBox();
        DurationBox.addItem("60 min");
        DurationBox.addItem("90 min");
        DurationBox.addItem("120 min");

        darkModeLbl = new JLabel("Dark Mode");
        disableLbl = new JLabel("Disable Internet");

        noteLbl = new JLabel("Note: Practical task are auto-saved every 5 minutes");

        intelliID = new JRadioButton("IntelliJ IDEA");
        Eclipse = new JRadioButton("Eclipse");
        VsCode = new JRadioButton("VS Code");

        btnGrp = new ButtonGroup();
        btnGrp.add(intelliID);
        btnGrp.add(Eclipse);
        btnGrp.add(VsCode);

        darkMode = new JCheckBox();
        disableInternet = new JCheckBox();

        beginT = new JButton("Begin Test");
        saveC = new JButton("Save Config");
        cancel = new JButton("Cancel");
       
        reset = new JButton("Reset"); // 1.1 Added Reset button
       
        verify = new JButton("Verify"); // 1.5 Added Verify button

        details = new JTextArea(10, 50); // Increased columns for better visibility
        details.setBorder(new TitledBorder(new LineBorder(Color.RED, 1), "Details"));
        detailsScroll = new JScrollPane(details, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        
        mainPnl = new JPanel(new BorderLayout());

        // Build the UI hierarchy
        // Learner & Test panel
        LnamePnl.add(LnameLbl);
        LnamePnl.add(LnameTxt);

        languagePnl.add(languageLbl);
        languagePnl.add(languageBox);

        durationPnl.add(durationLbl);
        durationPnl.add(DurationBox);

        learnerTestPnl.add(LnamePnl);
        learnerTestPnl.add(languagePnl);
        learnerTestPnl.add(durationPnl);

        // Environment panel
        BtnRadPnl.add(intelliID);
        BtnRadPnl.add(Eclipse);
        BtnRadPnl.add(VsCode);
        BtnRadPnl.add(darkMode);
        BtnRadPnl.add(darkModeLbl);
        BtnRadPnl.add(disableInternet);
        BtnRadPnl.add(disableLbl);

        EnviromentPnl.add(BtnRadPnl);

        // Actions panel - Added Reset and Verify buttons
        BtnPnl.add(beginT);
        BtnPnl.add(saveC);
        BtnPnl.add(cancel);
        BtnPnl.add(reset); // 1.1 Added Reset button to panel
        BtnPnl.add(verify); // 1.5 Added Verify button to panel

        ActionsPnl.add(BtnPnl);

        // Note panel
        NotePnl.add(noteLbl);

        // Details panel
        DetailsPnl.add(detailsScroll);

        // Combine panels
        learnerTestEnviromentCombinedPnl.add(learnerTestPnl, BorderLayout.NORTH);
        learnerTestEnviromentCombinedPnl.add(EnviromentPnl, BorderLayout.CENTER);

        ActionsNoteCombinedPnl.add(ActionsPnl, BorderLayout.NORTH);
        ActionsNoteCombinedPnl.add(NotePnl, BorderLayout.CENTER);
        ActionsNoteCombinedPnl.add(DetailsPnl, BorderLayout.SOUTH); // Add details to the combined panel

        mainPnl.add(learnerTestEnviromentCombinedPnl, BorderLayout.NORTH);
        mainPnl.add(ActionsNoteCombinedPnl, BorderLayout.CENTER);

        // Add action listeners
        reset.addActionListener(new btnResetB()); // 1.1 Reset button listener
        cancel.addActionListener(new ClearBtnLis()); // 1.2 Cancel button listener
        beginT.addActionListener(new beginLogin()); // 1.4 Begin Test listener
        verify.addActionListener(new btnVerify()); // 1.5 Verify button listener

        add(mainPnl);
        pack();
        setVisible(true);
    }
    
    // 1.1 Reset Button Implementation
    public class btnResetB implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
             LnameTxt.setText("");
             languageBox.setSelectedItem("Java");
             DurationBox.setSelectedItem("60 min");
             btnGrp.clearSelection();
             darkMode.setSelected(false);
             disableInternet.setSelected(false);
             details.setText("");
        }
    }
    
    // 1.2 Exit Behavior - Cancel Button
    public class ClearBtnLis implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }
    
    // 1.4 Begin Test Logging
   public class beginLogin implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        String learnerName = LnameTxt.getText().trim();
        String duration = (String) DurationBox.getSelectedItem();
        String language = (String) languageBox.getSelectedItem();
        
        // Get selected IDE
        String selectedIDE = "None";
        if (intelliID.isSelected()) {
            selectedIDE = "IntelliJ IDEA";
        } else if (Eclipse.isSelected()) {
            selectedIDE = "Eclipse";
        } else if (VsCode.isSelected()) {
            selectedIDE = "VS Code";
        }
        
        // Get internet status using if statements
        String internetStatus;
        if (disableInternet.isSelected()) {
            internetStatus = "disabled";
        } else {
            internetStatus = "enabled";
        }
        
        // Append the required lines to details
        details.append(learnerName + " has started the practical\n");
        details.append("Duration " + duration + "\n");
        details.append("Language " + language + "\n");
        details.append("IDE " + selectedIDE + "\n");
        details.append("Internet: " + internetStatus + "\n\n");
    }
}    
    // 1.5 Verification Button
    public class btnVerify implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            String candidateName = LnameTxt.getText().trim();
            String duration = (String) DurationBox.getSelectedItem();
            
            // Validate candidate name length (between 3 and 30 inclusive)
            boolean nameValid = candidateName.length() >= 3 && candidateName.length() <= 30;
            
            // Validate duration is one of the allowed values
            boolean durationValid = duration.equals("60 min") || 
                                  duration.equals("90 min") || 
                                  duration.equals("120 min");
            
            // Both validations must pass
            if (nameValid && durationValid) {
                details.append("verified\n");
            } else {
                details.append("Not verified\n");
            }
        }
    }
}