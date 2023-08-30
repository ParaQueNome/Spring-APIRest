package DIO.APIRest.Java.Repository;


// Classe responsavel por lidar com a tabela e atributos do banco de dados
// Tabela Cliente

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

// Spring JPA Entidade: Definindo uma entidade
@Entity
public class Cliente {
    // Declarando a Primary key Id e adicionando metodo GeneratedValue para auto_increment
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private String cpf;
    // O mesmo endereco pode ser de varias pessoas
    @ManyToOne
    private Endereco endereco;

    public Long getId() {
        return id;
    }   
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public Endereco getEndereco() {
        return endereco;
    }
}