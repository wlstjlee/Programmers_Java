class Solution {
    public String solution(String s) { 
        
        String answer = "";
        int k = (s.length()/2)-1;
        if(s.length()%2==0){
            answer = s.substring(k,k+2);
        }
        else
            answer = s.substring(k+1,k+2);
                                      
        return answer;
        //
    }
}