public class Mondai4 {
	public static void main(String[] args) {
		int m = Integer.parseInt(args[0]);
		int n = Integer.parseInt(args[1]);
		int r = 0;

        while( (r = m % n) != 0 ) {
            m = n;
            n = r;					//最初のmとnの値を使いたい
        }
        System.out.println(m+" "+n);
        System.out.println((m*n)/n);
	}

}
