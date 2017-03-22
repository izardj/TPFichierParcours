package presentation;
import java.io.File;

public class Lanceur {

	public static void main(String[] args) {

		String rep = "C:/";
		
		File f = new File(rep);
		
		if (f.exists()) {
			for (File f2 : f.listFiles()) {
				if(f2.isDirectory()) {
					System.out.println("DOSSIER : " + f2.getName());
				}
				else {
					long size = f2.length()/1024;
					System.out.println("FICHIER : " + f2.getName() + " (" + size + "Kb)");
				}
			}
		}
		else {
			System.out.println(rep+ " n'existe pas");
		}

				
	}

}
