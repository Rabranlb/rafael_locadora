public class Programa {
	//Declaração de classe Programa;
	public static void main(String[] args) {
		//Método principal main;
		Filme f = new Filme();
		//Criar objeto na memária através do new, () = método construtor;
		f.setCodigo(76876);
		f.setNome(" Harry Potter ");
		f.setValor(5.00);
		f.devolver();
		//Atrevés do ponto conseguimos acessar todos os métodos;
		f.mostra();		
		f.retirar();	
		f.mostra();
		
		try {
			f.retirar();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
}
