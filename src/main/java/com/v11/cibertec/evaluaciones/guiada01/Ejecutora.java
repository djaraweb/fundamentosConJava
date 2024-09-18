package pe.edu.cibertec.evaluaciones.guiada01;

import pe.edu.cibertec.evaluaciones.guiada01.entity.Cliente;
import pe.edu.cibertec.evaluaciones.guiada01.utilitarios.SetearMensajes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejecutora {

    public static void main(String[] args) {

        SetearMensajes.mostrarMensaje("**********   CIBER-CREDIT   **********");

        Scanner ingresoDatosPorTeclado = new Scanner(System.in);
        Cliente cliente = new Cliente();

        try {
            System.out.print("Por favor ingrese el nombre del cliente a evaluar: ");
            cliente.setNombres(ingresoDatosPorTeclado.nextLine());

            System.out.print("Por favor ingrese Apellido Paterno del cliente a evaluar: ");
            cliente.setApellidoPaterno(ingresoDatosPorTeclado.nextLine());

            System.out.print("Por favor ingrese Apellido Materno del cliente a evaluar: ");
            cliente.setApellidoMaterno(ingresoDatosPorTeclado.nextLine());

            System.out.print("Por favor ingrese Mes nacimiento (Enero-Diciembre) del cliente a evaluar: ");
            cliente.setMesNacimiento(ingresoDatosPorTeclado.nextLine());

            System.out.print("Por favor ingrese el Nro DNI del cliente a evaluar: ");
            cliente.setNroDni(ingresoDatosPorTeclado.nextLine());

            // Realizar Validaciones
            while (cliente.getSueldo() <= 0) {
                System.out.print("Por favor ingrese Sueldo del cliente a evaluar: ");
                cliente.setSueldo(ingresoDatosPorTeclado.nextDouble());
                if (cliente.getSueldo() <= 0) {
                    System.out.println("El Sueldo ingresado debe ser mayor que cero.");
                }
            }
            while (cliente.getMontoPrestamo() <= 0) {
                System.out.print("Por favor ingrese el Monto del Prestamo: ");
                cliente.setMontoPrestamo(ingresoDatosPorTeclado.nextDouble());
                if (cliente.getMontoPrestamo() <= 0) {
                    System.out.println("El Monto del Prestamo ingresado debe ser mayor que cero.");
                }
            }

            SetearMensajes.mostrarMensaje("*****   Procesando informacion  *****");

            if (4*cliente.getSueldo()> cliente.getMontoPrestamo()){
                if (Integer.parseInt(cliente.getNroDni()) % 2 ==0){
                    StringBuilder sbuilder = new StringBuilder();
                    sbuilder.append("Se otorga el prestamo al cliente")
                            .append(cliente.getNombresApellidos())
                            .append(", por favor acercarse a ventanilla y aproveche la promocion de")
                            .append(cliente.getTasaInteres())
                            .append("% de tasa de interes anual");
                    System.out.println(sbuilder.toString());
                }else {
                    System.out.println("Prestamo denegado porque presenta morosidad en Infocorp");
                }
            }else {
                System.out.println("Prestamo denegado porque la cantidad solicitada supera 4 veces su sueldo");
            }

            SetearMensajes.mostrarMensaje("*****      Fin del Programa    *****");

            System.out.println(cliente.toString());

        }catch (InputMismatchException errorInput){
            System.out.println("Error de lectura de data: " + errorInput.getMessage());
        }catch (Exception ex){
            System.out.println("Error no controlado:" + ex);
        }finally {
            ingresoDatosPorTeclado.close();
        }

    }
}
