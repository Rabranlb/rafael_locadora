public class Filme {
    
    private int codigo;
    private String nome;
    private double valor;
    private boolean disponivel;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean isDisponivel() {
		return disponivel;
	}

    public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}

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
	
	public void mostra(){
		System.out.println("Código do filme:" + this.codigo);
		System.out.println("Nome do filme:" + this.nome);
		System.out.println("Valor: R$" + this.valor);		
		System.out.println("Disponível:" + this.disponivel);
	}
}
