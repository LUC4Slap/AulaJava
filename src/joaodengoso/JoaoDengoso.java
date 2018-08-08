package joaodengoso;

import java.util.ArrayList;
import java.util.Scanner;

public class JoaoDengoso {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ArrayList<Doente> bancoDeDados = new ArrayList<Doente>();       
        
        int escolha = 0;
        int sexo, data;
        String rua;
        do{
            System.out.println(" 1 - Cadastro de doente");
            System.out.println(" 2 - Relatorio 1");
            System.out.println(" 3 - Relatorio 2");
            System.out.println(" 4 - Relatorio 3");
            System.out.println(" 5 - Relatorio 4");
            System.out.println("Digite 0 para sair!!!!");
            System.out.println("Digite o numero da sua opção: ");
            escolha = ler.nextInt();


            switch(escolha){
                case 1: 

                    Doente novoDoente = new Doente();

                    System.out.println("Qual seu sexo? 0/1");
                    sexo = ler.nextInt();
                    novoDoente.setSexo(sexo);

                    System.out.println("Qual a sua data de nascimeto? (somente numero)");
                    data = ler.nextInt();
                    novoDoente.setDataNacimento(data);

                    System.out.println("Qual sua rua: ");
                    rua = ler.next();               
    //                novoDoente.setEndereco(endi);

                    System.out.println("Informe seu bairro: ");
                    String bairro = ler.next();

                    Endereco endi = new Endereco(rua, bairro);
                    novoDoente.setEndereco(endi);

                    bancoDeDados.add(novoDoente);

            }
        }while(escolha != 0);
        
        System.out.println(bancoDeDados.size());
    }    
}
