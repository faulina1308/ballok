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
public class balook {
    //atribut/property
    private double panjang;
    private double lebar;
    private double tinggi;
    
   
    
    //construktor
    public balook(){
        panjang = 1;
        lebar = 1;
        tinggi = 1;
    }
    
    public balook(double p, double l, double t){
        panjang = p;
        lebar = l;
        tinggi = t;
    }
    
    public double getPanjang(){
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public double getTinggi() {
        return tinggi;
    }
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    
    public void setUkuran(double panjang, double lebar, double tinggi){
       this.panjang = panjang;
       this.lebar = lebar;
       this.tinggi = tinggi;
    }
    
    //method/behaviour
    public double HitungVolume() {
        return panjang*lebar*tinggi;
    }
    public double HitungLuasAlas() {
        return panjang*lebar;
    }
    public double HitungLuasPermukaan() {
        return panjang*lebar+lebar*tinggi+tinggi*panjang;
    }
    
    
    public void CetakVolume(){
        JOptionPane.showMessageDialog(null, "volume baloknya adalah "+HitungVolume());     
    }
    //public void LuasAlas(){
        //JOptionPane.showMessageDialog(null, "luas alasnya adalah "+HitungLuasAlas());     
    //}
    //public void LuasPermukaan(){
       // JOptionPane.showMessageDialog(null, "luas permukaannya adalah "+HitungLuasPermukaan());     
    //}
    public void CetakUkuran() {
        JOptionPane.showMessageDialog(null, "Panjangnya : " + panjang);
        JOptionPane.showMessageDialog(null, "Lebarnya : " + lebar);
        JOptionPane.showMessageDialog(null, "Tingginya : " + tinggi);
    }
    
}