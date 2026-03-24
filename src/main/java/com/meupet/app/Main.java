package com.meupet.app;

import com.meupet.model.Animal;
import com.meupet.model.Cachorro;
import com.meupet.model.Gato;

public class Main {
    public static void main(String[] args) {

        // Criando um cachorro
       Cachorro cachorro = new Cachorro(1, "Rex", 3, Animal.Sexo.MACHO, 10.5f, "Labrador", false, false,
                                 "2024-06-01", "2024-06-02", "2024-06-03");
        System.out.println("Data do último banho: " + cachorro.getData_last_banho());
        System.out.println("Data da última tosa: " + cachorro.getData_last_tosa());
        System.out.println("Data do último passeio: " + cachorro.getData_ultimo_passeio());

        // Criando um gato
        Gato gato = new Gato(2, "Mimi", 2, Animal.Sexo.FEMEA, 4.0f, "Siamês", false, true,
                     true);
        System.out.println("A areia está suja? " + gato.isAreia_suja());

        gato.limparAreia();

        System.out.println("A areia está suja? " + gato.isAreia_suja());
    }
}