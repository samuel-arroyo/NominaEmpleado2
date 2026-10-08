
// La clase min imprime lo ya programado en la clase Nomina

import java.util.Scanner;
public class Main {

    public static void main(String[] args)
    {
        System.out.println("Sistema de Nomina de Empleados");
        Scanner entrada = new Scanner(System.in);

        // Pedimos los datos del empleado

        System.out.println("Clave del empleado: ");
        String clave = entrada.nextLine();

        System.out.println("Nombre completo: ");
        String nombre = entrada.nextLine();

        System.out.println("Horas trabajadas: ");
        int horasTrabajadas = entrada.nextInt();

        System.out.println("Pago por hora: ");
        double pagoPorHora = entrada.nextDouble();

        // Creamos el objeto
        Nomina nominaEmpleado = new Nomina(clave, nombre, horasTrabajadas, pagoPorHora);

        // Mostramos el recibo
        System.out.println("===========================");
        System.out.println("     RECIBO DE NOMINA   ");
        System.out.println("===========================");

        // Llamamos a los datos mediante los getters
        System.out.println("Clave: " + nominaEmpleado.getClave());
        System.out.println("Empleado: " + nominaEmpleado.getNombre());

        // Muestra un mensaje si superan las 50 horas
        if (nominaEmpleado.getHorasTrabajadas() > 50)
        {
            System.out.println("Solamente se consideran 50 horas");
        }

        // Consultamos los resulltados de la clase Nomina

        System.out.println("Horas normales: " + nominaEmpleado.calcularHorasNormales());
        System.out.println("Horas extra: " + nominaEmpleado.calcularHorasExtra());
        System.out.println("Pago por hora: $" + nominaEmpleado.getPagoPorHora());
        System.out.println("Pago normal: $" + nominaEmpleado.calcularPagoNormal());
        System.out.println("Pago horas extra: $" + nominaEmpleado.calcularPagoExtra());

        System.out.println("--------------------------------");
        System.out.println("Pago total: $" + nominaEmpleado.calcularPagoTotal());
        System.out.println("================================");

        entrada.close();
    }


}
