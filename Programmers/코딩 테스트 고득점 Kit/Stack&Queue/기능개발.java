import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer;
        Queue<Integer> finish = new LinkedList<>();
        int num=1; // 하루에 배포가능한 작업 개수
        int index=0;
        //작업이 걸리는 일 수를 먼저 구한다.
        int[] day= new int[progresses.length];
        for(int i=0;i<progresses.length;i++){
            if((100-progresses[i])%speeds[i]!=0){
                 day[i] = (100-progresses[i])/speeds[i]+1;
            }
            else{
                day[i] = (100-progresses[i])/speeds[i];
            }
        }
        //progresses 앞쪽에 있는 내용이 나갈수 있는지 확인
        //여러개가 나가면 인덱스도 바뀌어야 됨
        for(int i=0;i<day.length;){
            if(i==day.length-1){
                finish.add(num);
                break;
            }
           for(int k=i+1;k<day.length;k++){
               if(day[i]>=day[k]){
                   num++;
               }
               else if(day[i]<day[k]){
                   finish.add(num);
                   i=k;
                   num = 1;
                   break;
               }
               if(k==day.length-1) {
            	   i=k;
               }
           }
        }
        answer = new int[finish.size()];
        int size = finish.size();
        for(int k=0;k<size;k++) {
        	answer[k]= finish.poll();
        }
        //배포해야하는 개수 체크
        return answer;
    }
}
