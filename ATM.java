public class ATM {
    public int countBanknotes(int sum) {
        int[] bills =  {500, 200, 100, 50, 20, 10, 5, 2 , 1};
        int index = 0;
        int count =0;
        while (sum !=0) {
            if (sum >= bills[index]) {
                sum = sum - bills[index];
                count = count+1;
            } else {
                index = index+1;
            }
        }
        return count;
    }
}
