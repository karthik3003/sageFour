package loans;

public class PremiumLoanServices extends AutoLoansService {

	public int association;
	public int savings;
	
	
	
	public int getAssociation() {
		return association;
	}

	public void setAssociation(int association) {
		this.association = association;
	}

	public int getSavings() {
		return savings;
	}

	public void setSavings(int savings) {
		this.savings = savings;
	}

	public PremiumLoanServices() {
		// TODO Auto-generated constructor stub
	}

	public PremiumLoanServices(String carType, String model, String year, int loanAmount, int creditScore,
			int association, int savings) {
		super(carType, model, year, loanAmount, creditScore);
		this.association = association;
		this.savings = savings;
	}
	public String testCreditScore(int creditScore, int association) {
		String result = "";
		if(super.testCreditScore(creditScore).equals("good score") && association>4) {
			result = "Premium";
		}
		if(super.testCreditScore(creditScore).equals("excellent") && association>6) {
			result = "Premium Gold";
		}
		if(super.testCreditScore(creditScore).equals("good score") && association>4) {
			result = "Premium Platinum";
		}
		return result;
	}
	public boolean issueLoan(int association, int savings, int creditScore, int loanAmount) {
		boolean result= false;
		if(association > 4 && savings > 5000 && creditScore > 690 && loanAmount < 30000) {
			result = true;
		}
		if(association > 6 && savings > 3500 && creditScore > 680 && loanAmount < 35000) {
			result = true;
		}
		if(association > 8 && savings > 3000 && creditScore > 690 && loanAmount < 50000) {
			result = true;
		}
		return result;
	}

}
