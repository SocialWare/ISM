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

import java.util.*;

/**
 *
 * @author JLo
 */
public class Sesion {
    
    private String sNombreSesion;
    private String sTriggering;
    private boolean bHayTriggering;
    private LinkedList<Participante> lParticipantes;
    private boolean bHayParticipantes;
    private LinkedList<Elemento> lElementos;
    private boolean bHayElementos;
    
    public Sesion(String nombre){
        this.sNombreSesion = nombre;
        this.bHayTriggering = false;
        this.bHayParticipantes = false;
        this.bHayElementos = false;
    }
    
    public void setNombreSesion(String nombre){
        this.sNombreSesion = nombre;
    }
    
    public String getNombreSesion(){
        return this.sNombreSesion;
    }
    
    public void setTriggering(String triggering){
        this.sTriggering = triggering;
    }
    
    public String getTriggering(){
        return this.sTriggering;
    }
    
    public void setHayTriggering(boolean hayTriggering){
        this.bHayTriggering = hayTriggering;
    }
    
    public boolean getHayTriggering(){
        return this.bHayTriggering;
    }
    
}
