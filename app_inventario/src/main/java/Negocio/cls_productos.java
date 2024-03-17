package Negocio;

public class cls_productos {

    private String codigoStr;
    private String nombreStr;
    private int cantidadInt;
    private float precioFlt;

    public cls_productos(String codigoStr, String nombreStr, float precioFlt) {
        this.codigoStr = codigoStr;
        this.nombreStr = nombreStr;
        this.cantidadInt = cantidadInt;
        this.precioFlt = precioFlt;
    }

    public String getCodigoStr() {
        return codigoStr;
    }

    public void setCodigoStr(String codigoStr) {
        this.codigoStr = codigoStr;
    }

    public String getNombreStr() {
        return nombreStr;
    }

    public void setNombreStr(String nombreStr) {
        this.nombreStr = nombreStr;
    }

    public int getCantidadInt() {
        return cantidadInt;
    }

    public void setCantidadInt(int cantidadInt) {
        this.cantidadInt = cantidadInt;
    }

    public float getPrecioFlt() {
        return precioFlt;
    }

    public void setPrecioFlt(float precioFlt) {
        this.precioFlt = precioFlt;
    }


    
    
}