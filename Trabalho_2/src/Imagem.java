import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Imagem {

	private int[][] img;
	private String Cor = "";
	
	public Imagem(int alt, int lar, String Cor) {
		this.img = new int[alt][lar];
		this.Cor = Cor;
	}
	
	public String getCor() {
		return Cor;
	}
	
	public void Salvar(String filename) throws IOException {
		BufferedWriter out = new BufferedWriter( new FileWriter(filename + ".pnm") );

		if (this.Cor.equalsIgnoreCase("g")){
			out.write(String.format("P2\n%d %d\n255\n", img[0].length, img[0].length));
		} else {
			out.write(String.format("P3\n%d %d\n255\n", img[0].length, img[0].length));
		}
	
		for (int[] linha : img) {
			for (int v : linha){
				out.write(String.format("%d ", v));
			}
		}	
		out.close();
	}	

	public void SetPixel(Ponto p, Cor c){
 
		if (this.Cor.equalsIgnoreCase("g")){
			img[p.x][p.y] = c.getGrey();
		}		
	}	
}
