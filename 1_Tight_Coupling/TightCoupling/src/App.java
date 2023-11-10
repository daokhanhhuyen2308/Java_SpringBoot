public class App {
    public static void main(String[] args) throws Exception {
        BubbleSort bubbleSort = new BubbleSort();
        //QuickSort quickSort = new QuickSort();
        VeryComplexService veryComplexService = new VeryComplexService(bubbleSort);
        int[] n = new int[] {5,3,2,4,1};
        veryComplexService.complexFunction(n);
    }
}
