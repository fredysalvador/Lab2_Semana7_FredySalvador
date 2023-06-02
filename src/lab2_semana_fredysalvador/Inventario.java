/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2_semana_fredysalvador;

/**
 *
 * @author Fredy Salvador
 */
public class Inventario {
    private int id;
    private String name;
    private int categoria;
    private double precio;
    private String aisle;
    private String bin;

    public Inventario(int id, String name, int categoria, double precio, String aisle, String bin) {
        this.id = id;
        this.name = name;
        this.categoria = categoria;
        this.precio = precio;
        this.aisle = aisle;
        this.bin = bin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getAisle() {
        return aisle;
    }

    public void setAisle(String aisle) {
        this.aisle = aisle;
    }

    public String getBin() {
        return bin;
    }

    public void setBin(String bin) {
        this.bin = bin;
    }

    @Override
    public String toString() {
        return "Inventario{" + "id=" + id + ", name=" + name + ", categoria=" + categoria + ", precio=" + precio + ", aisle=" + aisle + ", bin=" + bin + '}';
    }

    
}
