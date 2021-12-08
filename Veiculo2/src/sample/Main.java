package sample;

import sample.model.Caminhao;
import sample.model.Carro;

public class Main {




    public static void main(String[] args){
        Carro carro = new Carro("fusquinha", 2);
        carro.setMarca("wolkswagen", "lindo sem riscos");
        System.out.println(carro);

        Caminhao caminhao = new Caminhao("F16000", 3);
        caminhao.setMarca("gurgel", "grande e potente");
        System.out.println(caminhao);
    }
}
