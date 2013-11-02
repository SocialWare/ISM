/*
 * The MIT License
 *
 * Copyright 2013 SocialWare.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.ism;

/**
 *
 * @author moni
 */
public class Participante {
    private int iID;
    private String sNombre;
    private String sTipo;
    private String sTitulo;
    private String sDireccion;
    private String sCiudad;
    private String sEstado;
    private String sCP;
    private String sTelefono;
    
    public Participante(int iID, String sNombre ,String sTipo) {
        this.iID = iID;
        this.sNombre = sNombre;
        this.sTipo = sTipo;
        this.sTitulo = "";
        this.sDireccion = "";
        this.sCiudad = "";
        this.sEstado = "";
        this.sCP = "";
        this.sTelefono = "";	
    }
    
    public Participante(int iID, String sNombre ,String sTipo, String sTitulo, String sDireccion, String sCiudad, String sEstado, String sCP, String sTelefono) {
        this.iID = iID;
        this.sNombre = sNombre;
        this.sTipo = sTipo;
        this.sTitulo = sTitulo;
        this.sDireccion = sDireccion;
        this.sCiudad = sCiudad;
        this.sEstado = sEstado;
        this.sCP = sCP;
        this.sTelefono = sTelefono;	
	}
    
    /**
     * Metodo modificador usado para cambiar el ID del participante 
     * @param iID es el <code>id</code> del objeto.
     */
    public void setiID(int iID) {
        this.iID = iID;
    }
    
    /**
     * Metodo de acceso que regresa el ID del participante  
     * @return iID es el <code>id</code> del objeto.
     */
    public int getiID() {
        return iID;
    }
    
    /**
     * Metodo modificador usado para cambiar el nombre del participante 
     * @param sNombre es el <code>nombre</code> del objeto.
     */
    public void setSNombre(String sNombre) {
        this.sNombre = sNombre;
    }
    
    /**
     * Metodo de acceso que regresa el nombre del participante  
     * @return sNombre es el <code>nombre</code> del objeto.
     */
    public String getsNombre() {
        return sNombre;
    }
    
    /**
     * Metodo modificador usado para cambiar el nombre del participante 
     * @param sTipo es el <code>tipo</code> del objeto.
     */
    public void setsTipo(String sTipo) {
        this.sTipo = sTipo;
    }
    
    /**
     * Metodo de acceso que regresa el tipo del participante  
     * @return sTipo es el <code>tipo</code> del objeto.
     */
    public String getsTipo() {
        return sTipo;
    }
    
    /**
     * Metodo modificador usado para cambiar el Titulo del participante 
     * @param sTitulo es el <code>tipo</code> del objeto.
     */
    public void setsTitulo(String sTitulo) {
        this.sTitulo = sTitulo;
    }
    
    /**
     * Metodo de acceso que regresa el tipo del participante  
     * @return sTitulo es el <code>titulo</code> del objeto.
     */
    public String sTitulo() {
        return sTitulo;
    }
    
    /**
     * Metodo modificador usado para cambiar la direccion del participante 
     * @param sDireccion es la <code>direccion</code> del objeto.
     */
    public void setsDireccion(String sDireccion) {
        this.sDireccion = sDireccion;
    }
    
    /**
     * Metodo de acceso que regresa el tipo del participante  
     * @return sDireccion es la <code>direccion</code> del objeto.
     */
    public String getsDireccion() {
        return sDireccion;
    }
    
    /**
     * Metodo modificador usado para cambiar la ciudad del participante 
     * @param sCiudad es la <code>ciudad</code> del objeto.
     */
    public void setsCiudad(String sCiudad) {
        this.sCiudad = sCiudad;
    }
    
    /**
     * Metodo de acceso que regresa la ciudad del participante  
     * @return sCiudad es la <code>ciudad</code> del objeto.
     */
    public String getsCiudad() {
        return sCiudad;
    }
    
    /**
     * Metodo modificador usado para cambiar el estado del participante 
     * @param sEstado es el <code>estado</code> del objeto.
     */
    public void setsEstado(String sEstado) {
        this.sEstado = sEstado;
    }
    
    /**
     * Metodo de acceso que regresa el estado del participante  
     * @return sEstado es el <code>estado</code> del objeto.
     */
    public String getsEstado() {
        return sEstado;
    }
    
    /**
     * Metodo modificador usado para cambiar el CP del participante 
     * @param sCP es el <code>CP</code> del objeto.
     */
    public void setsCP(String sCP) {
        this.sCP = sCP;
    }
    
    /**
     * Metodo de acceso que regresa el CP del participante  
     * @return sCP es el <code>CP</code> del objeto.
     */
    public String getsCP() {
        return sCP;
    }
    
    /**
     * Metodo modificador usado para cambiar el telefono del participante 
     * @param sTelefono es el <code>telefono</code> del objeto.
     */
    public void setsTelefono(String sTelefono) {
        this.sTelefono = sTelefono;
    }
    
    /**
     * Metodo de acceso que regresa el telefono del participante  
     * @return sTelefono es el <code>telefono</code> del objeto.
     */
    public String getsTelefono() {
        return sTelefono;
    }
    
}
