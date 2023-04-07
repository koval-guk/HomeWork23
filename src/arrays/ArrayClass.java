package arrays;

public class ArrayClass {
    private static final int value4 = 4;

    public static int[] findAllPast4(int[] array) {
        if (array != null) {
            int[] result = null;
            int i;
            for (i = array.length - 1; i >= 0; i--) {
                if (array[i] == value4) {
                    i++;
                    result = new int[array.length - i];
                    if (array.length - i >= 0) {
                        System.arraycopy(array, i, result, 0, array.length - i);
                    }
                    break;
                }
            }
            if (result == null) {
                throw new RuntimeException("no \"4\" !");
            }
            return result;
        }
        return null;
    }

    public static boolean find1and4(int[] array) {
        boolean b1 = false;
        boolean b4 = false;
        boolean bAzer = true;
        for (int i : array) {
            if (i == 1) {
                b1 = true;
            } else if (i == 4) {
                b4 = true;
            } else bAzer = false;
        }
        return b1 & b4 & bAzer;
    }
}
