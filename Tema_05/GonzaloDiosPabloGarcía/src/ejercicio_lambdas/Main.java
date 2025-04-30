package ejercicio_lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /***
        La empresa XYZ, dedicada al sector tecnológico, ha experimentado un crecimiento significativo en los últimos años. Debido a este crecimiento, el departamento de
        Recursos Humanos necesita un sistema eficiente para gestionar la información de sus empleados.
        Actualmente, la información de los trabajadores se maneja de forma manual, lo que dificulta la consulta rápida de datos y la
        generación de estadísticas clave para la toma de decisiones. Para solucionar esto, se requiere desarrollar un programa en Java 
        que permita la gestión automatizada de los empleados, utilizando la interfaz List implementada por ArrayList para el almacenamiento de datos.

        Requerimientos del sistema:
        El programa debe contar con una clase RecursosHumanos, que centralice todas las operaciones necesarias para la gestión del personal. Las principales funcionalidades a implementar son:

        Agregar un nuevo trabajador, almacenando los siguientes datos: (Supplier y Metodo referencial de constructor.)
        ID (único para cada empleado)
        Nombre
        Apellidos
        Antigüedad en la empresa (en años)
        Sueldo mensual
        -----------------------------------------------------------------------------
        Mostrar la lista de todos los empleados registrados en la empresa. (Consumer)
        Buscar y mostrar un empleado en particular a partir de su nombre. (System.out::printl)
        Eliminar un trabajador, identificándolo por su ID.
        Calcular estadísticas clave de la empresa, tales como:
        Sueldo medio de los empleados. (Function)
        Número de empleados con un sueldo inferior a N (valor ingresado por el usuario). (Predicate)
        Lista de empleados con una antigüedad mayor a N años. (Predicate)
        */

        Scanner scanner = new Scanner(System.in);
        RecursosHumanos rh = new RecursosHumanos(new ArrayList<>());
        
        // Agregar algunos trabajadores de ejemplo
        rh.a.add(new Trabajador(1, "Juan", "Pérez", 5, 2500.0));
        rh.a.add(new Trabajador(2, "María", "Gómez", 3, 3200.0));
        rh.a.add(new Trabajador(3, "Carlos", "López", 7, 1800.0));
        
        int opcion;
        do {
            System.out.println("\n--- Sistema de Gestión de Recursos Humanos XYZ Tech ---");
            System.out.println("1. Mostrar todos los empleados");
            System.out.println("2. Buscar empleado por nombre");
            System.out.println("3. Eliminar empleado por ID");
            System.out.println("4. Calcular sueldo medio");
            System.out.println("5. Mostrar empleados con sueldo menor a X");
            System.out.println("6. Mostrar empleados con más de X años en la empresa");
            System.out.println("7. Agregar nuevo empleado");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer
            
            switch(opcion) {
                case 1:
                    System.out.println("\n--- Lista Completa de Empleados ---");
                    rh.mostrarEmpleados();
                    break;
                    
                case 2:
                    System.out.print("\nIngrese el nombre a buscar: ");
                    String nombreBuscar = scanner.nextLine();
                    System.out.println("Resultados de búsqueda:");
                    rh.buscarPorNombre(nombreBuscar);
                    break;
                    
                case 3:
                    System.out.println("\n--- Eliminar Empleado ---");
                    System.out.print("Ingrese el ID del empleado a eliminar: ");
                    int idEliminar = scanner.nextInt();
                    if(rh.eliminarEmpleado(idEliminar)) {
                        System.out.println("Empleado eliminado con éxito!");
                    } else {
                        System.out.println("No se encontró empleado con ese ID.");
                    }
                    break;
                    
                case 4:
                    System.out.println("\n--- Estadísticas de Sueldos ---");
                    double sueldoMedio = rh.estadisticas();
                    System.out.printf("El sueldo medio de los empleados es: $%,.2f%n", sueldoMedio);
                    break;
                    
                case 5:
                    System.out.println("\n--- Empleados con Sueldo Inferior ---");
                    System.out.print("Ingrese el valor límite de sueldo: ");
                    double sueldoMax = scanner.nextDouble();
                    List<Trabajador> menores = rh.sueldoMenor(sueldoMax);
                    System.out.printf("\nEmpleados con sueldo menor a $%,.2f:%n", sueldoMax);
                    menores.forEach(System.out::println);
                    System.out.println("Total: " + menores.size() + " empleados");
                    break;
                    
                case 6:
                    System.out.println("\n--- Empleados por Antigüedad ---");
                    System.out.print("Ingrese los años mínimos de antigüedad: ");
                    int anios = scanner.nextInt();
                    List<Trabajador> antiguos = rh.masAnios(anios);
                    System.out.printf("\nEmpleados con más de %.0f años en la empresa:%n", anios);
                    antiguos.forEach(System.out::println);
                    System.out.println("Total: " + antiguos.size() + " empleados");
                    break;
                    
                case 7:
                    System.out.println("\n--- Agregar Nuevo Empleado ---");
                    System.out.print("ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Apellidos: ");
                    String apellidos = scanner.nextLine();
                    System.out.print("Antigüedad (años): ");
                    int antiguedad = scanner.nextInt();
                    System.out.print("Sueldo mensual: ");
                    double sueldo = scanner.nextDouble();
                    
                    rh.a.add(new Trabajador(id, nombre, apellidos, antiguedad, sueldo));
                    System.out.println("Empleado agregado con éxito!");
                    break;
                    
                case 0:
                    System.out.println("\nSaliendo del sistema...");
                    break;
                    
                default:
                    System.out.println("\nOpción no válida! Intente nuevamente.");
            }
        } while(opcion != 0);
        
        scanner.close();
    }
}