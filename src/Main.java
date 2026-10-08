
// La clase min imprime lo ya programado en la clase Nomina

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Sistema de Nomina de Empleados");
        Scanner entrada = new Scanner(System.in);

        //  Mandamos imrimr los 4 campos con su respectivas instrucciones

        System.out.print("Clave del empleado: ");
        String clave = entrada.nextLine();

        System.out.print("Nombre completo: ");
        String nombre = entrada.nextLine();

        System.out.print("Horas trabajadas: ");
        int horasTrabajadas = entrada.nextInt();

        System.out.print("Pago por hora: ");
        double pagoPorHora = entrada.nextDouble();

        // Creamos un objeto Nomina usando el constructor

        Nomina nominaEmpleado = new Nomina(clave, nombre, horasTrabajadas, pagoPorHora);


}
