
package aer172;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AER172 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        String s = br.readLine();
        while(s.charAt(0)!='0'){
            boolean contI = false;
            boolean contD = false;
            for(int i=0; i<s.length();i++){
                if(s.charAt(i)=='I'){
                    contI = true;
                }
                if (s.charAt(i)=='D'){
                    contD = true;
                }
            }
            if(contI && contD){
                System.out.println("ALGUNO NO COME");
            } else {
                System.out.println("TODOS COMEN");
            }
            s = br.readLine();
        }
    }
}
