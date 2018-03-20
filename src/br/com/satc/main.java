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
import java.util.ArrayList;
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
          int escMenu=0;
          ArrayList<Disciplina> Materias = new ArrayList<>();
          ArrayList<Professor> Professores = new ArrayList<>();
          ArrayList<Aluno> Alunos = new ArrayList<>();
          
          
          do{
              escMenu = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma das opçoes: \n "
              + "1. Cadastro Disciplina \n"
              + "2. Cadastro Aluno \n "
              + "3. Cadastro Professor \n"
              + "4. Sair"));
              
              switch(escMenu){
                  case 1: {
                     do { 
                String nome = JOptionPane.showInputDialog("Informe o seu nome: ");
                String departamento = JOptionPane.showInputDialog("informe o seu departamento : ");
                char status = JOptionPane.showInputDialog("Informe o status: ").charAt(0);
                Materias.add(new Disciplina(nome, departamento, status));
           }while((JOptionPane.showConfirmDialog(null, "Deseja continuar? "))==0);
           break;
                  }      
          case 2:{
          do {
           int matricula = Integer.parseInt(JOptionPane.showInputDialog("informe a sua matricula: "));
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            String nomeAluno = JOptionPane.showInputDialog("Informe o seu nome: ");
            String rgAluno = JOptionPane.showInputDialog("Informe o seu rg: ");
            String cpfAluno= JOptionPane.showInputDialog("Informe o seu cpf: ");
            Date dataMatricula =  sdf.parse(JOptionPane.showInputDialog("informe a data de Matricula:"));
            Date dataNascimentoAluno =  sdf.parse(JOptionPane.showInputDialog("informe a data de nascimento:"));
            Alunos.add(new Aluno(matricula, dataMatricula, nomeAluno, rgAluno, cpfAluno, dataNascimentoAluno ));
   
            if (JOptionPane.showConfirmDialog(null, "O aluno já se matriculou em alguma disciplina?") == 0){
            String materiasExistentes= "";
               Iterable<Disciplina> materias = null;
            for (Disciplina materia : materias){
            materiasExistentes += materias.IndexOf(materia)+ " " + materia.getNome() + "\n";
            }
            do{
            int esc = Integer.parseInt(JOptionPane.showInputDialog("-- Informe a materia --\n" + materiasExistentes));
            Alunos.get(Alunos.size() -1).getDisciplina().add(materias.get(esc));
            }while((JOptionPane.showConfirmDialog(null," Tem outra materia para cadastra? "))==0);
             break;
            }
          
          
          case 3:
          do{
           int cargaHoraria = Integer.parseInt(JOptionPane.showInputDialog("informe a sua carga horario: "));
            float valorHora = Float.parseFloat(JOptionPane.showInputDialog("informe o valor da sua hora: "));
            String nomeProfessor = JOptionPane.showInputDialog("Informe o seu nome: ");
            String rg = JOptionPane.showInputDialog("Informe o seu rg: ");
            String cpf = JOptionPane.showInputDialog("Informe o seu cpf: ");
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date dataNascimento =  sdf.parse(JOptionPane.showInputDialog("informe a data de nascimento:"));
            Professores.add(new Professor( cargaHoraria, valorHora, nomeProfessor, rg, cpf, dataNascimento ));
            }while((JOptionPane.showConfirmDialog(null, "Deseja continuar? "))==0);
            break;
          
              
            if (JOptionPane.showConfirmDialog(null, "O Professor já se cadastrou?") == 0){
            String materiaExistente = "";
            for (Professor materia: materias ){
            materiaExistentes += materias.index(materia) + " " + materia.getNome() + "\n";
            }
            do{
                int esc = Integer.parseInt(JOptionPane.showInputDialog("-- Informe o professor --\n" + materiasexistentes));
               alunos.get(alunos.size() -1).getDisciplinas().add(materias.get(esc));
            }while((JOptionPane.showConfirmDialog(null," Tem outro  para cadastra? "))==0);
              break;
          }
          
          }while(escMenu!=4);
              
                  }
              }
          }