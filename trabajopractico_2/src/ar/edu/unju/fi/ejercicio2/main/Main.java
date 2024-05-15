package ar.edu.unju.fi.ejercicio2.main;
import ar.edu.unju.fi.ejercicio2.model.Efemeride;
import ar.edu.unju.fi.ejercicio2.constantes.Mes;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args) {
        ArrayList<Efemeride> efemerides = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        
        try {
            int opcion;
            do {
                System.out.println("Menu de Opciones: ");
                System.out.println("1 - Crear efemeride");
                System.out.println("2 - Mostrar efemeride");
                System.out.println("3 - Eliminar efemeride");
                System.out.println("4 - Modificar efemeride");
                System.out.println("5 - Salir");
                System.out.println("Elija una opcion: ");
                
                opcion = sc.nextInt();
                
                switch (opcion) {
                    case 1:
                        crearEfemeride(efemerides, sc);
                        break;
                    case 2:
                        mostrarEfemerides(efemerides);
                        break;
                    case 3:
                        eliminarEfemeride(efemerides, sc);
                        break;
                    case 4:
                        modificarEfemeride(efemerides, sc);
                        break;
                    case 5:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opcion no valida");
                }
            } while (opcion != 5);
        } catch (InputMismatchException e) {
            System.out.println("Error: Debes ingresar un número entero.");
        } finally {
            // Cerrar el Scanner en el bloque finally para asegurarse de que siempre se cierre
            if (sc != null) {
                sc.close();
            }
        }
    }

    private static void modificarEfemeride(ArrayList<Efemeride> efemerides, Scanner sc) {
        System.out.println("Ingrese el codigo de la efemeride a modificar");
        String codigo = sc.next();

        for (Efemeride efemeride : efemerides) {
            if (efemeride.getCodigo().equals(codigo)) {
                System.out.println("Mes: ");
                for (Mes mes : Mes.values()) {
                    System.out.println((mes.ordinal() + 1) + "-" + mes);

                }
                System.out.println("Elija una opcion: ");
                int mesIndex = sc.nextInt();
                Mes mes = Mes.values()[mesIndex - 1];
                efemeride.setMes(mes);

                System.out.println("Nuevo Dia: ");
                int dia = sc.nextInt();
                efemeride.setDia(dia);

                System.out.println("Nuevo Detalle: ");
                sc.nextLine();
                String detalle = sc.nextLine();
                efemeride.setDetalle(detalle);

                System.out.println("Efemeride Modificada");
                return;
            }
        }
    }

    private static void eliminarEfemeride(ArrayList<Efemeride> efemerides, Scanner sc) {
        System.out.println("Ingrese el codigo de la efemeride elegida");
        String codigo = sc.next();

        // Eliminar efemeride
        efemerides.removeIf(efemeride -> efemeride.getCodigo().equals(codigo));
        System.out.println("Efemeride eliminada");
    }

    private static void mostrarEfemerides(ArrayList<Efemeride> efemerides) {
        // Recorrer la lista de efemerides y las imprime
        for (Efemeride efemeride : efemerides) {
            System.out.println(efemeride.getCodigo() + "-" + efemeride.getDetalle() + "-" + efemeride.getDia() + "-" + efemeride.getDia());
        }
    }

    private static void crearEfemeride(ArrayList<Efemeride> efemerides, Scanner sc) {
        System.out.println("Codigo: ");
        String codigo = sc.next();

        System.out.println("Mes: ");
        for (Mes mes : Mes.values()) {
            System.out.println((mes.ordinal() + 1) + "-" + mes);
        }
        System.out.println("Elija una Opcion: ");
        int mesIndex = sc.nextInt();
        Mes mes = Mes.values()[mesIndex - 1];
        System.out.println("Dia: ");
        int dia = sc.nextInt();
        System.out.println("Detalle: ");
        sc.nextLine();
        String detalle = sc.nextLine(); // lee el detalle

        // Crear un nuevo objeto efemeride
        Efemeride efemeride = new Efemeride();
        efemeride.setCodigo(codigo);
        efemeride.setMes(mes);
        efemeride.setDia(dia);
        efemeride.setDetalle(detalle);
        efemerides.add(efemeride);
    }
}
