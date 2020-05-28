import junit.framework.*;

import static org.junit.Assert.assertTrue;

package main;

public class main {
    public class SommeArgent {
        private int quantite;
        private String unite;
        public SommeArgent(int amount, String currency)
        { quantite = amount;
            unite = currency;
        }
        public int getQuantite() {
            return quantite;
        }
        public String getUnite() {
            return unite;
        }
        public SommeArgent add(SommeArgent m) {
            return new SommeArgent(getQuantite()+m.getQuantite(), getUnite());
        }
        public boolean equals(Object anObject){
            SommeArgent S= new SommeArgent(5,"euros");
            int quantite=S.getQuantite();
            String unite=S.getUnite();
            assertTrue(quantite==5);
        }
    }

    }
