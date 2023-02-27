/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quee;

/**
 *
 * @author LENOVO
 */
public class Quee {
 int size;
    int front;
    int rear;
    int element [];
    public Quee(int a)
    {
       element = new int [a];
        this.front = -1;
        this.size=0;
        this.rear=-1;
    }
    public boolean isEmpty() {
        return size==0;
    }
    public boolean isFull()
    {
        return element.length == size;
    }
      public boolean enQuee(int a){
          if(!isFull()){
              element[rear]=a;
              if (rear == element.length -1){
                  rear = 0;
              }
              else {
                  rear++;
              }
              size++;
              return true;
              }
              return false;
              
          }
          public int Dequee(){
            
              
              
         
      


    
