// Classe Medico

public class Medico {
    private String nomeMedico;
    private String especialidade;
    private String crm;

    public Medico(String nomeMedico, String especialidade, String crm) {
        this.nomeMedico = nomeMedico;
        this.especialidade = especialidade;
        this.crm = crm;
    }

    public String getNomeMedico() {
        return nomeMedico;
    }

    public void setNomeMedico(String nomeMedico) {
        if(nomeMedico != null){
            this.nomeMedico = nomeMedico;
        } else {
            System.out.println("O nome do médico não pode ser vazio.");
        }
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        if(especialidade != null){
            this.especialidade = especialidade;
        } else {
            System.out.println("A especialidade não pode ser vazia.");
        }
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        if(crm != null){
            this.crm = crm;
        } else {
            System.out.println("O CRM não pode ficar vazio.");
        }
    }

    public void apresentarMedico(){
        System.out.println("Nome do médico: " + nomeMedico);
        System.out.println("Especialidade: " + especialidade);
        System.out.println("CRM: " + crm);
    }
}
