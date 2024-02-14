
public class Accountuser {
    public static void main(String[] args) {
        Account ac1,ac2;
        ac1=new SavingAccount ();
        ac2=new CurrentAccount();
        ac2.openAccount();
        ac2.closeAccount();
        ac2.interest();
    }
  
}
