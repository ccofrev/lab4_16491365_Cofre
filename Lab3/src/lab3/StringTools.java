/*
 * 
 *   * 
 */
package lab3;

/**
 *
 * @author Carlos Cofré <carlos.cofre@usach.cl>
 */
public class StringTools {
    
    static private int NCHARS=256;
    //static private int[] TFreq;
    
    
    public static void freqs(String s, int[] TFreq){
        //TFreq = new int[NCHARS];
	for (int i = 0; i < NCHARS; ++i)
		TFreq[i] = 0;
	for (int i = 0; i < s.length(); ++i)
		TFreq[(int)s.charAt(i)] += 1;
    }
    
    public static String diferencia(String a, String b){
	//TFreq fa, fb;
        int[] fa = new int[NCHARS];
        int[] fb = new int[NCHARS];
	freqs(a, fa);
	freqs(b, fb);

	String r = "";
	for (int i = 0; i < NCHARS; ++i)
		if (fa[i] > 0 && !(fb[i] > 0))
			r += ((char)i+"");

	return r;
    }

    public static String interseccion(String a, String b){
            //TFreq fa, fb;
            int[] fa = new int[NCHARS];
            int[] fb = new int[NCHARS];
            freqs(a, fa);
            freqs(b, fb);

            String r = "";
            for (int i = 0; i < NCHARS; ++i)
                    if (fa[i] > 0 && fb[i] > 0)
                            r += ((char)i+"");

            return r;
    }
}
