public class CustomerMain {
 String name, bank, branch, acc_no;

 void insert(String n, String a, String b, String br) {
  name = n;
  bank = b;
  acc_no = a;
  branch = br;
 }

 void display() {
  System.out.println("Account Details:");
  System.out.println("Name: " + name);
  System.out.println("Bank: " + bank);
  System.out.println("Account Number: " + acc_no);
  System.out.println("Branch: " + branch);
 }
}

class Savings extends Account {
 double balance, interest;

 void deposit(double amount) {
  balance += amount;
 }

 void calculateInterest() {
  interest = balance * 0.06; // 6% interest rate
  balance += interest;
 }

 void withdraw(double amount) {
  balance -= amount;
 }

 void display() {
  super.display();
  System.out.println("Balance: " + balance);
  System.out.println("Interest Accrued: " + interest);
 }
}

class Current extends Account {
 double balance, interest;

 void deposit(double amount) {
  balance += amount;
 }

 void calculateInterest() {
  interest = balance * 0.06; // 6% interest rate
  balance += interest;
 }

 void withdraw(double amount) {
  balance -= amount;
 }

 void display() {
  super.display();
  System.out.println("Balance: " + balance);
  System.out.println("Interest Accrued: " + interest);
 }
}

class Customer {
 public static void main(String args[]) {
  Savings savingsAccount = new Savings();
  savingsAccount.insert("Anil", "123456789", "Canara Bank", "Main Branch");
  savingsAccount.deposit(1000);
  savingsAccount.calculateInterest();
  savingsAccount.display();

  Current currentAccount = new Current();
  currentAccount.insert("Shiva", "987654321", "SBI Bank", "Downtown Branch");
  currentAccount.deposit(2000);
  currentAccount.calculateInterest();
  currentAccount.display();
 }
}