package phospital;

public class Principal {

    public static void main(String[] args) {

        Enfermeiroc a1 = new Enfermeiroc ();
 
        System.out.println("Enfermeiro:");
        
        a1.setNome("aaa");
        a1.setRG("88.888.888");
        a1.setCpf("888.888.888.88");
        a1.setIdade(25);
        a1.setMatricula(8888);
        a1.setSenha("8880888");
        a1.setCoren("DF 888 - ENF");
    
        System.out.println("Nomezin:" + a1.getNome());
        System.out.println("RGzin:" + a1.getRG());
        System.out.println("CPFzin:" + a1.getCpf());
        System.out.println("Idadezin:" + a1.getIdade());
        System.out.println("Matricula:" + a1.getMatricula());
        System.out.println("Senha:" + a1.getSenha());
        System.out.println("Coren:" + a1.getCoren());
              
        System.out.println("");
        System.out.println("Médico:");
        
        Medicoc m1 = new Medicoc ();
        
        m1.setNome("bbb");
        m1.setRG("99.999.999");
        m1.setCpf("999.999.999.99");
        m1.setIdade(28);
        m1.setMatricula(9999);
        m1.setSenha("9990999");
        m1.setCRM("DF 999 - MED");
        m1.setEspecialidade("Pediatra");
    
        System.out.println("Nomezin:" + m1.getNome());
        System.out.println("RGzin:" + m1.getRG());
        System.out.println("CPFzin:" + m1.getCpf());
        System.out.println("Idadezin:" + m1.getIdade());
        System.out.println("Matricula:" + m1.getMatricula());
        System.out.println("Senha:" + m1.getSenha());
        System.out.println("CRM:" + m1.getCRM());
        System.out.println("Especialidade:" + m1.getEspecialidade());
        
        System.out.println("");
        System.out.println("Paciente:");
        
        Pacientec p1 = new Pacientec ();
        
        p1.setNome("ccc");
        p1.setRG("77.777.777");
        p1.setCpf("777.777.777.77");
        p1.setIdade(27);
        p1.setCodPaciente(777);
        p1.setSenha("7777");
    
        System.out.println("Nomezin:" + p1.getNome());
        System.out.println("RGzin:" + p1.getRG());
        System.out.println("CPFzin:" + p1.getCpf());
        System.out.println("Idadezin:" + p1.getIdade());
        System.out.println("Codzin:" + p1.getCodPaciente());
        System.out.println("Senha:" + p1.getSenha());    
    }
}
