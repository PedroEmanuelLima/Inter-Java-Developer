package one.innovetion.digital;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

// ............................
// Encontre a maior sbstring  |
// ............................

public class Terceira {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {

        var text1 = in.readLine();
        while ( text1 != null && !text1 .isEmpty()) { // complete seu código
            var texto2 = in.readLine();

            if ( texto2.isEmpty() ) {
                break;
            }

            int lengthSubstring = 0, maxSubstring = 0;
            StringBuilder subString = new StringBuilder();

            for (int i = 0; i < text1.length(); i++){
                for (int j = i; j < text1.length(); j++){
                    subString.append(text1.charAt(j));

                    if(texto2.contains(subString)){
                        lengthSubstring++;

                        if (lengthSubstring > maxSubstring)
                            maxSubstring = lengthSubstring;
                    } else {
                        subString.setLength(0);
                        if (lengthSubstring > maxSubstring)
                            maxSubstring = lengthSubstring;

                        lengthSubstring = 0;

                        break;

                    }
                }
            }

            System.out.println(maxSubstring);
            text1 = in.readLine();
        }
        out.close();
    }
}
