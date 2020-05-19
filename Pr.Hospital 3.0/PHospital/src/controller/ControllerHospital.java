package controller;

import java.util.ArrayList;
import phospital.Hospital;
import phospital.HospitalDAO;

public class ControllerHospital {
    public void CadastrarHospital (Hospital hospital){
        HospitalDAO hDAO = new HospitalDAO();
        hDAO.cadastrar(hospital);
    }
    
    public ArrayList<Hospital> ListarHospital (){
        HospitalDAO hDAO = new HospitalDAO();
        return hDAO.buscar();
    }
}
