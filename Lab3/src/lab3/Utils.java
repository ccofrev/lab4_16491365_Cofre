/*
 * 
 *   * 
 */
package lab3;

/**
 *
 * @author Carlos Cofré <carlos.cofre@usach.cl>
 */
public class Utils {

    static String mayor(String a, String b){   
        int la;
        if(Math.max(la=a.length(), b.length()) == la)
            return a;
        else
            return b;
    }
    
    static String compara(String a, String b){
        String[] spA = a.split("\n");
        String[] spB = b.split("\n");
        String salida = "";
        for(int i=0; i<spB.length; i++){
            salida += spA[i].equals(spB[i])?"\n":spA[i]+"\n";
        }
        return salida.substring(0, salida.length()-1);
    }
    

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
    
    public static String diferencia2(String a, String b){
	//TFreq fa, fb;
        int[] fa = new int[NCHARS];
        int[] fb = new int[NCHARS];
	freqs(a, fa);
	freqs(b, fb);

	String r = "";
	for (int i = 0; i < NCHARS; ++i){
            if (fa[i] > 0 && !(fb[i] > 0)){
                    r += ((char)i+"");
            }else{
                if(i != (int)'\n'){
                    r += " ";
                }else{
                    r += "\n";
                }
            }
        }
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
    
    public static void falsoClear(){
        for(int i=0; i<10; i++)
            System.out.println("\n\n\n\n\n\n\n\n\n");
    }

}
