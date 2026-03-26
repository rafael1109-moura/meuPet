package main.java.com.meupet.model;

import java.util.List;
import java.util.Map;
import java.util.Random;

public class Gato extends Animal {
    private boolean areia_suja;

    public Gato(int id, String nome, int idade, Sexo sexo, float peso, String raca, boolean sujo, boolean castrado, boolean areia_suja) {
        super(id, nome, idade, sexo, peso, raca, sujo, castrado);
        this.areia_suja = areia_suja;
    }

    @Override
    public List<Vacina> buscarVacinas(Map<String, List<Vacina>> vacinasPorPet) {
    	return vacinasPorPet.get("Gato");
    }

    @Override
    public List<Vacina> buscarDoencas(Map<String, List<Vacina>> doencasPorPet) {
        return doencasPorPet.get("Gato");
    }

    public void limparAreia() { this.areia_suja = false; }

    @Override
    public String sugestoesBrincadeiras() {
        return switch (new Random().nextInt(4)) {
            case 0 -> "Laser";
            case 1 -> "Varinha de pesca";
            case 2 -> "Caça ao Tesouro com Petiscos";
            default -> "Construir um castelo";
        };
    }

    @Override
    public String exibirAnimal() {
        return "Nome do seu gatinho é: " + nome + "\n De idade: " + idade;
    }

	public boolean isAreia_suja() { return areia_suja; }

	public void setAreia_suja(boolean areia_suja) { this.areia_suja = areia_suja; }
    
}