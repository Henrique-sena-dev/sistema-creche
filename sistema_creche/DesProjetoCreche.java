package sistema_creche;

import java.util.Scanner;

public class DesProjetoCreche {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        while (true) {
            
        
         System.out.println("========= Menu Alunos =========");
         System.out.println("1 - Cadastrar aluno");
         System.out.println("2 - Listar alunos");
         System.out.println("0 - Sair ");
        
         System.out.print("Digite a opção desejada:");
         int opcao = ler.nextInt();
         ler.nextLine();
        
        
            switch (opcao) {
             case 1:
                System.out.println("===== cadastro ===== ");
                System.out.print("nome: ");
                String nome = ler.nextLine();
               
                System.out.print(" digite a idade:");
                int idade = ler.nextInt();
               
                System.out.println(" aluno cadastrado ");
                
                break;
             case 2:
                System.out.println("listando alunos...");
                
                break;

             case 0:
                System.out.println("Saindo...");

                break;
              
            }   
            
            
             if (opcao == 0){
                
             break;
             }
                
        }

    
    }
    
}
