/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto09classecliente;

/**
 *
 * @author aluno
 */
public class Cliente {
    //Atributos que podem Private ou Public(modificador)
   //Por definição no java os Atributos serão Private
    
    private String RG;
    private String nome;
    private String CPF;
    private String cidade;
    private String estado;
    
    //Métodos podem ser Public ou Private(modificador)
    //Por definição no java os metodos serão Public
    // CONTRUTORES
    //contrutor deve ter o mesmo onme da classe 
    // vazio
    public Cliente(){   //construtor obj não acessa o construtor
    
    
    }
    // cheio
    public Cliente(String RG, String nome,String CPF, String cidade, String estado){
    
    this.RG = RG;
    this.nome = nome;
    this.CPF = CPF;
    this.cidade = cidade;
    this.estado = estado;
    }
    
    // GETTERS e STTERS  get não precisa passar parametro , get precisa definir o parametro
    public String getRG(){
        return this.RG;
    }
    public void setRG(String RG){
        this.RG = RG;
    }
        public String getnome(){
        return this.nome;
    }
    public void setnome(String nome){
        this.nome = nome;
    }
        public String getCPF(){
        return this.CPF;
    }
    public void setCPF(String CPF){
        this.CPF = CPF;
    }
        public String getcidade(){
        return this.cidade;
    }
    public void setcidade(String RG){
        this.cidade = cidade;
    }
        public String getestado(){
        return this.estado;
    }
    public void setestado(String estado){
        this.estado = estado;
    }
}
