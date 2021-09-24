public class Filme {
    //Declaração de classe Filme;
    private int codigo;
    //Encapsulamento da variável codigo;
    private String nome;
    //Encapsulamento da variável nome;
    private double valor;
    //Encapsulamento variável valor;
    private boolean disponivel;
    //Encapsulamento da variável disponivel de true ou false, em relação disponibilidade do filme;
    //Consultar codigo pelo metódo get;
    public int getCodigo() {
        return codigo;
    }
    //Atribuir valor pelo método set
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    //Consultar nome pelo método get;
    public int getNome() {
        return nome;
    }
    //Atribuir nome pelo método set
    public void setNome(String nome) {
        this.nome = nome;
    }
     //Consultar valor pelo método get;
    public int getValor() {
        return valor;
    }
      //Atribuir valor pelo método set
    public void setValor(double valor) {
        this.valor = valor;
    }
     //Se está ou não Disponivel
    public boolean isDisponivel() {
		return disponivel;
	}
     //Atribuir true ou false pelo método set;
    public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
     //
    public void retirar() {
		if(disponivel == true) {
			disponivel = false;
		}else{
			throw new RuntimeException("Este filme não está disponível!");
		}
				
	}

    public void devolver() {
		disponivel = true;
	}
	//Print dos dados das variáveis para o usuário;
	public void mostra(){
		System.out.println("Código do filme:" + this.codigo);
		System.out.println("Nome do filme:" + this.nome);
		System.out.println("Valor: R$" + this.valor);		
		System.out.println("Disponível:" + this.disponivel);
	}
}
