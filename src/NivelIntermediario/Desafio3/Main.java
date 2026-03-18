package NivelIntermediario.Desafio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int numeroMaximo = 3;
      Ninja[] ninjas = new Ninja[numeroMaximo];

      int ninjasCadastrados = 0;
      int opcao = 0;

      while(opcao != 3){
          // Menu
          System.out.println("\n ===== Menu Ninjas =====");
          System.out.println("1- Cadastrar Ninja");
          System.out.println("2- Listar Informações de Todos os Ninjas");
          System.out.println("3- Sair");
          System.out.println("Escolha uma opcao: ");
          opcao = sc.nextInt();

          switch(opcao){
              case 1:
                  if (ninjasCadastrados < numeroMaximo){
                      System.out.println("O ninja é um Uchira? 1- Sim 2- Não");
                      int claNinja = sc.nextInt();
                      if(claNinja == 1){
                          Uchiha uchiha = new Uchiha();
                          System.out.println("Digite o nome do ninja: ");
                          uchiha.nome = sc.next();
                          System.out.println("Digite a idade do ninja: ");
                          uchiha.idade = sc.nextInt();
                          System.out.println("Digite a missao do ninja: ");
                          uchiha.missao = sc.next();
                          System.out.println("Digite a nivel dificuldade da missao: ");
                          uchiha.nivelDificuldade = sc.next();
                          System.out.println("Digite o status da missao: ");
                          uchiha.statusMissao = sc.next();
                          System.out.println("Digite a habilidade especial do uchiha: ");
                          uchiha.habilidadeEspecial = sc.next();
                          ninjas[ninjasCadastrados] = uchiha;
                          ninjasCadastrados++;
                      } else if (claNinja == 2) {
                          Ninja ninja = new Ninja();
                          System.out.println("Digite o nome do ninja: ");
                          ninja.nome = sc.next();
                          System.out.println("Digite a idade do ninja: ");
                          ninja.idade = sc.nextInt();
                          System.out.println("Digite a missao do ninja: ");
                          ninja.missao = sc.next();
                          System.out.println("Digite a nivel dificuldade da missao: ");
                          ninja.nivelDificuldade = sc.next();
                          System.out.println("Digite o status da missao: ");
                          ninja.statusMissao = sc.next();
                          ninjas[ninjasCadastrados] = ninja;
                          ninjasCadastrados++;
                      }else{
                          System.out.println("Opção invalida!");
                      }
                  }else{
                      System.out.println("A lista de ninjas esta cheia.");
                  }
                  break;
              case 2:
                  if (ninjasCadastrados == 0){
                      System.out.println("Nenhum ninja foi encontrado!");
                  }else{
                      System.out.println("\n ===== Menu Ninjas =====");
                      for (int i = 0; i < ninjasCadastrados; i++) {
                          ninjas[i].mostrarInformacoes();
                      }
                  }
                  break;
              case 3:
                  System.out.println("Saindo...");
                  break;
              default:
                  System.out.println("Opcao invalida!");
          }
      }
    }
}
