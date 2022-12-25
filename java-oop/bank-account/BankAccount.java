public class BankAccount {
    private double checking;
    private double savings;
    public static int numOfAccounts;
    public static double totalMoney;


    public BankAccount() {
        this.checking = 0;
        this.savings = 0;
        numOfAccounts++;
    }

    public double getChecking() {
        return this.checking;
    }
    public double getSavings() {
        return this.savings;
    }

    public void setChecking(double checking){
        this.checking = checking;
    }
    public void setSavings(double savings){
        this.savings = savings;
    }

    public void deposit(String account, double amount) {
        if(account == "checking"){
            setChecking(getChecking() + amount);
            totalMoney += amount;
        }
        if(account == "savings"){
            setSavings(getSavings() + amount);
            totalMoney += amount;
        }
    }

    public void withdrawal(String account, double amount) {
        if(account == "checking"){
            if (getChecking() < amount){
                System.out.println("Insufficient funds.");
            }
            else {
                setChecking(getChecking() - amount);
                totalMoney += amount;
            }
        }
        if(account == "savings"){
            if (getSavings() < amount){
                System.out.println("Insufficient funds.");
            }
            else {
                setSavings(getSavings() - amount);
                totalMoney += amount;
            }
        }
    }

    public void balance(){
        double total = getChecking() + getSavings();
        System.out.println("Checking: $" + getChecking());
        System.out.println("Savings: $" + getSavings());
    }
}