/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package plantas;

/**
 *
 * @author LABORATORIOS
 */
public abstract class Planta {

    protected long id;
    protected int vida;
    protected int ataque;
    protected int costo;
    protected static long contadorPlantas = 1;

    protected Planta(int vida, int ataque, int costo) {
        this.id = contadorPlantas++;
        this.vida = vida;
        this.ataque = ataque;
        this.costo = costo;
    }

    public long getId() {
        return id;
    }

    public int getVida() {
        return vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getCosto() {
        return costo;
    }

    public boolean plantar(Planta planta, int solesDisponibles) {
        int precio = planta.getCosto();
        if (solesDisponibles >= precio) {
            solesDisponibles = solesDisponibles - precio;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return  "ID: " + id + " /n VIDA: " + vida;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object planta) {
        if (this == planta) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Planta other = (Planta) obj;
        return this.id == other.id;
    }
    
    
}
