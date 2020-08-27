
package rh.controle;

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
    Funcionario funcionario = new Funcionario();

   @PostConstruct
   public void init(){
   }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    
    //depois de clicar no botao guardar, o clique nos leva a uma pagina de nome resultado
    public String guardar(){
        
        return "resultado";
    }
   
   
    
}
