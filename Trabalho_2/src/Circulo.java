
public class Circulo extends Shape {

	private Ponto centro = new Ponto();
	private Ponto p  = new Ponto();
	private int raio;
	
	public void desenha( Cor c, Imagem img ) {
		int x = 0;
	    int y = raio;
	    int u = 1;
	    int v = 2 * raio - 1;
	    int E = 0;
		
		while ( x < y ) {
			p.x = centro.x + x;
			p.y = centro.y + y;
			img.SetPixel( p, c );

			p.x = centro.x + y;
			p.y = centro.y - x;
			img.SetPixel( p, c );

			p.x = centro.x - x;
			p.y = centro.y - y;
			img.SetPixel( p, c );

			p.x = centro.x - y;
			p.y = centro.y + x;
			img.SetPixel( p, c );

		    x++; E += u; u += 2;

		    if (v < 2 * E){
		    	y--; 
		    	E -= v; 
		    	v -= 2;
		    }
		    if (x > y) 
		    	break;

			p.x = centro.x + y;
			p.y = centro.y + x;
			img.SetPixel(p, c);

			p.x = centro.x + x;
			p.y = centro.y - y;
			img.SetPixel(p, c);
		    
			p.x = centro.x - y;
			p.y = centro.y - x;
			img.SetPixel(p, c);

			p.x = centro.x - x;
			p.y = centro.y + y;
			img.SetPixel(p, c);
		}
	}

	public void setCentro(int x, int y){
		this.centro.x = x;
		this.centro.y = y;
    }
	
	public void setRaio(int raio){
		this.raio = raio;
	}	
	
}
