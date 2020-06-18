package Junit;
public class SumMoney {
	private int quantite;
	private String unite;

	public SumMoney(int amount, String currency){
		quantite = amount;
		unite = currency;
	}

	public int getQuantite() {
		return quantite;
	}

	public String getUnite() {
		return unite;
	}

	@Override
    public boolean equals(Object anObject) {
		if(this == anObject) {
			return true;
		}
		if(this.getClass() != anObject.getClass()) {
			return false;
		}else {
			if(this.unite == ((SumMoney) anObject).getUnite() && this.quantite == ((SumMoney) anObject).getQuantite()) {
				return true;
			}
		}
		return false;
	}


	public SumMoney add(SumMoney m) {
		return new SumMoney(getQuantite()+m.getQuantite(), getUnite());
	}
}
