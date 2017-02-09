package iesous.com.addusers;

import android.util.Log;

import java.text.DateFormat;

/**
 * Created by i5 on 20/01/2017.
 */

public class Persona {
    //datos personales
    private String Nombre;
    private String Apellidos;
    private double Peso;
    private double Estatura;
    private int Edad;
    private int Sexo;
    private String FechaNacimiento; //DD/MM/YYYY
    //constantes
    public static final int Hombre = 1;
    public static final int Mujer = 0;

    //Direccion
    private String Calle;
    private String Colonia;
    private String Ciudad;
    private String Estado;
    private String CodigoPostal;
    private String Pais;

    public String getCalle() {
        return Calle;
    }

    public void setCalle(String calle) {
        Calle = calle;
    }

    public String getColonia() {
        return Colonia;
    }

    public void setColonia(String colonia) {
        Colonia = colonia;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String ciudad) {
        Ciudad = ciudad;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }

    public String getCodigoPostal() {
        return CodigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        CodigoPostal = codigoPostal;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String pais) {
        Pais = pais;
    }



    public String getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        FechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }
    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }
    public double getPeso() {
        return Peso;
    }
    public void setPeso(double peso) {
        Peso = peso;
    }

    public double getEstatura() {
        return Estatura;
    }
    public void setEstatura(double estatura) {
        Estatura = estatura;
    }

    public int getEdad() {
        return Edad;
    }
    public void setEdad(int edad) {
        Edad = edad;
    }

    public int getSexo() {
        return Sexo;
    }
    public void setSexo(int sexo) {
        Sexo = sexo;
    }

    //Metodos de la superclase
    public String getInformation(){
        Log.d("SUPERCLASE","Nombre: " +Nombre);
        Log.d("SUPERCLASE","Apellidos: " +Apellidos);
        return Nombre+" "+Apellidos;
    }
}
