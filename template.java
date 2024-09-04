import java.io.*;
import java.util.*;

public class CowSignal {

	public static void main(String[] args) throws IOException {

			Kattio io = new Kattio("cowsignal");

		}

	static class Kattio extends PrintWriter {
		private BufferedReader r;
		private StringTokenizer st;

		public Kattio() {this(System.in, System.out);}

		public Kattio(InputStream i, OutputStream o) {
			super(o);
			r = new BufferedReader(new InputStreamReader(i));
		}

		public Kattio(String problem) throws IOException {
			super(problem + ".out");
			r = new BufferedReader(new FileReader(problem + ".in"));
		}

		public String next() {
			try {
				while (st == null || !st.hasMoreTokens())
					st = new StringTokenizer(r.readLine());
				return st.nextToken();
			} catch (Exception e) {}
			return null;
		}

		public int nextInt() {return Integer.parseInt(next());}
		public double nextDouble() {return Double.parseDouble(next());}
		public long nextLong() {return Long.parseLong(next());}
		}
}
