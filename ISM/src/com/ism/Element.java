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
public class Element {
    
    private int iID;
    private int iIDParticipant;
    private String sIdea;
    private String sClarification;
    
    public Element(int iID, int iIDParticipant, String sIdea, String sClarification) {
        this.iID = iID;
        this.iIDParticipant = iIDParticipant;
        this.sIdea = sIdea;
        this.sClarification = sClarification;
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
    public void setiIDParticipant(int iIDParticipant) {
        this.iIDParticipant = iIDParticipant;
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
    public void setsClarification(String sClarification) {
        this.sClarification = sClarification;
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
     * @return iIDParticipant es el <code>id del participante</code> del objeto.
     */
    public int getiIDParticipant() {
        return iIDParticipant;
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
     * @return sClarification es la <code>clarificacion</code> de la idea del objeto.
     */
    public String getsClarification() {
        return sIdea;
    }   
}