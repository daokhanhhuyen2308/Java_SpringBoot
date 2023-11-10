public class QuickSort implements ISort{
    //hàm sắp xếp này đã chạy ngon rồi thì không cần thiêt phải đổi lại tên mà 
    //chỉ cần tạo hàm mới rồi gọi lại hàm cũ vì nếu chẳng may hàm mới bị lỗi thì k bị ảnh hưởng
    // đến hàm cũ
    public void sepxep(int[] so){
        System.out.println("Da sap xep thanh cong voi Quick Sort ");
    }

    @Override
    public void sort(int[] n) {
       sepxep(n);;
    }
}
