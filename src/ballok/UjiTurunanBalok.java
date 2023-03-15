/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ballok;

/**
 *
 * @author User
 */
import javax.swing.JOptionPane;
public class UjiTurunanBalok {
    
    public static void main(String[] args) {
        TurunanBalok tbalok = new TurunanBalok(2, 3, 4, 5);
        tbalok.CetakVolume();
        tbalok.CetakUkuran();
        
        JOptionPane.showMessageDialog(null, "Beratnya adalah " +tbalok.getBerat());
    }
    
}
