/*
 * The MIT License
 *
 * Copyright 2013 JLo.
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
public class Session {
    
    private String sSessionName;
    private String sTriggering;
    private boolean bHasTriggering;
    private LinkedList<Participant> lParticipants;
    private boolean bHasParticipants;
    private LinkedList<Element> lElements;
    private boolean bHasElements;
    
    /**
     *
     * @param name
     */
    public Session(String name){
        this.sSessionName = name;
        this.bHasTriggering = false;
        this.bHasParticipants = false;
        this.bHasElements = false;
    }
    
    /**
     * Setting Name method
     * @param name is the <code>name</code> of the Session Object
     */
    public void setSessionName(String name){
        this.sSessionName = name;
    }
    
    /**
     *  Access method to the session name
     * @return sSessionName is the <code>sSessionName</code> of the object.
     */
    public String getSessionName(){
        return this.sSessionName;
    }
    
    /**
     *  Setting the triggering question
     * @param triggering Is the <code>triggering</code> of the object.
     */
    public void setTriggering(String triggering){
        this.sTriggering = triggering;
    }
    
    /**
     * Access method to the Triggering question 
     * @return sTriggering 
     */
    public String getTriggering(){
        return this.sTriggering;
    }
    
    /**
     * Setting the  has triggering boolean 
     * @param hasTriggering
     */
    public void setHasTriggering(boolean hasTriggering){
        this.bHasTriggering = hasTriggering;
    }
    
    /**
     * Access method to the has triggering boolean
     * @return bHayTriggering
     */
    public boolean getHasTriggering(){
        return this.bHasTriggering;
    }
    
}
