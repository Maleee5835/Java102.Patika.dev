package User;

import java.util.TreeSet;

public class AccountManager  {

    private TreeSet<Account> accountList;

    public void addAccount(Account account) {
        accountList.add(account);
    }

    public void removeAccount(Account account){
        accountList.remove(account);
    }

    public Account login(String email ,String sifre ){

        for (Account account : accountList){
            try {
                account.loginOlmaDurumu(email,sifre);
                if (account.getAuthenticationStatus() == Account.AuthenticationStatus.SUCCESS){
                    return account;
                }
            }catch (InvalidAuthenticationException i){
                System.out.println(i.getMessage());
            }
        }
        return null;
    }

    public TreeSet<Account> getAccountList() {
        return accountList;
    }
}
