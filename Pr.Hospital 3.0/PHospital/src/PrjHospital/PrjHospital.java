package PrjHospital;

import java.sql.Connection;
import javax.swing.JOptionPane;
import phospital.ConnectionFactory;

public class PrjHospital {
    public static void main(String[] args) {
        
        try {
            Connection con = new ConnectionFactory().getConnection();
            JOptionPane.showMessageDialog(null,"Conectado ao banco!");
            con.close();
            
        } catch(Exception e){
            JOptionPane.showConfirmDialog(null, e);
        }
    }
}
