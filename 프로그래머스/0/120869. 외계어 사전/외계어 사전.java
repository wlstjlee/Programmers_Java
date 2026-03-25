class Solution {
    public int solution(String[] spell, String[] dic) {
        for(int i=0; i<dic.length;i++){
            boolean a = true;
            String str =dic[i];
            
            for(int j=0; j<spell.length;j++){
                if(!str.contains(spell[j])){
                    a = false;
                    break;
                }
            }
        if(a)
            return 1;
        }
        return 2;
    }
}