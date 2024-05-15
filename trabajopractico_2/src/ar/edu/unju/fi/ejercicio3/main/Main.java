package ar.edu.unju.fi.ejercicio3.main;

import ar.edu.unju.fi.ejercicio3.constantes.Provincia;

public class Main {

	public static void main(String[] args) {
		try {
			Provincia[] provincias = Provincia.values();
			for (Provincia provincia : Provincia.values()) {
			    System.out.println("Provincia: " + provincia);
			    System.out.println("Cantidad de habitantes: " + provincia.getCantidadpoblacion());
			    System.out.println("Superficie: " + provincia.getSuperficie());
			    System.out.println("Densidad poblacional: " + provincia.calcularDensidadPoblacional());
			    System.out.println("---------------------------");
			}
	        } catch (Exception e) {
	            System.err.println("Se ha producido un error: " + e.getMessage());
	            e.printStackTrace();
	        }
	    }

	}


