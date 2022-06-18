package practice.hashmaps;

import java.util.*;

public class ValidSudoku {
    public static void main(String[] args) {
        List<String> A = Arrays.asList("....5..1.", ".4.3.....", ".....3..1", "8......2.", "..2.7....", ".15......", ".....2...", ".2.9.....", "..4......");
        int n = 9;
        HashSet<Integer> set = new HashSet<>();
        for (int i=0;i<n;i++){
            for (int j:A.get(i).toCharArray()) {
                if (j != 46) {
                    if (set.contains(j - 48))
                        break;
                    else
                        set.add(j - 48);
                }
            }
            set.clear();
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++) {
                char[] ch = A.get(j).toCharArray();
                if (ch[i] != 46) {
                    if (set.contains(ch[i] - 48))
                        break;
                    else
                        set.add(ch[i] - 48);
                }
            }
            set.clear();
        }
        for (int k = 0; k < 9; k++) {
            int x = k / 3;
            int y = k % 3;
            set.clear();
            int xStart =  3 * x;
            int xEnd = 3 * x + 3;
            int yStart =  3 * x;
            int yEnd = 3 * x + 3;
            for (int i = xStart; i < xEnd; i++) {
                for (int j = yStart; j < yEnd; j++) {
                    char c = A.get(j).charAt(i);
                    if (c == '.')
                        continue;
                    if (set.contains(c-48)) {
                        break;
                    }set.add(c-48);
                }
            }
        }
    }
}
