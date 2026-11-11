public class Main {
    public static void main(String[] args) {
        String[] keyName = {"daniel", "daniel", "daniel", "luis", "luis", "luis", "luis"};
        String[] keyTime = {"10:00","10:40","11:00","09:00","11:00","13:00","15:00"};

        Solution solution = new Solution();
        System.out.println(solution.alertNames(keyName, keyTime));
    }
}
