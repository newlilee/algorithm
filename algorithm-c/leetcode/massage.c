//
// leetcode 17.16 massage
//
#include "stdio.h"
#include "math.h"

int massage(int *nums, int numsSize) {
    // n -2
    int a = 0;
    // n -1
    int b = 0;
    for (int idx = 0; idx < numsSize; idx++) {
        int c = fmax(b, a + nums[idx]);
        a = b;
        b = c;
    }
    return b;
}

int main() {
    // case 1
    int nums[] = {1, 2, 3, 1};
    int result = massage((int *) &nums, 4);
    printf("result:%d", result);
    return 0;
}