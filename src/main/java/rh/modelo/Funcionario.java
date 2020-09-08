    
package rh.modelo;

import java.util.Date;

/**
 *
 * @author GENATCHI
 */
public class Funcionario {
    private String nome;
    private String sobrenome;
    private Departamento departamento;
    private Date dataNascimento;
    private double salario;
    private  String casa;
    private String rua;
    private String bairro;
    private Municipio municipio;
    
    /*private double peso;
    private double altura;
    private double imc;*/

    public Funcionario() {
    }

    public Funcionario(String nome, String sobrenome, String departamento, double salario) {
        this.nome = nome;
        this.sobrenome = sobrenome;       
        
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
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

    public String getCasa() {
        return casa;
    }

    public void setCasa(String casa) {
        this.casa = casa;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public Municipio getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }

 

    
    
    
    
    
    
    
}
