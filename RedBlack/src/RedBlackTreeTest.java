import java.util.Scanner;

 /* Class RedBlackTreeTest */
 public class RedBlackTreeTest
 {
     public static void main(String[] args)
     {            
        Scanner scan = new Scanner(System.in);
       
        RBTree rbt = new RBTree(Integer.MIN_VALUE); 
        System.out.println("Red Black\n");          
        char ch;
        
        do    
        {
            System.out.println("\nRed Black Tree MENU\n");
            System.out.println("1. Adicionar ");
            System.out.println("2. Buscar");
            System.out.println("3. Contar nodes");
            System.out.println("4. Checar vazio");
            System.out.println("5. Limpar tree");
 
            int choice = scan.nextInt();            
            switch (choice)
            {
            case 1 : 
                System.out.println("Adicionar elemento inteiro");
                rbt.insert( scan.nextInt() );                     
                break;                          
            case 2 : 
                System.out.println("Digite elemento inteiro para busca");
                System.out.println("Busca resulto : "+ rbt.search( scan.nextInt() ));
                break;                                          
            case 3 : 
                System.out.println("Nodes = "+ rbt.countNodes());
                break;     
            case 4 : 
                System.out.println("Status Vazio = "+ rbt.isEmpty());
                break;     
            case 5 : 
                System.out.println("\nLimpar arvore");
                rbt.makeEmpty();
                break;         
            default : 
                System.out.println("Opção inválida \n ");
                break;    
            }
           
            System.out.print("\nPos ordem : ");
            rbt.postorder();
            System.out.print("\nPre ordem : ");
            rbt.preorder();
            System.out.print("\nOrdenado : ");
            rbt.inorder(); 
 
            System.out.println("\nContinue (y ou n) \n");
            ch = scan.next().charAt(0);                        
        } while (ch == 'Y'|| ch == 'y');  
        System.out.println("Fechando programa...");
     }
 }