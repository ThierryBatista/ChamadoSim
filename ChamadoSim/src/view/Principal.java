package view;
import controller.FilaController;
import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		FilaController f = new FilaController();
		
		int opc = 0;
		while(opc != 4) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Insira um cliente prioritário \n 2 - Insira um cliente \n 3 - Realiza o chamado \n 4 - Fim "));
			switch(opc) {
			case 1: f.inserirClienteP();
			break;
			case 2: f.inserirCliente();
			break;
			case 3: f.chamado();
			break;
			case 4: JOptionPane.showMessageDialog(null," Fim");
			break;
			default: JOptionPane.showMessageDialog(null," Valor Inválido");
			break;
			}
		} 

	}

}
