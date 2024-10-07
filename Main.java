public class Main {
    public static String accountName = "MyAcc";
    public static int amount = 10000;

    public static void main(String[] args) throws InsufficientAmountException {
        System.out.println(deduct("MyAcc", 9000000));
    }

    public static int deduct(String accountToProcess, int amtToCacheOut) throws
            InsufficientAmountException {
        if (!accountName.equals(accountToProcess)){
            throw new AccessDeniedException("Предоставленная учетная запись не соответствует вашему аккаунту");
        }
        if (amount < amtToCacheOut){
            throw new InsufficientAmountException("Не достаточно денег для снятия " + amtToCacheOut);
        }
        amount = amount - amtToCacheOut;
        return amount;
    }


}



