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
public class TurunanBalok extends balook {
    
    private double berat;
    
    public double getBerat() {
        return berat;
    }
    
    public void setBerat(double berat){
        this.berat = berat;
    }
    
    public TurunanBalok(double berat, double p, double l,double t){
        super(p, l, t);
        this.berat = berat;
    }
    
    @Override
    public void CetakUkuran() {
        super.CetakUkuran();
        JOptionPane.showMessageDialog(null, "Beratnya adalah " +berat);
    }
    
    
    
}
