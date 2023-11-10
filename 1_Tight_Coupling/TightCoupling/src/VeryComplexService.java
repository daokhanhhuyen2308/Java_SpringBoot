public class VeryComplexService {
    private ISort iSort;

    public VeryComplexService(ISort iSort){
        this.iSort = iSort;
    }
   
    public void complexFunction(int[] n){
        iSort.sort(n);
    }
}
