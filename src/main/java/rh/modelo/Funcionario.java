
package rh.modelo;

/**
 *
 * @author GENATCHI
 */
public class Funcionario {
    private String nome;
    private String sobrenome;
    private String departamento;
    private int idade;
    private double salario;
    
    /*private double peso;
    private double altura;
    private double imc;*/

    public Funcionario() {
    }

    public Funcionario(String nome, String sobrenome, String departamento, int idade, double salario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.departamento = departamento;
        this.idade = idade;
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    
    
    
    
    
    
    
}
