class Solution {
    public String solution(int[] food) {
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=1;i<food.length;i++){
            int count = food[i]/2;
            
            for(int j=0;j<count;j++){
                sb.append(i);
            }
        }
        String left = sb.toString();
        String right = sb.reverse().toString();
        String answer = left+"0"+right;
        return answer;
        
        
        //food[i]  [i]번 음식 의 개수
        //ex ) food = [1,3,4,6]  food[o]= 물 항상 1
        // food[1] = 3 food[2] = 4 food[3] = 6
        // 따라서 1번음식 1개씩 2번음식 2개씩 3번음식 3개씩 1223330333221
    }
}