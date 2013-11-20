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

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.print.*;
import java.awt.Font;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.event.PrintJobAdapter;
import javax.print.event.PrintJobEvent;
import java.io.IOException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 *Clase printTXT que es implementada cuando se le da click al boton print en el main de la aplicacion
 * @author SocialWare
 */
public class PrintTxt implements Printable, ActionListener{
    
        private LinkedList<Element> lista;
        String fileNameIdeas = "ideas.txt";
       
    
	public void actionPerformed(ActionEvent e) {
        System.out.println("actionperformred");
        //aqui se crea el printer job 
        PrinterJob job = PrinterJob.getPrinterJob();
        job.setPrintable(this);
        boolean ok = job.printDialog(); // aqui se escoge que impresora (dialog box de impresion)
        if (ok) {
            try { //job llama al metodo print
                job.print();
            } catch (PrinterException ex)
            { /* The job did not successfully complete */ }
        }
    }
        
      /*
       * Indicar la lista de elementos que se desea imprimir
       */
      public void setListaElementos(LinkedList<Element> lista){
          this.lista = lista;
      }
    public int print(Graphics g, PageFormat pf, int page)
      throws PrinterException {
        // We have only one page, and 'page'
        // is zero-based
        
   
        
        GenerateFile f = new GenerateFile();
            try {
                f.generaArchivoIdeas(lista);
            } catch (IOException ex) {
                Logger.getLogger(PrintTxt.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
         
        
        if (page > 0) {
             return NO_SUCH_PAGE;
        }

        // User (0,0) is typically outside the
        // imageable area, so we must translate
        // by the X and Y values in the PageFormat
        // to avoid clipping.
        Graphics2D g2d = (Graphics2D)g;
        g2d.translate(pf.getImageableX(), pf.getImageableY());

        // Now we perform our rendering
        
        g.drawString("Hello world!", 100, 100);
        

        // tell the caller that this page is part
        // of the printed document
        return PAGE_EXISTS;
  }
}
