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

    // Implementacion de los  calculos

    // Retorna la clave del empleado
    public String getClave()
    {
        return clave;
    }

    // Permite cambiar la clave del empleado
    public void setClave(String clave)
    {
        this.clave = clave;
    }

    // Retorna el nombre del empleado
    public String getNombre()
    {
        return nombre;
    }

    // Permite cambiar el nombre del empleado
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    // Retorna las horasTrabajadas que ingreso el usuario
    public int getHorasTrabajadas()
    {
        return horasTrabajadas;
    }

    // Permite cambiar las horas trabajadas
    public void setHorasTrabajadas(int horasTrabajadas)
    {
        this.horasTrabajadas = horasTrabajadas;
    }

    // Retorna el pago por hora
    public double getPagoPorHora() {
        return pagoPorHora;
    }

    // Permite cambiar el pago por hora
    public void setPagoPorHora(double pagoPorHora) {
        this.pagoPorHora = pagoPorHora;
    }

    // Consideramos 50 las horas maximas para calcular el pago

    // Conservamos las horas originales
    public int getHorasCalculadas()
    {
        if (horasTrabajadas > 50)
        {
            return 50;
        }
        else
        {
            return horasTrabajadas;
        }
    }

    // Consideramos 40 como horas normales
    public int calcularHorasNormales()
    {
        if (getHorasCalculadas() <= 40)
        {
            return getHorasCalculadas();
        }
        else
        {
            return 40;
        }
    }

    // Si supera las 40 horas ya son horas extras
    public int calcularHorasExtra()
    {
        if (getHorasCalculadas() > 40)
        {
            return getHorasCalculadas() - 40;
        }
        else
        {
            return 0;
        }
    }

    // Multiplicamos las horas normales por el pago por hora
    public double calcularPagoNormal()
    {
        return calcularHorasNormales() * pagoPorHora;
    }

    // Las horas extra se pagaran al doble
    public double calcularPagoExtra()
    {
        return calcularHorasExtra() * pagoPorHora * 2;
    }

    // Sumamos el pago normal mas el pago de las horas extra
    public double calcularPagoTotal()
    {
        return calcularPagoNormal() + calcularPagoExtra();
    }



}
