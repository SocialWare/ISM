/*
 * The MIT License
 *
 * Copyright 2013 Socialware.
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
 * @author mariamontserratlozano
 */
public class Participant{

    private int iID;
    private String sName;
    private String sType;
    private String sTitle;
    private String sDirection;
    private String sCity;
    private String sEstate;
    private String sCP;
    private String sTelephone;
    
    public Participant(int iID, String sName ,String sType) {
        this.iID = iID;
        this.sName = sName;
        this.sType = sType;
        this.sTitle = "";
        this.sDirection = "";
        this.sCity = "";
        this.sEstate = "";
        this.sCP = "";
        this.sTelephone = "";	
    }
    
    public Participant(int iID, String sName ,String sType, String sTitle, String sDirection, String sCity, String sEstate, String sCP, String sTelephone) {
        this.iID = iID;
        this.sName = sName;
        this.sType = sType;
        this.sTitle = sTitle;
        this.sDirection = sDirection;
        this.sCity = sCity;
        this.sEstate = sEstate;
        this.sCP = sCP;
        this.sTelephone = sTelephone;	
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
     * @param sName es el <code>nombre</code> del objeto.
     */
    public void setSNombre(String sName) {
        this.sName = sName;
    }
    
    /**
     * Metodo de acceso que regresa el nombre del participante  
     * @return sName es el <code>nombre</code> del objeto.
     */
    public String getsName() {
        return sName;
    }
    
    /**
     * Metodo modificador usado para cambiar el nombre del participante 
     * @param sType es el <code>tipo</code> del objeto.
     */
    public void setsType(String sType) {
        this.sType = sType;
    }
    
    /**
     * Metodo de acceso que regresa el tipo del participante  
     * @return sType es el <code>tipo</code> del objeto.
     */
    public String getsType() {
        return sType;
    }
    
    /**
     * Metodo modificador usado para cambiar el Titulo del participante 
     * @param sTitle es el <code>tipo</code> del objeto.
     */
    public void setsTitle(String sTitle) {
        this.sTitle = sTitle;
    }
    
    /**
     * Metodo de acceso que regresa el tipo del participante  
     * @return sTitle es el <code>titulo</code> del objeto.
     */
    public String sTitle() {
        return sTitle;
    }
    
    /**
     * Metodo modificador usado para cambiar la direccion del participante 
     * @param sDirection es la <code>direccion</code> del objeto.
     */
    public void setsDirection(String sDirection) {
        this.sDirection = sDirection;
    }
    
    /**
     * Metodo de acceso que regresa el tipo del participante  
     * @return sDirection es la <code>direccion</code> del objeto.
     */
    public String getsDirection() {
        return sDirection;
    }
    
    /**
     * Metodo modificador usado para cambiar la ciudad del participante 
     * @param sCity es la <code>ciudad</code> del objeto.
     */
    public void setsCity(String sCity) {
        this.sCity = sCity;
    }
    
    /**
     * Metodo de acceso que regresa la ciudad del participante  
     * @return sCity es la <code>ciudad</code> del objeto.
     */
    public String getsCity() {
        return sCity;
    }
    
    /**
     * Metodo modificador usado para cambiar el estado del participante 
     * @param sEstate es el <code>estado</code> del objeto.
     */
    public void setsEstate(String sEstate) {
        this.sEstate = sEstate;
    }
    
    /**
     * Metodo de acceso que regresa el estado del participante  
     * @return sEstate es el <code>estado</code> del objeto.
     */
    public String getsEstate() {
        return sEstate;
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
     * @param sTelephone es el <code>telefono</code> del objeto.
     */
    public void setsTelephone(String sTelephone) {
        this.sTelephone = sTelephone;
    }
    
    /**
     * Metodo de acceso que regresa el telefono del participante  
     * @return sTelephone es el <code>telefono</code> del objeto.
     */
    public String getsTelephone() {
        return sTelephone;
    }
    
}
