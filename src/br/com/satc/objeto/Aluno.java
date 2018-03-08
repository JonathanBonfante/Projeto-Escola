/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.objeto;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author jonathan.153417
 */
public class Aluno extends Pessoa {
    private int matricula;
    private Date dataMatricula;
    private ArrayList <Disciplina> Disciplina= new ArrayList<>();

    public Aluno(int matricula, Date dataMatricula, String nome, String rg, String cpf, Date datanascimento) {
        super(nome, rg, cpf, datanascimento);
        this.matricula = matricula;
        this.dataMatricula = dataMatricula;
    }
    
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Date getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(Date dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public ArrayList<Disciplina> getDisciplina() {
        return Disciplina;
    }

    public void setDisciplina(ArrayList<Disciplina> Disciplina) {
        this.Disciplina = Disciplina;
    }

    @Override
    public String toString() {
        return "Aluno{" + "matricula=" + matricula + ", dataMatricula=" + dataMatricula + ", Disciplina=" + Disciplina + '}';
    }
    
    
}