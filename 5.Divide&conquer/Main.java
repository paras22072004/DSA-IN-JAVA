
public class Main {

    //merge sort 
    public static void mergeSort(int num[], int si, int en) {
        if (si >= en) {
            return;
        }

        int mid = si + (en - en) / 2;
        mergeSort(num, si, mid);
        mergeSort(num, mid + 1, en);
        merge(num, si, mid, en);
    }
    public static void merge(int num[], int si, int mid, int en) {
        int temp[] = new int[en - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= en) {
            if (num[i] < num[j]) {
                temp[k] = num[i];
                i++;
            } else {
                temp[k] = num[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            temp[k++] = num[i++];
        }

        while (j <= en) {
            temp[k++] = num[j++];
        }

        for (k = 0, i = si; k < temp.length; k++, i++) {
            num[i] = temp[k];
        }
    }


    //Quick sort


    public static void print(int num[]) {
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }

    public static void main(String[] args) {
        int num[] = {1, 3, 0, 2, 5, 4};
        mergeSort(num, 0, num.length - 1);
        print(num);

    }
}
