package ar.edu.unju.fi.ejercicio3.constantes;

public enum Provincia {
	JUJUY(5000000,53221,1500000), 
	SALTA(1200000, 155488, 2000000),
	TUCUMAN(1500000, 22524, 2500000),
	CATAMARCA(700000, 102602, 1200000),
	LA_RIOJA(600000, 89680, 1000000),
	SANTIAGO_DEL_ESTERO(2500000, 136351, 3000000);


	public int cantidadpoblacion;
	public int superficie;
	public int cantidadHabitantes;

	private Provincia(int cantidadpoblacion, int superficie, int cantidadHabitantes) {
		this.cantidadpoblacion = cantidadpoblacion;
		this.superficie = superficie;
		this.cantidadHabitantes = cantidadHabitantes;
	}

	public int getCantidadpoblacion() {
		return cantidadpoblacion;
	}

	public void setCantidadpoblacion(int cantidadpoblacion) {
		this.cantidadpoblacion = cantidadpoblacion;
	}

	public int getSuperficie() {
		return superficie;
	}

	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}

	public int getCantidadHabitantes() {
		return cantidadHabitantes;
	}

	public void setCantidadHabitantes(int cantidadHabitantes) {
		this.cantidadHabitantes = cantidadHabitantes;
	}
	public double calcularDensidadPoblacional() {
		return cantidadHabitantes / (double) superficie;
	}

}
