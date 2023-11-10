public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        Girl girl = new Girl("Ngoc Trinh", new Tshirt());
        girl.showOutfit();
        girl.setOutfit(new Bikini());
        girl.showOutfit();
    }
}
