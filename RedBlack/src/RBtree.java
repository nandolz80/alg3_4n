

 class RBTree
 {
     private RedBlackNode current;
     private RedBlackNode parent;
     private RedBlackNode grand;
     private RedBlackNode great;
     private RedBlackNode header;    
     private static RedBlackNode nullNode;
    
     static 
     {
         nullNode = new RedBlackNode(0);
         nullNode.esquerda = nullNode;
         nullNode.direita = nullNode;
     }
    
     static final int BLACK = 1;    
     static final int RED   = 0;
 
     
     public RBTree(int negInf)
     {
         header = new RedBlackNode(negInf);
         header.esquerda = nullNode;
         header.direita = nullNode;
     }
    
     public boolean isEmpty()
     {
         return header.direita == nullNode;
     }
    
     public void makeEmpty()
     {
         header.direita = nullNode;
     }
    
     public void insert(int item )
     {
         current = parent = grand = header;
         nullNode.elemento = item;
         while (current.elemento != item)
         {            
             great = grand; 
             grand = parent; 
             parent = current;
             current = item < current.elemento ? current.esquerda : current.direita;
                 
             if (current.esquerda.cor == RED && current.direita.cor == RED)
                 handleReorient( item );
         }
        
         if (current != nullNode)
             return;
         current = new RedBlackNode(item, nullNode, nullNode);
        
         if (item < parent.elemento)
             parent.esquerda = current;
         else
             parent.direita = current;        
         handleReorient( item );
     }
     private void handleReorient(int item)
     {
         
         current.cor = RED;
         current.esquerda.cor = BLACK;
         current.direita.cor = BLACK;
 
         if (parent.cor == RED)   
         {
             
             grand.cor = RED;
             if (item < grand.elemento != item < parent.elemento)
                 parent = rotate( item, grand );  // Start dbl rotate
             current = rotate(item, great );
             current.cor = BLACK;
         }
        
         header.direita.cor = BLACK; 
     }      
     private RedBlackNode rotate(int item, RedBlackNode parent)
     {
         if(item < parent.elemento)
             return parent.esquerda = item < parent.esquerda.elemento ? rotateWithLeftChild(parent.esquerda) : rotateWithRightChild(parent.esquerda) ;  
         else
             return parent.direita = item < parent.direita.elemento ? rotateWithLeftChild(parent.direita) : rotateWithRightChild(parent.direita);  
     }
    
     private RedBlackNode rotateWithLeftChild(RedBlackNode k2)
     {
         RedBlackNode k1 = k2.esquerda;
         k2.esquerda = k1.direita;
         k1.direita = k2;
         return k1;
     }
    
     private RedBlackNode rotateWithRightChild(RedBlackNode k1)
     {
         RedBlackNode k2 = k1.direita;
         k1.direita = k2.esquerda;
         k2.esquerda = k1;
         return k2;
     }
    
     public int countNodes()
     {
         return countNodes(header.direita);
     }
     private int countNodes(RedBlackNode r)
     {
         if (r == nullNode)
             return 0;
         else
         {
             int l = 1;
             l += countNodes(r.esquerda);
             l += countNodes(r.direita);
             return l;
         }
     }
    
     public boolean search(int val)
     {
         return search(header.direita, val);
     }
     private boolean search(RedBlackNode r, int val)
     {
         boolean found = false;
         while ((r != nullNode) && !found)
         {
             int rval = r.elemento;
             if (val < rval)
                 r = r.esquerda;
             else if (val > rval)
                 r = r.direita;
             else
             {
                 found = true;
                 break;
             }
             found = search(r, val);
         }
         return found;
     }
    
     public void inorder()
     {
         inorder(header.direita);
     }
     private void inorder(RedBlackNode r)
     {
         if (r != nullNode)
         {
             inorder(r.esquerda);
             char c = 'B';
             if (r.cor == 0)
                 c = 'R';
             System.out.print(r.elemento +""+c+" ");
             inorder(r.direita);
         }
     }
    
     public void preorder()
     {
         preorder(header.direita);
     }
     private void preorder(RedBlackNode r)
     {
         if (r != nullNode)
         {
             char c = 'B';
             if (r.cor == 0)
                 c = 'R';
             System.out.print(r.elemento +""+c+" ");
             preorder(r.esquerda);             
             preorder(r.direita);
         }
     }
    
     public void postorder()
     {
         postorder(header.direita);
     }
     private void postorder(RedBlackNode r)
     {
         if (r != nullNode)
         {
             postorder(r.esquerda);             
             postorder(r.direita);
             char c = 'B';
             if (r.cor == 0)
                 c = 'R';
             System.out.print(r.elemento +""+c+" ");
         }
     }     
 }