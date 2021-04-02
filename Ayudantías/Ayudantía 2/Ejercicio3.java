import java.util.*;

public class Ejercicio3 {

	public static class Influencer {
		int a;
		int b;

		public Influencer(int a, int b) {
			this.a = a;
			this.b = b;
		}
	}

	public static class ComparadorInfluencer implements Comparator<Influencer> {
		public int compare(Influencer i1, Influencer i2) {
			return (i2.a + i2.b) - (i1.a + i1.b);
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a, b, n;
		ArrayList<Influencer> influencers = new ArrayList<>();

		n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			Influencer I = new Influencer(a, b);
			influencers.add(I);
		}

		Collections.sort(influencers, new ComparadorInfluencer());

		for (int i = 0; i < n; i++) {
			System.out.print(influencers.get(i).a);
			System.out.print(" ");
			System.out.println(influencers.get(i).b);
		}
	}
}
