package loans;

public class EconomyLoanServices extends AutoLoansService {
	
	public int avgDeposits;
	public int association;
	public int savings;
	
	
	
	public int getAvgDeposits() {
		return avgDeposits;
	}



	public void setAvgDeposits(int avgDeposits) {
		this.avgDeposits = avgDeposits;
	}



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



	public EconomyLoanServices() {
		// TODO Auto-generated constructor stub
	}



	public EconomyLoanServices(String carType, String model, String year, int loanAmount, int creditScore,
			int avgDeposits, int association, int savings) {
		super(carType, model, year, loanAmount, creditScore);
		this.avgDeposits = avgDeposits;
		this.association = association;
		this.savings = savings;
	}
	public boolean issueLoan(int association, int savings, int creditScore, int loanAmount, int avgDeposits) {
		boolean result= false;
		if(association > 4 && savings > 1000 && creditScore > 690 && loanAmount < 30000 && avgDeposits > 2000) {
			result = true;
		}
		if(association > 6 && savings > 1500 && creditScore > 680 && loanAmount < 35000 && avgDeposits > 2500) {
			result = true;
		}
		if(association > 8 && savings > 2000 && creditScore > 690 && loanAmount < 50000 && avgDeposits > 3000) {
			result = true;
		}
		return result;
	}

}
