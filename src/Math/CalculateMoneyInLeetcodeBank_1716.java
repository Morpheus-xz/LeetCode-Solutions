class Solution {
    public int totalMoney(int n) {

        // ans -> total money saved
        // week -> keeps track of the current week number (starts from 1)
        // money -> amount to be deposited on the current day

        int ans = 0, week = 1, money = 1;

        // Loop through each day from 1 to n
        for (int i = 1; i <= n; i++) {
            ans += money;   // Add today's money to total
            money++;        // Next day, deposit increases by 1

            // After every 7 days (end of a week)
            if (i % 7 == 0) {
                week++;         // Move to the next week
                money = week;   // Reset daily deposit to current week number
            }
        }

        return ans;
    }
}
