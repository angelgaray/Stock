package MODELO;

public class Proveedor {
    
    private double idProveedor;
    private String razonSocial;
    private String descripcion;
    private String direccion;
    private String telefono;
    private double codigo;

    public double getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(double idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public double getCodigo() {
        return codigo;
    }

    public void setCodigo(double codigo) {
        this.codigo = codigo;
    }
}
