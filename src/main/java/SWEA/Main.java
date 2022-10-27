package SWEA;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.io.FileInputStream;
public class Main {
    static class Solution {
        public String solution(String[] participant, String[] completion) {
            String answer = null;
            HashMap<String, Integer> hm = new HashMap<>(100000);

            for (int i = 0; i < participant.length; i++) {
                String key = participant[i];
                if (!hm.containsKey(participant[i])) {
                    hm.put(participant[i], 0);
                }
                hm.put(participant[i], hm.get(participant[i]) + 1);
            }

            for (int i = 0; i < completion.length; i++) {
                String key = completion[i]; // value 1
                hm.put(key, hm.get(key) - 1);
            }

            for (String key : hm.keySet()) {
                if (hm.get(key) == 1) {
                    answer = key;
                }

            }
            return answer;
        }

    }

    public static void main(String[] args) {
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};
        Solution s = new Solution();
        s.solution(participant,completion);

    }
}
