class Solution {
    public int solution(int n, int m, int[] section) {
        
 
        // 칠하는곳은 (현재위치~현재위치+m-1)
        // 다음 section 으로 이동.
        // result++
        //어디까지 롤러가 칠해졌는지 저장하는 변수 printEnd
        int result = 0;
        int printEnd = section[0]-1;
        for(int i=0; i<section.length;i++){
            if(printEnd<section[i]){
                result++;
                printEnd=section[i]+m-1;
            }
        }
        return result;
    }
}