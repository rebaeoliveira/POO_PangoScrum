import java.util.List;
import java.util.Scanner;
/*Como gerente, gostaria de poder 
cadastrar novos funcionários no sistema, 
fornecendo informações como nome, 
endereço, telefone, e-mail, cargo e 
salário */
public class UsaGerente {

    public static void main(String[] args){
        
        Gerente funcionario1= new Gerente("Jesus", " F115658", "7078758754", "Casacavel", "45 987654231", "sifontesj@hotmail.com", 19852);
        
        funcionario1.cadastrarFuncionario(funcionario1);

        funcionario1.definirPermissoes(funcionario1);

        Atividade funcionario1HabAtividade = new Atividade("Analista de Sistema", "Soporte a Funcionario", 20);
        funcionario1HabAtividade.adicionarHorarioDisponivel("Amanha e Tarde");
        
        
    }


    
    
}
