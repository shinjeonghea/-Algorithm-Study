import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String,Integer> map = new HashMap<String,Integer>();
       // 완주한 애들
         for(int i=0;i<completion.length;i++){
            if(map.containsKey(completion[i])==true){
                map.replace(completion[i],map.get(completion[i])+1);
            }
            else
                map.put(completion[i],1); //1인데 더있으면 더 넣어줘야 되는뎅
        }
        //신청한 애들이랑 완주한애들 비교
         for(int i=0;i<participant.length;i++){
            if(map.containsKey(participant[i])==false){
                answer=participant[i];
                return answer;
            }
            //해쉬 안에 참가한 사람이 존재하는 경우
            else{
                if(map.get(participant[i])<=0){
                    answer=participant[i];
                    return answer;
                }
                else
                 map.replace(participant[i],map.get(participant[i])-1);
            }
        }
        
        return answer;
    }
}
