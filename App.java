import cafeteira.Cafeteira;
import status.Status;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Cafeteira!");

        //Passando dados para cafeteira já atribuindo valores de Agua e Cafe
        Cafeteira cafeteira = new Cafeteira();
        
        //Ligando a Cafeteira
        System.out.println("----- Cafeteira ligada? ------");
        Status cafeteiraLigar = null;
        System.out.println(cafeteira.ligar(cafeteiraLigar));

        //Adicionando agua e cafe
        int quantidadeCafe = 100;
        int quantidadeAgua = 250;
        
        System.out.println("\n----- Mostrando Agua e Café adicionados ------");
        cafeteira.encherCafe(quantidadeCafe);
        cafeteira.encherAgua(quantidadeAgua);
        System.out.println("Quantidade de café: "+ cafeteira.getQuantidadeCafe() +" g.\nQuantidade de água: "+ cafeteira.getQuantidadeAgua() +" ml.");
        //Ligando cafeteira apos adicionar agua e café
        System.out.println("\n------ Cafeteira ligada? ------");
        System.out.println(cafeteira.ligar(cafeteiraLigar));

        //Mostrar quantidade de café que ainda da pra fazer
        System.out.println("\n------ Cafés restantes para fazer! ------");
        System.out.println(cafeteira.statusGeral());
    }
}
