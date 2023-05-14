/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pappa.hedda.projekt;
import java.util.logging.Level;
import java.util.logging.Logger;
import oru.inf.InfDB;
import oru.inf.InfException;


/**
 *
 * @author Hedda Alm
 */
public class PappaHeddaProjekt {
    
    private static InfDB inf;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try { 
           inf = new InfDB("mibdb", "3306", "mibdba", "mibkey");
           LoginForm lf = new LoginForm(inf);
           lf.setVisible(true); 
        }
        catch(InfException ex) {
          Logger.getLogger (PappaHeddaProjekt.class.getName()).log(Level.SEVERE, null, ex);   
        }
       
        // TODO code application logic here
    }
    
}
