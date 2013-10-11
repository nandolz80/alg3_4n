
public class Retangulo extends Shape {

	private Ponto p0 = new Ponto();
	private Ponto p1 = new Ponto();

	public void desenha(Cor c, Imagem img){
		Ponto ponto  = new Ponto();	
		
		img.SetPixel(p0, c);
		img.SetPixel(p1, c);

		for (int i = 0; i <= (p1.x - p0.x); i++){
			ponto.x = p0.x + i;
			ponto.y = p0.y;
			img.SetPixel(ponto, c);
		}
		
		for (int i = 0; i <= (p1.y - p0.y); i++){
			ponto.x = p0.x;
			ponto.y = p0.y + i;
			img.SetPixel(ponto, c);
		}

		for (int i = 0; i <= (p1.x - p0.x); i++){
			ponto.x = p0.x + i;
			ponto.y = p1.y;
			img.SetPixel(ponto, c);
		}
		
		for (int i = 0; i <= (p1.y - p0.y); i++){
			ponto.x = p1.x;
			ponto.y = p0.y + i;
			img.SetPixel(ponto, c);
		}
	}

	public void setPontos( int x0, int y0, int x1, int y1 ){
		if (x0 <= x1) {
			this.p0.x = x0;
			this.p1.x = x1;	
		} else {
			this.p0.x = x1;
			this.p1.x = x0;
		}
		if (y0 <= y1) {
			this.p0.y = y0;
			this.p1.y = y1;			
		} else {
			this.p0.y = y1;
			this.p1.y = y0;
		}		
    }
}
