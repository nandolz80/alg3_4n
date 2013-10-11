import java.io.IOException;
import java.util.Scanner;

public class Princ_Sys {

	public static void main(String[] args){
		Scanner Ler = new Scanner(System.in);
		Imagem img = new Imagem(0, 0, "");
		Cor cor = new Cor(0);
		String cmd;

		do{				
			System.out.println("Informe o comando: ");
			cmd = Ler.next();

			if (cmd.equalsIgnoreCase("imagem")){
				int p1 = Ler.nextInt();
				int p2 = Ler.nextInt();
				String p3 = Ler.next();			
				
				img = new Imagem( p1, p2, p3 );
			}
			
			if (cmd.equalsIgnoreCase("salvar")){
				String nomeArq = Ler.next();
				
				try{
					img.Salvar(nomeArq);
				} catch (IOException e) {
					System.out.println(e.getMessage());
					e.printStackTrace(System.out);
				}
			}
					
			if (cmd.equalsIgnoreCase("cor")){
	    		if (img.getCor().equalsIgnoreCase("g")){
	        		int pGrey = Ler.nextInt();
	    			cor = new Cor( pGrey );
				} else {
					int red = Ler.nextInt();
					int green = Ler.nextInt();
					int blue = Ler.nextInt();
					cor = new Cor(red, green, blue);
				}
			}

			if (cmd.equalsIgnoreCase("retangulo")){
				int x0 = Ler.nextInt();
				int y0 = Ler.nextInt();
				int x1 = Ler.nextInt();
				int y1 = Ler.nextInt();
				
				Retangulo retangulo = new Retangulo();
				retangulo.setPontos(y0, x0, y1, x1);
				retangulo.desenha(cor, img);				
			}
			
			if (cmd.equalsIgnoreCase("reta")){
				int x0 = Ler.nextInt();
				int y0 = Ler.nextInt();
				int x1 = Ler.nextInt();
				int y1 = Ler.nextInt();
				
				Reta reta = new Reta();
				reta.setPontos(y0, x0, y1, x1);
				reta.desenha(cor, img);
			}
			
			if (cmd.equalsIgnoreCase("triangulo")){
				int x0 = Ler.nextInt();
				int y0 = Ler.nextInt();
				int x1 = Ler.nextInt();
				int y1 = Ler.nextInt();
				int x2 = Ler.nextInt();
				int y2 = Ler.nextInt();
				
				Triangulo triangulo = new Triangulo();
				triangulo.setPontos(y0, x0, y1, x1, y2, x2);
				triangulo.desenha(cor, img);
			}
			
			if (cmd.equalsIgnoreCase("circulo")){
				int x = Ler.nextInt();
				int y = Ler.nextInt();
				int raio = Ler.nextInt();
				
				Circulo circulo = new Circulo( );
				circulo.setCentro(x, y);
				circulo.setRaio(raio);
				circulo.desenha(cor, img);
			}
			
		} while (!cmd.equalsIgnoreCase("fim"));
		Ler.close();
	}	
}
