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
 * @author Juan Pablo Romero
 */
public class Elemento {
    
    private int iID;
    private int iIDParticipante;
    private String sIdea;
    private String sClarificacion;
    
    public Elemento(int iID, int iIDParticipante, String sIdea, String sClarificacion) {
        this.iID = iID;
        this.iIDParticipante = iIDParticipante;
        this.sIdea = sIdea;
        this.sClarificacion = sClarificacion;
    }
    
    // GETS & SETS
    
     /**
     * Metodo modificador usado para cambiar el ID del elemento
     * @param iID es el <code>id</code> del objeto.
     */
    public void setiID(int iID) {
        this.iID = iID;
    }
    
     /**
     * Metodo modificador usado para cambiar el ID del participante que dio el elemento
     * @param iID es el <code>id</code> del objeto.
     */
    public void setiIDParticipante(int iIDParticipante) {
        this.iIDParticipante = iIDParticipante;
    }
    
     /**
     * Metodo modificador usado para cambiar la idea
     * @param sIdea es la <code>idea</code> en si
     */
    public void setsIdea(String sIdea) {
        this.sIdea = sIdea;
    }

     /**
     * Metodo modificador usado para cambiar la clarificacion de la idea
     * @param sIdea es la <code>clarificacion de la idea</code>
     */
    public void setsClarificacion(String sClarificacion) {
        this.sClarificacion = sClarificacion;
    }
    
     /**
     * Metodo de acceso que regresa el ID del Elemento  
     * @return iID es el <code>id</code> del objeto.
     */
    public int getiID() {
        return iID;
    }
    
     /**
     * Metodo de acceso que regresa el ID del participante que propuso el Elemento 
     * @return iIDParticipante es el <code>id del participante</code> del objeto.
     */
    public int getiIDParticipante() {
        return iIDParticipante;
    }
    
      /**
     * Metodo de acceso que regresa la idea en si
     * @return sIdea es la <code>idea</code> del objeto.
     */
    public String getsIdea() {
        return sIdea;
    }   
    
     /**
     * Metodo de acceso que regresa la clarificacion de la idea
     * @return sClarificacion es la <code>clarificacion</code> de la idea del objeto.
     */
    public String getsClarificacion() {
        return sIdea;
    }   
}
