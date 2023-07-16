package proyecto_final1;

/**
 *
 * @author josep
 */
/*Clase detalle de Servicio, aca se genera la clase principal
por medio de un objeto llamado DetalleServicio. Ademas se incluyen sus respectivos
Getter y Setter*/
public class DetalleServicio{
    private int idGuia;
    private int monto;
    private String observaciones;
    private String estado;

    public DetalleServicio(int idGuia, int monto, String observaciones, String estado) {
        this.idGuia = idGuia;
        this.monto = monto;
        this.observaciones = observaciones;
        this.estado = estado;
    }

    public int getIdGuia() {
        return idGuia;
    }

    public void setIdGuia(int idGuia) {
        this.idGuia = idGuia;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
