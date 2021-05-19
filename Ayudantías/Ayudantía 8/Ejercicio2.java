import java.util.*;

public class Ejercicio2 {

	public static class Alumno {
		int NEM;
		int Ranking;
		int PTU_Lenguaje;
		int PTU_Matematica;
		int PTU_Ciencias;
		int Ponderacion;

		public Alumno(int NEM, int Ranking, int PTU_Lenguaje, int PTU_Matematica, int PTU_Ciencias) {
			this.NEM = NEM;
			this.Ranking = Ranking;
			this.PTU_Lenguaje = PTU_Lenguaje;
			this.PTU_Matematica = PTU_Matematica;
			this.PTU_Ciencias = PTU_Ciencias;
		}

		public void setPonderacion(int p1, int p2, int p3, int p4, int p5) {
			this.Ponderacion = (NEM * p1 + Ranking * p2 + PTU_Lenguaje * p3 + PTU_Matematica * p4 + PTU_Ciencias * p5)
					/ 100;
		}
	}

	public static class ComparadorAlumnos implements Comparator<Alumno> {
		public int compare(Alumno a1, Alumno a2) {
			return a2.Ponderacion - a1.Ponderacion;
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n, c;
		int NEM, Ranking, PTU_Lenguaje, PTU_Matematica, PTU_Ciencias;
		int p1, p2, p3, p4, p5;
		PriorityQueue<Alumno> maxHeap = new PriorityQueue<>(new ComparadorAlumnos());

		n = sc.nextInt();
		c = sc.nextInt();
		p1 = sc.nextInt();
		p2 = sc.nextInt();
		p3 = sc.nextInt();
		p4 = sc.nextInt();
		p5 = sc.nextInt();

		for (int i = 0; i < n; i++) {
			NEM = sc.nextInt();
			Ranking = sc.nextInt();
			PTU_Lenguaje = sc.nextInt();
			PTU_Matematica = sc.nextInt();
			PTU_Ciencias = sc.nextInt();
			Alumno A = new Alumno(NEM, Ranking, PTU_Lenguaje, PTU_Matematica, PTU_Ciencias);
			A.setPonderacion(p1, p2, p3, p4, p5);
			maxHeap.add(A);
		}
		for (int i = 0; i < c; i++) {
			System.out.println(maxHeap.poll().Ponderacion);
		}
	}
}
