package edu.webdev;

import java.util.Arrays;

/**
 * Created by algotrader on 7/11/17.
 */
public class AnagramTest {
    public static void main(String[] args) {
        int instancearray[] = new int[26];
        String src[] ={
                "dfgjkdjdma",
                "dnjmfzjdma",
                "dfgdqdfdma",
                "dfgjkdjdma",
                "dfgsklaama",
                "dfsjkdjdma",
                "dfgjkdjdma",
                "rfglkwhyma",
                "dfgjkdjdma",
                "qqqjkdjqma",
                "dfgjkdqwea",
                "suxjkdjdma"
        } ;
        String trg[] = {
                "fdjgdkdjma",
                "ndjmzjamda",
                "dgfqddfdma",
                "dfsjdkjmda",
                "fdgsklamaa",
                "dfjekjddma",
                "dfgjkdjdma",
                "rgfkflyhma",
                "dfgjkjdmad",
                "qqqjdgjqma",
                "dfgjkdqwea",
                "suxjdkhdma"
        } ;
        long count_fail = 0; // had to make this variable long
        int start_time = 0;
        int end_time = 0;
        int iterations = 0;
        int max = 0xFFFFFFF;
        int i = 0;
        int j = 0;


        start_time = (int) System.currentTimeMillis();
        for (iterations = 0; iterations < max; ++iterations) {
            Arrays.fill(instancearray, 0);
            for (i = 0; i < 12; ++i) {
                for (j = 0; j < 10; ++j) {
                    ++instancearray[src[i].charAt(j) - 'a'];
                }
                for (j = 0; j < 10; ++j) {
                    --instancearray[trg[i].charAt(j) - 'a'];
                    if (instancearray[trg[i].charAt(j) - 'a'] < 0) {
                        ++count_fail;
                        break;    /* skip to next test */
                    }
                }
            }
        }
        end_time = (int) System.currentTimeMillis();
        System.out.printf( "Total failures %d in %d seconds %d iterations\n",
                count_fail, (end_time - start_time) / 1000, max );
    }

}
