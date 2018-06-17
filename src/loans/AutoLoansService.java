package loans;

public class AutoLoansService {
	public String carType;
	public String model;
	public String year;
	public int loanAmount;
	public int creditScore;
	
	public String getCarType() {
		return carType;
	}
	public void setCarType(String carType) {
		this.carType = carType;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public int getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(int loanAmount) {
		this.loanAmount = loanAmount;
	}
	public int getCreditScore() {
		return creditScore;
	}
	public void setCreditScore(int creditScore) {
		this.creditScore = creditScore;
	}
	
	public AutoLoansService() {
		// TODO Auto-generated constructor stub
	}
	public AutoLoansService(String carType, String model, String year, int loanAmount, int creditScore) {
		this.carType = carType;
		this.model = model;
		this.year = year;
		this.loanAmount = loanAmount;
		this.creditScore = creditScore;
	}
	public String testCreditScore(int creditScore) {
		String result = "";
		if(creditScore > 700) {
			result = "good score";
		}
		if(creditScore > 720) {
			result = "excellent score";
		}
		if(creditScore > 740) {
			result = "perfect score";
		}
		return result;
	}
	public boolean issueLoan(int creditScore, int loanAmount) {
		boolean canIssue = false;
		if(creditScore>700 && loanAmount<=10000) {
			canIssue = true;
		}
		if(creditScore>700 && creditScore<720 && loanAmount<=20000) {
			canIssue = true;
		}
		if(creditScore>720 && loanAmount<=50000) {
			canIssue = true;
		}
		return canIssue;
	}

}
