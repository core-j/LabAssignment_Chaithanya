package account;

public class SavingsAccount extends Account{
	/**
	 * Additional final variable to ensure the minimum balance of 500 in account.
	 */
	private final double MINIMUM_BALANCE = 500;

	/**
	 * Parameterized Constructor.
	 */
	public SavingsAccount(double balance,Person person) {
		super(balance,person);
	}

	/**
	 * Override the withdraw method.
	 * It ensures that account have minimum balance of 500 for successful withdraw.
	 * @param amount.
	 */
	@Override
	public void withdraw(double amount) {
		/**
		 * Get the current balance in account.
		 * Deduct the specific amount received as @param.
		 * Kept it in newBalance variable.
		 */
		double newBalance = super.getBalance() - amount;
		/**
		 * Check if the newBalance is greater than equal to minimum balance required in account.
		 */
		if(newBalance>=MINIMUM_BALANCE) {
			/**
			 * If yes then set the new balance to the account.
			 */
			super.setBalance(newBalance);
		}
		/**
		 * If no then display appropriate message.
		 */
		else {
			System.out.println("Can't withdraw as " +this.getAccHolder().getName()+" account don't have sufficient funds.");
		}
	}
}
