/*2.数组中出现次数超过一半的数字（简单）
给一个长度为 n 的数组，数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
例如输入一个长度为9的数组[1,2,3,2,2,2,5,4,2]。由于数字2在数组中出现了5次，超过数组长度的
一半，因此输出2。
数据范围：n≤50000，数组中元素的值0≤val≤100000要求：空间复杂度：O(1)，时间复杂度O(n)
输入描述：
保证数组输入非空，且保证有解。*/
//2023.10.2 by 王凌霜
/*思路：我的思路是先将数组进行排序，如果有次数超过一般的数字，那么那个数字一定是中间值，
*然后再统计数组中跟arr[mid]的值一样的元素，相等的话count++,count的值大于mid,
* 则说明存在，否则返回为0
*/

import java.util.Arrays;
    class Main {
        public static int findMajorityElement(int[] arr) {
            Arrays.sort(arr);
            int count = 0;
            int mid = arr.length / 2;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == arr[mid]) {
                    count++;
                }
            }
            if (count > mid) {
                return arr[mid];
            }
            return 0;
        }

        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 2, 2, 2, 5, 4, 2};
            int result = findMajorityElement(arr);
            System.out.println("出现次数超过一半的数字是：" + result);
        }
    }
