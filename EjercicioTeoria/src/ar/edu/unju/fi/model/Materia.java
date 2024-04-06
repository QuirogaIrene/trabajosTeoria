package ar.edu.unju.fi.model;

public class Materia {

	private String codigo;
	private String materia;
	
	public Materia() {
		
	}
	
	

	public Materia(String codigo, String materia) {
		super();
		this.codigo = codigo;
		this.materia = materia;
	}
	
	

	@Override
	public String toString() {
		return "codigo=" + codigo + ", materia=" + materia + "]";
	}



	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}
	
	
}
