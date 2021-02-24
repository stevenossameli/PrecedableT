public class SortUtil {
    @SuppressWarnings(value = "unchecked")
    public static <T> void ordenar(Precedable<T>[] arr) {
        int i, j;
        boolean keepSorting;
        Precedable<T> aux;
        for (i = 0; i < arr.length - 1; i++) {

            keepSorting = false;
            for (j = 0; j < arr.length - i - 1; j++) {
                if (arr[j + 1].precedeA((T) arr[j]) < 0) {
                    aux = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = aux;
                    keepSorting = true;
                }
            }

            if (!keepSorting)
                break;
        }
    }
}