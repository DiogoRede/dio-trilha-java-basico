import models.Iphone;

public class Main {

	public static void main(String[] args) {
		Iphone iphone = new Iphone(1L, "Iphone 11", "White", "1.1");
		iphone.ligar("18994533434");
		iphone.adicionarNovaAba();
		iphone.atender("0303030");
	}

}