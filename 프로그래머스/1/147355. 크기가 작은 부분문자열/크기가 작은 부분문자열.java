class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int len = p.length();
        long num1 = Long.parseLong(p);
        for(int i=0; i<t.length()-len+1; i++){
            String subString = t.substring(i,i+len);
            long num2 = Long.parseLong(subString);
            if( num2 <=num1 ){
                answer++;
            }
        }
        
        return answer;
    }
}