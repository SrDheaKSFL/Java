/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas;
  import java.util.*;
/**
 *
 * @author LENOVO
 */
public class Dequee {
 

    public static void main(String[] args)
    {
        // Initializing an deque/ isialisasi pada sebua que
        Deque<String> dq= new ArrayDeque<String>();
        Deque<String> di= new ArrayDeque<String>();
 
        // add() method to insert/membuat method untuk diinsert
        dq.add("<html>");
        dq.addFirst(" Contoh HTML Yang Benar:    ");
        dq.addLast(" JUDUL");
        dq.add("</html>");
 // membuat perulangan untuk menghasilkan cetakan
        for (Iterator itr = dq.iterator();
             itr.hasNext();) {
            
            System.out.print(itr.next() + " ");
        }
 
        System.out.println("");// mencetak baris kosong
    
    

 
        di.add("<html");
        di.addFirst(" Contoh HTML Yang Salah:    ");// mencetak tulisan yang di cetak pertama
        di.addLast(" JUDUL");
        di.add("</html>");
 // membuat perulangan baru dalam nama yang berbeda
        for (Iterator itr = di.iterator();
             itr.hasNext();) {
            
            System.out.print(itr.next() + " ");
            
        }
        
    }
} 

