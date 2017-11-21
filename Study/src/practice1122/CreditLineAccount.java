package practice1122;

public class CreditLineAccount extends Account {
	int creditLine;

	CreditLineAccount(String accountNo, String ownerName, int balace, int creditLine) {
		super(accountNo, ownerName, balace);
		this.creditLine = creditLine;
	}

	int withdraw(int amount) throws Exception {
		if ((balance + creditLine) < amount)
			throw new Exception("인출이 불가능합니다.");
		balance -= amount;
		return amount;
	}

}
