/*
 *  Java Program to Implement Red Black Tree
 */
 
 import java.util.Scanner;
 

 class RedBlackNode
 {    
     RedBlackNode esquerda, direita;
     int elemento;
     int cor;
 
   
     public RedBlackNode(int elemento)
     {
         this( elemento, null, null );
     } 
   
     public RedBlackNode(int elemento, RedBlackNode lt, RedBlackNode rt)
     {
         esquerda = lt;
         direita = rt;
         this.elemento = elemento;
         cor = 1;
     }    
 }
 
 
