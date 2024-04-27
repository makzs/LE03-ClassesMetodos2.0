package br.edu.up.Models;

public class Seguro {
    private String nome;
    private int idade;
    private String grupoRisco;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getGrupoRisco() {
        return grupoRisco;
    }
    public void setGrupoRisco(String grupoRisco) {
        this.grupoRisco = grupoRisco;
    }

    public static String categoria(int idade, String grupoRisco){
        String resp = "-";
        if (idade >= 17 && idade <= 20){
            if (grupoRisco.toUpperCase().equals("BAIXO")){
                resp = "1";
            }
            else if (grupoRisco.toUpperCase().equals("MEDIO")){
                resp = "2";
            }
            else if (grupoRisco.toUpperCase().equals("ALTO")){
                resp = "3";
            }
        }
        else if (idade >= 21 && idade <= 24){
            if (grupoRisco.toUpperCase().equals("BAIXO")){
                resp = "2";
            }
            else if (grupoRisco.toUpperCase().equals("MEDIO")){
                resp = "3";
            }
            else if (grupoRisco.toUpperCase().equals("ALTO")){
                resp = "4";
            }
        }
        else if (idade >= 25 && idade <= 34){
            if (grupoRisco.toUpperCase().equals("BAIXO")){
                resp = "3";
            }
            else if (grupoRisco.toUpperCase().equals("MEDIO")){
                resp = "4";
            }
            else if (grupoRisco.toUpperCase().equals("ALTO")){
                resp = "5";
            }
        }
        else if (idade >= 35 && idade <= 64){
            if (grupoRisco.toUpperCase().equals("BAIXO")){
                resp = "4";
            }
            else if (grupoRisco.toUpperCase().equals("MEDIO")){
                resp = "5";
            }
            else if (grupoRisco.toUpperCase().equals("ALTO")){
                resp = "6";
            }
        }
        else if (idade >= 65 && idade <= 70){
            if (grupoRisco.toUpperCase().equals("BAIXO")){
                resp = "7";
            }
            else if (grupoRisco.toUpperCase().equals("MEDIO")){
                resp = "8";
            }
            else if (grupoRisco.toUpperCase().equals("ALTO")){
                resp = "9";
            }
        }
        else{
            resp =  "usuario não se enquadra em nenhuma das categorias ofertadas";
        }

        return resp;
    }
}
