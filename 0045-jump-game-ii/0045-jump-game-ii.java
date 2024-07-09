class Solution {
    public int jump(int[] nums) {
        int jump = 0; // 점프 횟수를 저장하는 변수
        int lastJump = 0; // 현재 점프가 도달할 수 있는 마지막 인덱스
        int curJump = 0; // 다음 점프가 도달할 수 있는 가장 먼 인덱스

        for (int i = 0; i < nums.length - 1; i++) { 
            curJump = Math.max(curJump, i + nums[i]); // 현재 위치에서 도달할 수 있는 가장 먼 인덱스 업데이트
            if (i == lastJump) { // 현재 인덱스가 마지막 점프가 도달할 수 있는 인덱스와 같다면
                jump++; // 점프 횟수 증가
                lastJump = curJump; // 마지막 점프 인덱스를 현재 점프가 도달할 수 있는 가장 먼 인덱스로 업데이트
            }
        }
        return jump; // 총 점프 횟수 반환
    }
}

// 1.인덱스별 멀리갈수있는 인덱스 계산
