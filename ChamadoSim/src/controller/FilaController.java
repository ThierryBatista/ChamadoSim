package controller;
import model.FilaGen;
import javax.swing.JOptionPane;

public class FilaController {

	public FilaController() {
		super();		
	}
	
	FilaGen<String> nome = new FilaGen<String>();
	FilaGen<Integer> senha = new FilaGen<Integer>();
	FilaGen<String> nomep = new FilaGen<String>();
	FilaGen<Integer> senhap = new FilaGen<Integer>();
	
	public void inserirCliente() {
		nome.insert(JOptionPane.showInputDialog("Digite o nome do cliente"));
		senha.insert(Integer.parseInt(JOptionPane.showInputDialog("Digite a senha do cliente")));
	}
	
    public void inserirClienteP() {
    	nomep.insert(JOptionPane.showInputDialog("Digite o nome do cliente prioritário"));
		senhap.insert(Integer.parseInt(JOptionPane.showInputDialog("Digite a senha do cliente prioritário")));
	}
    
    public void chamado() {
    	int tamanhoP = nomep.size();
    	int tamanho = nome.size();
    	if(tamanhoP == 0 && tamanho == 0) {	
				System.out.println("Não há clientes a serem chamados");
    	} else if (tamanhoP == 0 && tamanho != 0) {
    		try {
				System.out.println(nome.remove());
				System.out.println(senha.remove());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	} else if (tamanhoP > 2 && tamanho == 0) {
    		try {
				System.out.println(nomep.remove());
				System.out.println(senhap.remove());
				System.out.println(nomep.remove());
				System.out.println(senhap.remove());
				System.out.println(nomep.remove());
				System.out.println(senhap.remove());
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    }else if (tamanhoP > 2 && tamanho != 0) {
		try {
			System.out.println(nomep.remove());
			System.out.println(senhap.remove());
			System.out.println(nomep.remove());
			System.out.println(senhap.remove());
			System.out.println(nomep.remove());
			System.out.println(senhap.remove());
			System.out.println(nome.remove());
			System.out.println(senha.remove());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
     }else if (tamanhoP <= 2 && tamanho != 0) {
    	 try {
    		 for (int i = 0; i < tamanhoP; i++) {
    			 System.out.println(nomep.remove());
    				System.out.println(senhap.remove());
    		 }
    	 }catch (Exception e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		} 
    	 try {
				System.out.println(nome.remove());
				System.out.println(senha.remove());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
     }else if (tamanhoP <= 2 && tamanho == 0) {
    	 try {
    		 for (int i = 0; i < tamanhoP; i++) {
    			 System.out.println(nomep.remove());
    				System.out.println(senhap.remove());
    		 }
    	 }catch (Exception e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		} 
     }
    
    }
}
