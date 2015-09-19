/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice;

import java.util.BitSet;

public class Survivor {

    BitSet chairs;

    public static void main(String args[]) {
        Survivor s1 = new Survivor();
        System.out.println("Survivor is #" + s1.getSurvivor(100));
    }

   
    public int getSurvivor(int numChairs) {

        chairs = new BitSet(numChairs);

        chairs.set(0, numChairs, true);

        int skip = 0, id = 0, survivor = 0;
        int persons = numChairs;

        // repeat until there is only 1 person remaining
        while (persons > 1) {

            for (int i = id, count = skip; i >= 0;) {

                if (count > 0) {
                    count--;
                } else {
                    id = i;
                    break;
                }

                
                i = chairs.nextSetBit((i + 1) % numChairs);
                if (i == -1) {
                    i = chairs.nextSetBit(0);
                }
            }

            this.chairs.clear(id);
            id = chairs.nextSetBit(id);
            if (id == -1) {
                id = chairs.nextSetBit(0);
            }

            skip++;
            persons--;
            survivor = id;
        }
        return survivor + 1;
    }
}
