package cafeteira;

import status.*;

public class Cafeteira {
    private int quantidadeAgua;
    private int quantidadeCafe;
    private Status statusCafeteira;     // Enum para o Status da cafeteira..

    public Cafeteira(int quantidadeAgua, int quantidadeCafe) {
        this.quantidadeAgua = quantidadeAgua;
        this.quantidadeCafe = quantidadeCafe;
    }

    public Cafeteira()
    {

    }

    //inicio dos metodos adicionais -----------------------------------------
    public Status ligar(Status ligada)
    {
        if(this.quantidadeAgua >= 30 && this.quantidadeCafe >= 7)
        {
            return ligada.LIGADA;
        }
        else
        {
            if(this.quantidadeAgua < 30)
            {
                System.out.println(statusCafeteira.REPOR_AGUA.getNome());
                System.out.println("Quantidade adicionada: "+ this.quantidadeAgua +" ml.");
            }
            if(this.quantidadeCafe < 7)
            {
                System.out.println(statusCafeteira.REPOR_CAFE.getNome());
                System.out.println("Quantidade adicionada: "+ this.quantidadeCafe +" g.");
            }
            return ligada.DESLIGADA;
        }
    }

    public Status desligar(Status ligada)
    {
        return ligada.DESLIGADA;
    }

    public void encherCafe(int quantidade)
    {
        this.quantidadeCafe += quantidade;
    }

    public void encherAgua(int quantidade)
    {
        this.quantidadeAgua += quantidade;
    }

    public int statusGeral()
    {
        int statusCafe = 0;
        if(quantidadeAgua >= 30)
        {
            for(int i=29; i<this.quantidadeAgua;)
            {
                for(int j=6 ; j<this.quantidadeCafe;)
                {
                    statusCafe += 1;
                    quantidadeAgua -= 30;
                    quantidadeCafe -= 7;
                }
            }
        }
        return statusCafe;
    }
    // fim dos metodos adicionais ------------------------------------------

    public int getQuantidadeAgua() {
        return quantidadeAgua;
    }

    public void setQuantidadeAgua(int quantidadeAgua) {
        this.quantidadeAgua = quantidadeAgua;
    }

    public int getQuantidadeCafe() {
        return quantidadeCafe;
    }

    public void setQuantidadeCafe(int quantidadeCafe) {
        this.quantidadeCafe = quantidadeCafe;
    }

    public Status getStatusCafeteira() {
        return statusCafeteira;
    }

    public void setStatusCafeteira(Status statusCafeteira) {
        this.statusCafeteira = statusCafeteira;
    }

    @Override
    public String toString() {
        return "Cafeteira [quantidadeAgua=" + quantidadeAgua + ", quantidadeCafe=" + quantidadeCafe + "]";
    }
    
}
