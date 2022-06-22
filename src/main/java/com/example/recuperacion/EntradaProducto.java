package com.example.recuperacion;

public class EntradaProducto {
    private String codigo;
    private String descripcion;
    private String unidad;
    private float venta;
    private float compra;
    private int cantidad;

    public EntradaProducto(){

    }

    public EntradaProducto(String codigo, String descripcion, String unidad, float venta, float compra, int cantidad) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.unidad = unidad;
        this.venta = venta;
        this.compra = compra;
        this.cantidad = cantidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public float getVenta() {
        return venta;
    }

    public void setVenta(float venta) {
        this.venta = venta;
    }

    public float getCompra() {
        return compra;
    }

    public void setCompra(float compra) {
        this.compra = compra;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float calcularPrecioVenta(){
        return this.venta*this.cantidad;
    }
    public float calcularPrecioCompra(){
        return this.compra*this.cantidad;
    }
    public float calcularPrecioGanancia(){
        return calcularPrecioVenta()-calcularPrecioCompra();
    }
}
