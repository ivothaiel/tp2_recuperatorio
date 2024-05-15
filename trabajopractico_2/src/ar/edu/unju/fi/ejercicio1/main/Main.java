package ar.edu.unju.fi.ejercicio1.main;

import ar.edu.unju.fi.ejercicio1.model.Producto;
import ar.edu.unju.fi.ejercicio1.model.Producto.Categoria;
import ar.edu.unju.fi.ejercicio1.model.Producto.OrigenFabricacion;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcion;
        
        do {
            System.out.println("Menú de Opciones:");
            System.out.println("1 – Crear Producto");
            System.out.println("2 – Mostrar productos");
            System.out.println("3 – Modificar producto");
            System.out.println("4 – Salir");
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    crearProducto(productos, scanner);
                    break;
                case 2:
                    mostrarProductos(productos);
                    break;
                case 3:
                    modificarProducto(productos, scanner);
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 4);
        
        scanner.close();
    }

    public static void crearProducto(ArrayList<Producto> productos, Scanner scanner) {
        System.out.print("Código: ");
        String codigo = scanner.next();
        
        System.out.print("Descripción: ");
        String descripcion = scanner.next();
        
        System.out.print("Precio Unitario: ");
        Double precioUnitario = scanner.nextDouble();
        
        System.out.println("Origen de Fabricación: ");
        for (OrigenFabricacion origen : OrigenFabricacion.values()) {
            System.out.println((origen.ordinal() + 1) + " - " + origen);
        }
        System.out.print("Elija una opción: ");
        int origenIndex = scanner.nextInt();
        OrigenFabricacion origenFabricacion = OrigenFabricacion.values()[origenIndex - 1];
        
        System.out.println("Categoría: ");
        for (Categoria categoria : Categoria.values()) {
            System.out.println((categoria.ordinal() + 1) + " - " + categoria);
        }
        System.out.print("Elija una opción: ");
        int categoriaIndex = scanner.nextInt();
        Categoria categoria = Categoria.values()[categoriaIndex - 1];
        
        Producto producto = new Producto(codigo, descripcion, precioUnitario, origenFabricacion, categoria);
        productos.add(producto);
    }

    public static void mostrarProductos(ArrayList<Producto> productos) {
        for (Producto producto : productos) {
            System.out.println(producto.getCodigo() + " - " + producto.getDescripcion() + " - " + producto.getPrecioUnitario() + " - " + producto.getOrigenFabricacion() + " - " + producto.getCategoria());
        }
    }

    public static void modificarProducto(ArrayList<Producto> productos, Scanner scanner) {
        System.out.print("Ingrese el código del producto a modificar: ");
        String codigo = scanner.next();
        
        for (Producto producto : productos) {
            if (producto.getCodigo().equals(codigo)) {
                System.out.print("Nueva Descripción: ");
                String descripcion = scanner.next();
                producto.setDescripcion(descripcion);
                
                System.out.print("Nuevo Precio Unitario: ");
                Double precioUnitario = scanner.nextDouble();
                producto.setPrecioUnitario(precioUnitario);
                
                System.out.println("Nuevo Origen de Fabricación: ");
                for (OrigenFabricacion origen : OrigenFabricacion.values()) {
                    System.out.println((origen.ordinal() + 1) + " - " + origen);
                }
                System.out.print("Elija una opción: ");
                int origenIndex = scanner.nextInt();
                OrigenFabricacion origenFabricacion = OrigenFabricacion.values()[origenIndex - 1];
                producto.setOrigenFabricacion(origenFabricacion);
                
                System.out.println("Nueva Categoría: ");
                for (Categoria categoria : Categoria.values()) {
                    System.out.println((categoria.ordinal() + 1) + " - " + categoria);
                }
                System.out.print("Elija una opción: ");
                int categoriaIndex = scanner.nextInt();
                Categoria categoria = Categoria.values()[categoriaIndex - 1];
                producto.setCategoria(categoria);
                
                System.out.println("Producto modificado.");
                return;
            }
        }
        
        System.out.println("Producto no encontrado.");
    }
}

