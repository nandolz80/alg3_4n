
public class Triangulo extends Shape {

	private Ponto p0 = new Ponto();
	private Ponto p1 = new Ponto();
	private Ponto p2 = new Ponto();
	
	public void desenha( Cor c, Imagem img ) {
		Reta reta = new Reta();
		reta.setPontos(p0.x, p0.y, p1.x, p1.y);
		reta.desenha(c, img);
		
		reta.setPontos(p0.x, p0.y, p2.x, p2.y);
		reta.desenha(c, img);
		
		reta.setPontos(p2.x, p2.y, p1.x, p1.y);
		reta.desenha(c, img);		
	}
	
	public void setPontos(int x0, int y0, int x1, int y1, int x2, int y2){
		this.p0.x = x0;
		this.p0.y = y0;
		this.p1.x = x1;
		this.p1.y = y1;
		this.p2.x = x2;
		this.p2.y = y2;		
	}
}