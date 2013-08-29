import javax.swing.*;
public class Principal {
	
	public static void main(String[] args) {
		
		Recursao r = new Recursao();
		//int n = 5;
		//int x = r.fatorial(n);
		//JOptionPane.showMessageDialog(null, "fatorial de " + n + "= " + x);
		int n = 10;
		int x = r.fibo(n);
		JOptionPane.showMessageDialog(null, "fibo de " + n + "= " + x);
		
		
	}

}
