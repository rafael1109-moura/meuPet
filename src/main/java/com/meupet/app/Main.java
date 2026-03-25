package main.java.com.meupet.app;

import java.util.List;

import main.java.com.meupet.model.Animal;
import main.java.com.meupet.model.Cachorro;
import main.java.com.meupet.model.Gato;
import main.java.com.meupet.model.PetSaude;
import main.java.com.meupet.model.Vacina;

public class Main {
    public static void main(String[] args) {
    	PetSaude saude = new PetSaude();
    	
        System.out.println();
    	
       Cachorro cachorro = new Cachorro(1, "Rex", 3, Animal.Sexo.MACHO, 10.5f, "Labrador", false, false,
                                 "2024-06-01", "2024-06-02", "2024-06-03");
       
       List<Vacina> vacinasCachorro = cachorro.buscarVacinas(saude.getMapaCompletoVacinas());
       
       System.out.println("Histórico de vacinas recomendadas para " + cachorro.getNome() + ":");
       for(Vacina v : vacinasCachorro) {
    	   System.out.println("- " + v.getNome() + " previne " + v.getDoenca().getNome());
       }
       
       System.out.println();
       
        // Criando um gato
        Gato gato = new Gato(2, "Mimi", 2, Animal.Sexo.FEMEA, 4.0f, "Siamês", false, true,
                     true);
        
        List<Vacina> vacinasGato = gato.buscarVacinas(saude.getMapaCompletoVacinas());
        
        System.out.println("Histórico de vacinas recomendadas para " + gato.getNome() + ":");
        for(Vacina v : vacinasGato) {
     	   System.out.println("- " + v.getNome() + " previne " + v.getDoenca().getNome());
        }
        
        System.out.println();
        
        System.out.println("Data do último banho: " + cachorro.getData_last_banho());
        System.out.println("Data da última tosa: " + cachorro.getData_last_tosa());
        System.out.println("Data do último passeio: " + cachorro.getData_ultimo_passeio());
        
        
        System.out.println();
        
        System.out.println("A areia está suja? " + gato.isAreia_suja());

        gato.limparAreia();

        System.out.println("A areia está suja? " + gato.isAreia_suja());

        
        
    }
}