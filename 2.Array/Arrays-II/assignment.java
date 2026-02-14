
public class assignment {
    //Q1
    public static boolean distinctNum(int num[]) {
        for (int i = 0; i < num.length; i++) {
            int count = 0;
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] == num[j]) {
                    count++;
                    return true;
                }

            }
        }
        return false;
    }

    //Q2
    public static int rotation(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                start = mid + 1;
            }
            end = mid - 1;
        }

        return -1;
    }

    //Q3
    public static int stock(int price[]) {
        int maxProfit = 0;
        int buyPrice = Integer.MAX_VALUE;

        for (int i = 0; i < price.length; i++) {
            if (buyPrice < price[i]) {
                int profit = price[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = price[i];
            }
        }

        if (maxProfit == 0) {
            return 0;
        }
        return maxProfit;
    }

    //Q4


    // Q5
    //later pending 
    public static void duplicateTriplets(int num[]){
    
    }

    public static void main(String[] args) {
        //int num[]={1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        //int num[]={1, 2, 3,4,1};
        //System.out.println(distinctNum(num));
        // int num[]={4, 5, 6, 7, 0, 1, 2};
        // int key = 7;
        // System.out.println(rotation(num, key));
        //int price[]={7, 1, 5, 3, 6, 4};
        //int price[] = {7, 6, 4, 3, 1};
        //System.out.println(stock(price));
        //int num[]={-1, 0, 1, 2, -1, -4};

    }
}
