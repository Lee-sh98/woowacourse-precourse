package onboarding;

public class Problem3 {
    public static int solution(int number) {
        int answer = 0;
        for(int i=1; i<=number; i++) {
            for (int j = i; j > 0; j /= 10) {
                if (j % 10 == 3 || j % 10 == 6 || j % 10 == 9) answer++;
            }
        }
        return answer;
    }
}
