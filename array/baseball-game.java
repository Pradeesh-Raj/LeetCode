class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> record = new Stack<>();
        for (String i : operations) {
            if (i.equals("C")) {
                record.pop();
            } 
            else if (i.equals("D")) {
                record.push(2 * record.peek());
            } 
            else if (i.equals("+")) {
                int l2 = record.pop();
                int l1 = record.pop();
                record.push(l1);
                record.push(l2);
                record.push(l1 + l2);
            }
            else record.push(Integer.valueOf(i));
        }
        int sum = 0;
        for(Integer i : record) {
            sum += i;
        }
        return sum;
    }
}