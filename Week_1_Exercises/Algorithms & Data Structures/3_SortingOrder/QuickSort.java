public class QuickSort {
    public static void quickSort(Order[] orders, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(orders, low, high);
            quickSort(orders, low, pivotIndex - 1);
            quickSort(orders, pivotIndex + 1, high);
        }
    }

    private static int partition(Order[] orders, int low, int high) {
        double pivotValue = orders[high].getTotalPrice();
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (orders[j].getTotalPrice() < pivotValue) {
                i++;
                Order tempOrder = orders[i];
                orders[i] = orders[j];
                orders[j] = tempOrder;
            }
        }
        Order tempOrder = orders[i + 1];
        orders[i + 1] = orders[high];
        orders[high] = tempOrder;
        return i + 1;
    }
}
