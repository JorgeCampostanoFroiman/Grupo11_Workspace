package entidad;

import java.math.BigDecimal;

public class Seguro {
    private int id;
    private String descripcion;
    private int tipo;
    private String tipoDescripcion;
    private BigDecimal costo;
    private BigDecimal costoMaximo;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public int getTipo() {
        return tipo;
    }
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    public String getTipoDescripcion() {
        return tipoDescripcion;
    }
    public void setTipoDescripcion(String tipoDescripcion) {
        this.tipoDescripcion = tipoDescripcion;
    }
    public BigDecimal getCosto() {
        return costo;
    }
    public void setCosto(BigDecimal costo) {
        this.costo = costo;
    }
    public BigDecimal getCostoMaximo() {
        return costoMaximo;
    }
    public void setCostoMaximo(BigDecimal costoMaximo) {
        this.costoMaximo = costoMaximo;
    }

    @Override
    public String toString() {
        return "Seguro [id=" + id + ", descripcion=" + descripcion + 
        		", tipoDescripcion=" + tipoDescripcion + ", costo=" + 
        		costo + ", costoMaximo=" + costoMaximo + "]";
    }
}
