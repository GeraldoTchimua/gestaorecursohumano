package rh.controle;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import rh.modelo.Funcionario;

/**
 *
 * @author GENATCHI
 */
@Named(value = "funcionarioMBean")
@RequestScoped
public class FuncionarioMBean {

    Funcionario funcionario1 = new Funcionario("Geraldo","Genatchi","Informatica",45,5000.00);
    Funcionario funcionario2 = new Funcionario("Samuel","PCS","Direito",30,200000.00);
    Funcionario funcionario3 = new Funcionario("Gaudencio","Wassuca","Filosofia",25,200000.00);
    
    List<Funcionario> funcionarios = new ArrayList<>();

    @PostConstruct
    public void init() {
        funcionarios.add(funcionario1);
        funcionarios.add(funcionario2);
        funcionarios.add(funcionario3);
    }
    
    

   /* public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }*/

    //depois de clicar no botao guardar, o clique nos leva a uma pagina de nome resultado
    /*public String guardar() {

        return "resultado";
    }*/

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

}
