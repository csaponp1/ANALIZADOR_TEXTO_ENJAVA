/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manejo_cadenas;
import java.io.File;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;




/**
 *
 * @author Sapón Pérez
 */
public class File_chooser {
    

 


   
    public static void main(String[] args) {
    	File_Chooser_Window();
    }
        
        private static void File_Chooser_Window() {
         
        JFrame File_Chooser_Frame = new JFrame("File Chooser");
        File_Chooser_Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Create_UI(File_Chooser_Frame);
        File_Chooser_Frame.setSize(560, 200);
        File_Chooser_Frame.setLocationRelativeTo(null);
        File_Chooser_Frame.setVisible(true);
    }


    private static void Create_UI(final JFrame File_Chooser_Frame){
        JPanel File_Chooser_Panel = new JPanel();
        LayoutManager Layout_Manager = new FlowLayout();
        File_Chooser_Panel.setLayout(Layout_Manager);

        JButton Choose_Button = new JButton("Choose File");
        final JLabel J_Label = new JLabel();

        Choose_Button.addActionListener(new ActionListener() {
         @Override
            
            public void actionPerformed(ActionEvent e) {
                JFileChooser J_File_Chooser = new JFileChooser();
                J_File_Chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
                int option = J_File_Chooser.showOpenDialog(File_Chooser_Frame);
                if(option == JFileChooser.APPROVE_OPTION){
                    File file = J_File_Chooser.getSelectedFile();
                    J_Label.setText("Selected: " + file.getName());
                }
                else{
                	J_Label.setText("Command Canceled");
                }
            }
        });

        File_Chooser_Panel.add(Choose_Button);
        File_Chooser_Panel.add(J_Label);
        File_Chooser_Frame.getContentPane().add(File_Chooser_Panel, BorderLayout.CENTER);
    }
}
    

