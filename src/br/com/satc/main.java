/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc;

import br.com.satc.objeto.Aluno;
import br.com.satc.objeto.Disciplina;
import br.com.satc.objeto.Professor;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

/**
 *
 * @author jonathan.153417
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        Disciplina disciplina;
        String nome = JOptionPane.showInputDialog("Informe o seu nome: ");
        String departamento = JOptionPane.showInputDialog("informe o seu departamento : ");
        char status = JOptionPane.showInputDialog("Informe o status: ").charAt(0);

        disciplina = new Disciplina (nome, departamento, status);
        JOptionPane.showMessageDialog(null, disciplina.toString());
        
        
        Professor professor;
        int cargaHoraria = Integer.parseInt(JOptionPane.showInputDialog("informe a sua carga horario: "));
        float valorHora = Float.parseFloat(JOptionPane.showInputDialog("informe o valor da sua hora: "));
        String nomeProfessor = JOptionPane.showInputDialog("Informe o seu nome: ");
        String rg = JOptionPane.showInputDialog("Informe o seu rg: ");
        String cpf = JOptionPane.showInputDialog("Informe o seu cpf: ");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date dataNascimento =  sdf.parse(JOptionPane.showInputDialog("informe a data de nascimento:"));
        
        professor = new Professor(cargaHoraria, valorHora, nomeProfessor, rg, cpf, dataNascimento);
        JOptionPane.showMessageDialog(null, professor.toString());
       
        Aluno aluno;
        int matricula = Integer.parseInt(JOptionPane.showInputDialog("informe a sua matricula: "));
        String nomeAluno = JOptionPane.showInputDialog("Informe o seu nome: ");
        String rgAluno = JOptionPane.showInputDialog("Informe o seu rg: ");
        String cpfAluno= JOptionPane.showInputDialog("Informe o seu cpf: ");
        Date dataMatricula =  sdf.parse(JOptionPane.showInputDialog("informe a data de Matricula:"));
        Date dataNascimentoAluno =  sdf.parse(JOptionPane.showInputDialog("informe a data de nascimento:"));
        
        
        aluno = new Aluno( matricula, dataMatricula, nomeAluno, rgAluno, cpfAluno, dataNascimentoAluno);
        JOptionPane.showMessageDialog(null, aluno.toString());
    }
    
}
