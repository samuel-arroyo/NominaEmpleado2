/**
 * La clase nomina calcula el salario de un empleado
 */

public class Nomina {

    // Declaramos los campos privados

    private String clave;
    private String nombre;
    private int horasTrabajadas;
    private double pagoPorHora;

    // Declaramos el constructor con los campos

    public Nomina(String clave, String nombre,int horasTrabajadas, double pagoPorHora)
    {
        this.clave = clave;
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
        this.pagoPorHora = pagoPorHora;
    }



}
