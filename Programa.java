public class Programa {
	
	public static void main(String[] args) {
		Filme f = new Locadora();
		f.setCodigo(76876);
		f.setNome(" Harry Potter ");
		f.setValor(5.00);
		f.devolver();
		
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
