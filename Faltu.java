public class Faltu {

    int size = nums.length;

    for(
    int i = 0;i<size-1;i++)
    {
        for (int j = i + 1; j < size; j++) {
            if (nums[i] == nums[j]) {
                nums[j] = nums[size - 1];
                size--;
                j--;

            }
        }
    }return size;
}
