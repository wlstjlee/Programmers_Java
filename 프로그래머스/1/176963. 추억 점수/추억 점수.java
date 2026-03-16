import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        Map<String, Integer> map = new HashMap<>();
        
        for(int i=0;i<name.length;i++){
            map.put(name[i],yearning[i]);
            
        } // map에 해당 사람의 그리움 점수 매핑
        
        int[] answer = new int[photo.length];
        
        //사진별로 점수 계산하기
        for(int i=0;i<photo.length;i++){
            int sum=0;
            for(String p : photo[i]){
                if(map.containsKey(p)){
                    sum+=map.get(p);
                }
            }
            answer[i]=sum;
        }
        return answer;
    }
}