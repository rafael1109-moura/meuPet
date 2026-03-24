package com.meupet.model;
public class Gato extends Animal {
    private boolean areia_suja;

//construtor
public Gato(int id, String nome, int idade, Sexo sexo, float peso, String raca, boolean sujo, boolean castrado, boolean areia_suja) {
    super(id, nome, idade, sexo, peso, raca, sujo, castrado);
    this.areia_suja = areia_suja;
}
//getters
public boolean isAreia_suja() {
    return areia_suja;
}
//setters
public void setAreia_suja(boolean areia_suja) {
    this.areia_suja = areia_suja;
}
//metodos
public void limparAreia() {
    this.areia_suja = false;
}
@Override
void exibirAnimal(){
    System.out.println("Nome do seu gatinho é: " + this.nome + "\n De idade: " + this.idade);
}

}

