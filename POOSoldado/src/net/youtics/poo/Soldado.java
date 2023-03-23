package net.youtics.poo;

import java.util.SimpleTimeZone;

public class Soldado extends Persona {

    private String regimiento;//regimiento 1, 2,...
    private static Integer cantidadSoldados=0;
    private Integer id;

    public Soldado() {
    }

    public Soldado(String regimiento) {
        this.regimiento = regimiento;
    }

    public Soldado(String nombreYApe, Integer dni, String regimiento) {
        super(nombreYApe, dni);
        this.regimiento = regimiento;
        this.id = ++Soldado.cantidadSoldados;
        this.atacar();
    }

    public static Integer getCantidadSoldados() {
        return cantidadSoldados;
    }

    public static void setCantidadSoldados(Integer cantidadSoldados) {
        Soldado.cantidadSoldados = cantidadSoldados;
    }

    public String getRegimiento() {
        return regimiento;
    }

    public void setRegimiento(String regimiento) {
        this.regimiento = regimiento;
    }
    public void atacar(){
        if(Soldado.cantidadSoldados>=4){
            System.out.println("El soldado esta atancando...");
        }else{
            System.out.println("No estan listos...");
        }
    }

    @Override
    public String toString() {
        return "Regimiento: " + regimiento + '\n' +
                "\nID: " + this.id + '\n' +
                super.toString() /*+
                "\nCantidad de Soldados: " + Soldado.cantidadSoldados*/;
    }
}
