package aulaOO2;

public class Carro {
	 private int nPortas;
	 private String marca;
	 private String  modelo;
	 private int potencia;
	 
	 //GET SET
	 
	 public int getnPortas() {
		 return nPortas;
	 }

	 public void setnPortasint(int nPortas) {
		 this.nPortas = nPortas;
	 }

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	 
}
