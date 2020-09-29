package Lista;

import javax.swing.JOptionPane;

public class View {
	public static void main(String[] args) {
		Lista lista = new Lista();
		boolean loop = true;
		while(loop) {
			int codigo = Integer.parseInt(JOptionPane.showInputDialog(null, ""
					+ "1 - Adicionar um novo aluno."
					+ "\n2 - Remover um aluno."
					+ "\n3 - Mostrar Lista de alunos"
					+ "\n4 - Finalizar"));
//			Menu de Opções
			switch (codigo) {
        	case 1:
        		String matricula = JOptionPane.showInputDialog("Digite um numero da matricula: ");
        		String nome = JOptionPane.showInputDialog("Digite o nome do aluno: ");
        		String disciplina = JOptionPane.showInputDialog("Digite a disciplina do aluno: ");
        		float notaP1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota da P1: "));
        		float notaP2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota da P2: "));
        		float notaSUB = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota da Sub: "));
        		float notaEX = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota da EX: "));
        		Aluno aluno = new Aluno(matricula, nome, disciplina, notaP1, notaP2, notaSUB, notaEX);
        		lista.adiciona(aluno);
            break;
	        case 2:
	            lista.remove();
	            break;
	        case 3:
	        	lista.mostra();
	        	break;
	        case 4:
	        	loop = false;
	            break;
	        default:
	             JOptionPane.showMessageDialog(null, "O codigo informado é invalido.");
	             break;
			} 
		}
	}
}
