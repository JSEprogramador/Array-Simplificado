
import javax.swing.*;
import javax.swing.text.html.parser.Parser;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class JanelaCadastro extends JFrame implements ActionListener {

    //INICIALIZANDO O JBUTTON//
    JButton btIniciar;

    public JanelaCadastro() {
        //FRAME CRIANDO JANELA//
        JFrame frame = new JFrame("Cadastro de Boletim");
        frame.setSize(800, 550);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new FlowLayout(1, 20, 240));

        //INSTANCIANDO O MEU BOTÃO///
        btIniciar = new JButton("Iniciar");
        //ADICIONANDO BOTÃO EM MEU FRAME-JANELA
        frame.add(btIniciar);

        //ADICIONAR EVENTO EM MEU BOTÃO//
        btIniciar.addActionListener(this);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btIniciar) {
            JOptionPane.showMessageDialog(null, "Seja Bem Vindo ao Sistema de Cadastro de Boletim");
            String nome = JOptionPane.showInputDialog("Digite o nome do aluno do Ensino Médio:");
            int materia = Integer.parseInt(JOptionPane.showInputDialog("Quantas materias deseja cadastrar:"));


            //ARRAY DE TODAS MATERIAS DO ALUNO
            String[] qtdemateria = new String[materia];

            // LOOP CRIADO PARA A SOMA DE TODAS AS MATERIAS CADADASTRAS DENTRO DO ARRAY
            for (int i = 0; i < qtdemateria.length; i++) { //LENGTH CRIADO PARA PECORRE TODO O ARRAY//
                qtdemateria[i] = JOptionPane.showInputDialog("Informe a matéria" + (i+1) + ":");
            }

            //ARRAY DE TODAS AS NOTAS DO ALUNO
            JOptionPane.showMessageDialog(null,"Informe as notas das materias cadastradas");
            double[] nota = new double[materia];

            for (int i = 0; i < nota.length; i++){
                nota[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota"+(i+1)+ ":" + Arrays.toString(qtdemateria)));

            }

            double total = 0;
            for(double notas: nota){
                total += notas;

            }

            double media = 0;
            Boletim boletim = new Boletim(nome, materia, nota, media);
            media = total / nota.length;
            JOptionPane.showMessageDialog(null, "<Matérias cadastradas>\n" +materia + "\n" + "<Notas Cadastradas>\n" + " " +  Arrays.toString(nota));
            if (media >= 7) {
                JOptionPane.showMessageDialog(null, "Aluno" + " " + nome + " " + "aprovado" + " " + "Pois obteve a média de:" + " " + media);

            } else {
                JOptionPane.showMessageDialog(null, "Aluno" + " " + nome + " " + "reprovado" + " " + "com a média de:" + " " + media);
            }
        }

    }
}

