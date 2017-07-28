package Shild.Interface.ConstInterface;

/**
 * Никогда не применять, описано олько ради полноты рассмотрения
*/
public class IConstD implements IConst {
    public static void main(String[] args) {
        int nums[] = new int[MAX];

        for (int i = MIN; i < 11; i++) {
            if (i >= MAX) {
                System.out.println(ERROMSG);
            } else {
                nums[i] = i;
                System.out.print(nums[i] + " ");
            }
        }
    }
}
