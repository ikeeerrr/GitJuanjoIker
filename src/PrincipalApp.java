import java.util.*;

public class PrincipalApp {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		int aleatorio;
		
		ArrayList<String> porteros = new ArrayList<String>();
		ArrayList<String> defensas = new ArrayList<String>();
		ArrayList<String> medios = new ArrayList<String>();
		ArrayList<String> delanteros = new ArrayList<String>();
		
		ArrayList<String> equipo = new ArrayList<String>();
		
		
		porteros.addAll(Arrays.asList("Kepa", "Oblak", "TerStegen","Remiro", "Valles", "Dimitrevski"));
		defensas.addAll(Arrays.asList("Rudiger", "Araujo", "LeNormand", "Savic", "Albiol", "Lejeune", "Gaya", "Carvajal", "EricGarcia", "Kounde", "Blind", "Vivian"));
		medios.addAll(Arrays.asList("Modric", "Pedri", "DePaul", "Isco", "Kubo", "Moleiro", "Bellingham"));
		delanteros.addAll(Arrays.asList("Griezmann", "Vinicius", "Lewandoski", "Aspas", "GMoreno", "NWilliams"));
		
		System.out.println("Cuántos equipos quieres hacer?(Máximo 5)");
		numEquipos = sc.nextInt();
		
		ArrayList <ArrayList<String>> equipos = new ArrayList <ArrayList<String>>
		
		for(int i=1; i<=numEquipos; i++) {
			ArrayList<String> equipo = new ArrayList<String>();
		aleatorio = (int)(Math.random()*porteros.size()); 
		equipo.add( porteros.remove(aleatorio) );
		aleatorio = (int)(Math.random()*defensas.size());
		equipo.add( defensas.remove(aleatorio) );
		aleatorio = (int)(Math.random()*defensas.size());
		equipo.add( defensas.remove(aleatorio) );
		aleatorio = (int)(Math.random()*medios.size());
		equipo.add( medios.remove(aleatorio) );
		aleatorio = (int)(Math.random()*delanteros.size());
		equipo.add( delanteros.remove(aleatorio) );
		
		equipos.add(equipo);
		}
		System.out.println(equipos);
		for(int i=0; i<=numEquipos;i++) {
			System.out.println("Equipo " + (i+1) + ": " + equipos.get(i));
		}
		
		System.out.println("-------------------------");
		System.out.println("Reservas: " + porteros);
		System.out.println(defensas);
		System.out.println(medios);
		System.out.println(delanteros);


		

		
		
	}

}
