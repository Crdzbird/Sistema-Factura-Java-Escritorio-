package Clases;

public class Producto {
    private String idProducto;
    private String descripcion;
    private double precio;
    private int IGV; // 0=0%, 1=10%, 2=16%
    private String nota;

    public Producto(String idProducto, String descripcion, double precio, int IGV, String nota) {
        this.idProducto = idProducto;
        this.descripcion = descripcion;
        this.precio = precio;
        this.IGV = IGV;
        this.nota = nota;
    }

    public String getIdProducto() {
        return idProducto;
    }
    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getIGV() {
        return IGV;
    }
    public void setIGV(int IGV) {
        this.IGV = IGV;
    }

    public String getNota() {
        return nota;
    }
    public void setNota(String nota) {
        this.nota = nota;
    }
    
    
}
