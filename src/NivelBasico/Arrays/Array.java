package Arrays;

public class Array {
    public static void main(String[] args) {
        /*
        * Arrays: É um objeto do tipo referencia que contem um numero FIXO de componentes do MESMO tipo;
        * O comprimento é imutavel;
        * Criar um array requer o conhecimento do seu comprimento e do tipo de cada compomentes
        * Quando nao temos nada alocado no espaço do Array ele inicializa vazio, conforme sua tipagem
        */

        // Array ninjas
        String[] ninjas = new String[5];
        ninjas[0] = "Naruto";
        ninjas[1] = "Sasuke";
        ninjas[2] = "Sakura";
        ninjas[3] = "Hinata";
        System.out.println(ninjas[0]);

        // Redeclarar o Array
        ninjas = new String[3];
        ninjas[0] = "Boruto";
        ninjas[1] = "Sarada";
        ninjas[2] = "Mizuke";
        System.out.println(ninjas[0]);

        // For para fazer um LOOP no Array
        for (int i = 0; i < 3; i++) {
            System.out.println(ninjas[i]);
        }

        // Array idade
        int[] idades = new int[2];
        idades[0] = 16;
        idades[1] = 17;
        System.out.println(idades[0]);

        // Array verdadeiroFalso
        boolean[] verdaderioFalso = new boolean[2];
        verdaderioFalso[0] = true;
        System.out.println(verdaderioFalso[0]);

        // Array 2D
        String[][] ninjasEAldeias = new String[3][3];
        ninjasEAldeias[0][0] = "Konaha";
        ninjasEAldeias[0][1] = "Naruto";
        ninjasEAldeias[0][2] = "Sasuke";

        ninjasEAldeias[1][0] = "Nevoa";
        ninjasEAldeias[1][1] = "Zabuza";
        ninjasEAldeias[1][2] = "Haku";

        ninjasEAldeias[2][0] = "Areia";
        ninjasEAldeias[2][1] = "Gaara";
        ninjasEAldeias[2][2] = "Temari";

        for (int i = 0; i < ninjasEAldeias.length; i++) {
            System.out.println(ninjasEAldeias[i][0]);
            System.out.println(ninjasEAldeias[i][1]);
            System.out.println(ninjasEAldeias[i][2]);
            System.out.println("==========");
        }
    }
}
