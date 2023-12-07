import java.util.Date;


public class Funcionario {

    private String nome;
    private String cpf;
    private Date dataNascimento;
    private float salario;


    public void setNome(String nome) {

        this.nome = nome;
    }

    public String getNome() {

        return nome;
    }

    public void setCpf(String cpf) {
        
        this.cpf = cpf;
    }

    public String getCpf() {

        return cpf;
    }

    public void setDataNascimento(Date dataNascimento) {

        this.dataNascimento = dataNascimento;
    }

    public Date getDataNascimento() {

        return dataNascimento;
    }

    public void setSalario(float salario) {

        this.salario = salario;
    }

    public float getSalario() {

        return salario;
    }  

}
