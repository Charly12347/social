package test;

import java.io.File;
import java.io.IOException;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollBar;

import engine.process.EvolutionElementManager;

public class Main extends JFrame{

    public static void main(String[] args) throws IOException {
        JFrame rJFrame = new JFrame();
        DefaultListModel<String> l1 = new DefaultListModel<String>(); 
        String file = "./src/fichiers/noms individus social.csv";
        File f = new File(file);
        String file2 = "./src/fichiers/personnality.csv";
        File f2 = new File(file2);

        for(int i=0; i<100; i++) {
            String nom = "";
            try {
                nom = EvolutionElementManager.generateNom(f);
            } catch (IOException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
            String prenom="";
            try {
                prenom = EvolutionElementManager.generatePrenom(f);
            } catch (IOException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
            String personnality="";
            try {
                personnality = EvolutionElementManager.generatePersonnality(f2);
            } catch (IOException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
            String a = "Last name = " + nom + " ,First Name = " + prenom +" ,Personnality = "+personnality+"\n";
            l1.addElement(a);
        }

        //JScrollBar jsp = new JScrollBar();
        //jsp.setBounds(100,100,100,100);
        JList<String> list = new JList<String>(l1);
        list.setBounds(20,20,600,600);
        rJFrame.add(list);
        //rJFrame.add(jsp);
        rJFrame.setSize(700,700);
        rJFrame.setLayout(null);
        rJFrame.setVisible(true);
    }
}