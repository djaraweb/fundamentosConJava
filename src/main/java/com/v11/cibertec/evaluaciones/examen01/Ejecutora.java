package pe.edu.cibertec.evaluaciones.examen01;

import pe.edu.cibertec.evaluaciones.examen01.entities.Medico;
import pe.edu.cibertec.evaluaciones.examen01.entities.Paciente;
import pe.edu.cibertec.evaluaciones.examen01.helpers.SetearMensajes;
import pe.edu.cibertec.evaluaciones.examen01.helpers.Util;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejecutora {

    public static void main(String[] args) {

        SetearMensajes.mostrarMensaje("Clínica Nutricional CIBERTEC");
        Scanner inputTeclado = new Scanner(System.in);
        try {
            // 1. Solicitar la inforacion del Medico;
            Medico medico = new Medico();
            System.out.println("Ingrese a continuación la información del Médico: ");

            System.out.printf("Ingrese el nombre del Médico: ");
            medico.setNombres(inputTeclado.next());
            System.out.printf("Ingrese el apellido del Médico: ");
            medico.setApellidoPaterno(inputTeclado.next());
            System.out.printf("Ingrese el especialidad del Médico: ");
            medico.setEspecialidad(inputTeclado.next());
            System.out.printf("Ingrese el costo de la consulta : ");
            medico.setPrecioConsulta(Double.parseDouble(inputTeclado.next()));

            Paciente paciente = new Paciente();
            System.out.println("Ingrese a continuación la información del Paciente: ");

            System.out.printf("Ingrese el nombre del Paciente: ");
            paciente.setNombres(inputTeclado.next());
            System.out.printf("Ingrese el apellido del Paciente: ");
            paciente.setApellidoPaterno(inputTeclado.next());
            System.out.printf("Ingrese el sexo del Paciente(Masculino/Femenino): ");
            paciente.setSexo(inputTeclado.next());
            System.out.printf("Ingrese la edad del Paciente: ");
            paciente.setEdad(inputTeclado.next());
            System.out.printf("Ingrese el DNI del Paciente: ");
            paciente.setNroDni(inputTeclado.next());
            System.out.printf("Ingrese la altura del Paciente (mt): ");
            paciente.setAltura(Double.parseDouble(inputTeclado.next()));
            System.out.printf("Ingrese el peso del Paciente (Kg): ");
            paciente.setPeso(Double.parseDouble(inputTeclado.next()));

            // Asignar el medico ingresado al paciente
            paciente.setMedicoTratante(medico);
            StringBuilder info = new StringBuilder();

            String desPaciente = paciente.getSexo().substring (1).equals("M") ? "El" : "La";
            String desMayorMenorEdad = paciente.esMayorDeEdad() ? "mayor" : "menor";
            int IMC = paciente.cacularIMC();
            String msgIMC = paciente.mensajeSegunIMC(IMC);

            //Fecha actual desglosada:
            Calendar fecha = Calendar.getInstance();
            int año = fecha.get(Calendar.YEAR);
            int mes = fecha.get(Calendar.MONTH) + 1;
            int dia = fecha.get(Calendar.DAY_OF_MONTH);

            SetearMensajes.mostrarMensaje("Diagnostico");
            info
                    .append("Fecha Actual: "+ dia + " de " + Util.nombreDelMes(mes) + " del " + año+ "\n")
                    .append(desPaciente + " paciente “" + paciente.getNombres() + "” que tiene “" + paciente.getEdad() + "” años es ")
                    .append(desMayorMenorEdad + " de edad identificado con dni “" + paciente.getNroDni() + "”")
                    .append(" y actualmente se encuentra " + msgIMC + ".\n");

            info
                    .append("***********************************************************************\n")
                    .append("Atte: Dr(a) " + medico.getNombres() + " " + medico.getApellidoPaterno() + "\n")
                    .append("Especialidad: “" + medico.getEspecialidad() + "”\n")
                    .append("***********************************************************************\n")
                    .append("Costo de la consulta: " + medico.getPrecioConsulta());

            System.out.println(info);

        } catch (InputMismatchException errorInput) {
            System.out.println("Error de lectura de data: " + errorInput.getMessage());
        } catch (Exception ex) {
            System.out.println("Error no controlado:" + ex);
        } finally {
            inputTeclado.close();
        }

    }
}
