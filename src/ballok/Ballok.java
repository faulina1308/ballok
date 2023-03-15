/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ballok;

/**
 *
 * @author User
 */
import javax.swing.JOptionPane;
public class Ballok {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String teksP = JOptionPane.showInputDialog("Masukkan nilai panjang = ");
        String teksL = JOptionPane.showInputDialog("Masukkan nilai luas = ");
        String teksT = JOptionPane.showInputDialog("Masukkan nilai tinggi = ");
        
        //medeklarasikan object balook1
        balook balook1 = new balook();
        
        balook1.setPanjang(Double.parseDouble(teksP));
        balook1.setLebar(Double.parseDouble(teksL));
        balook1.setTinggi(Double.parseDouble(teksT));
        
 // balook1.SetUkuraN(Double.parseDouble(teksP),Double.parseDouble(teksL),Double.parseDouble(teksT)
        JOptionPane.showMessageDialog(null,"panjangnya adalah "+balook1.getPanjang() +",lebarnya adalah "+balook1.getLebar() +", tingginya adalah"+balook1.getTinggi());
        balook1.CetakVolume();
        
        //JOptionPane.showMessageDialog(null,"panjangnya adalah "+balook1.getPanjang() +",lebarnya adalah "+balook1.getLebar());
        //balook1.LuasAlas();
        
        //JOptionPane.showMessageDialog(null,"panjangnya adalah "+balook1.getPanjang() +",lebarnya adalah "+balook1.getLebar()+", tingginya adalah"+balook1.getTinggi());
        //balook1.LuasAlas();
        
        
        
        
        
        
    }
    
}
