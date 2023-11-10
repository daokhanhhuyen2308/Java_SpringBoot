public class App {
    public static void main(String[] args) throws Exception {
    //truyền vào giá trị dependency lúc runtime gọi là inject cái dependency vài class Girl
        Girl girl = new Girl("Ngoc Trinh", new Tshirt());
        girl.showOutfit();
        girl.setOutfit(new Bikini());
        girl.showOutfit();
    }
}
