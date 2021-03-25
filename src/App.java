import by.epam.learn.entity.CustomArray;
import by.epam.learn.service.FindAndReplaceCustomArray;

public class App {
    private static CustomArray Array;
    private static FindAndReplaceCustomArray FindAndReplaceCustomArray;

    public static void main(String[] args) throws Exception {
        Array = new CustomArray(new int[] {1, 5, 4, 2, 5, -4, 8, 5});
        FindAndReplaceCustomArray = new FindAndReplaceCustomArray();

        FindAndReplaceCustomArray.replaceByValueLessCondition(Array, -1, 0);
        FindAndReplaceCustomArray.replaceByStriclyCondition(Array, 5, 10);
    }
}
