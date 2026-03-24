package com.meupet.model;
import java.util.ArrayList;

public class Animal {
    private int id;
    private String nome;
    private int idade;
    private Sexo sexo;
    private float peso;
    private String raca;
    private boolean sujo;
    private boolean castrado;
    private ArrayList<String> doencas;
    public enum Sexo {
        MACHO, FEMEA;
    }
    //construtor
    public Animal(int id, String nome, int idade, Sexo sexo, float peso, String raca, boolean sujo, boolean castrado) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.peso = peso;
        this.raca = raca;
        this.sujo = sujo;
        this.castrado = castrado;
        this.doencas = new ArrayList<>();
    }
    //getters
    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public Sexo getSexo() {
        return sexo;
    }
    public float getPeso() {
        return peso;
    }
    public String getRaca() {
        return raca;
    }
    // is para bolleanos
    public boolean isSujo() {
        return sujo;
    }
    public boolean isCastrado() {
        return castrado;
    }
    public ArrayList<String> getDoencas() {
        return doencas;
    }
    public void adicionarDoenca(String doenca) {
        this.doencas.add(doenca);
    }

    //setters
    public void setId(int id) {
        this.id = id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }
   
    //metodos
    public void limpar() {
        this.sujo = false;
    }
    public void castrar() {
        this.castrado = true;
    }
    float calcularRacao(float porcentagem_alimentacao) {
        return this.peso * porcentagem_alimentacao;
    }
    void exibirAnimal(){
        System.out.println("Nome do seu pet: " + this.nome + "\n De idade: " + this.idade);
    }
    void SugestoesBrincadeiras(){
        System.out.println("");
    }

}
