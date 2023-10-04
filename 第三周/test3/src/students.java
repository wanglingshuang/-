public class students {
    public static void main(String[] args) {
        char[] students = {'A', 'B', 'C', 'D', 'E'};
        boolean found = false;

        // 遍历所有可能的名次排列
        for (char a : students) {
            for (char b : students) {
                for (char c : students) {
                    for (char d : students) {
                        for (char e : students) {
                            // 检查甲的猜测条件

                            if (!isAdjacent(a, b) && !isAdjacent(b, c) && !isAdjacent(c, d) && !isAdjacent(d, e)) {
                                // 检查乙的猜测条件
                                int correct_1 = 0;
                                if (a == 'A') {
                                    correct_1++;
                                }
                                if (b == 'B') {
                                    correct_1++;
                                }
                                if (c == 'C') {
                                    correct_1++;
                                }
                                if (d == 'D') {
                                    correct_1++;
                                }
                                if (e == 'E') {
                                    correct_1++;
                                }
                                int correct = 0;
                                if (a == 'D') {
                                    correct++;
                                }
                                if (b == 'A') {
                                    correct++;
                                }
                                if (c == 'E') {
                                    correct++;
                                }
                                if (d == 'C') {
                                    correct++;
                                }
                                if (e == 'B') {
                                    correct++;
                                }
                                // 统计乙猜中的两对相邻名次
                                int correctPairs = 0;
                                if (a == 'D' && b == 'A') {
                                    correctPairs++;
                                }
                                if (b == 'A' && c == 'E') {
                                    correctPairs++;
                                }
                                if (c == 'E' && d == 'C') {
                                    correctPairs++;
                                }
                                if (d == 'C' && e == 'B') {
                                    correctPairs++;
                                }

                                // 如果乙只猜中了两对相邻名次，则打印结果
                                if (correctPairs == 2 && correct == 2 && correct_1 == 0) {
                                    System.out.println("符合条件的比赛结果为：");
                                    System.out.println("1. " + a);
                                    System.out.println("2. " + b);
                                    System.out.println("3. " + c);
                                    System.out.println("4. " + d);
                                    System.out.println("5. " + e);
                                    found = true;
                                }
                            }
                        }
                    }
                }
            }
        }

        if (!found) {
            System.out.println("找不到符合条件的比赛结果。");
        }
    }

    // 检查两个名次是否相邻
    public static boolean isAdjacent(char student1, char student2) {
        return Math.abs(student1 - student2) == 1;
    }
}
