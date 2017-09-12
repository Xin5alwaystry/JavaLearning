package com.xinwu.Niuke;

/**
 * Created by User on 2017/9/12.
 */
public class JumpFloor {
    public static void main(String[] args) {
        SolutionOfJumpFloor solutionOfJumpFloor = new SolutionOfJumpFloor();
        System.out.println(solutionOfJumpFloor.solution(10));
    }
}
class SolutionOfJumpFloor {
    public int solution(int floor) {
        if (floor<=0) {
            return 0;
        }else if (floor == 1){
            return 1;
        }else if (floor == 2) {
            return 2;
        }else {
            return solution(floor-1)+solution(floor-2);
        }
    }
}

