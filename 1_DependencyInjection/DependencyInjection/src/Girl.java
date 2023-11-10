public class Girl {
    private String name;
    //1 đối tượng Girl sẽ quy định cô gái này sẽ mặc gì 
    //hay nói cách khác outfit này phụ thuộc vào Girl (là 1 dependency của Girl)
    private IOutfit outfit;
    
    //Inject dependency thông qua phương thức constructor
    public Girl(String name, IOutfit outfit){
        this.name = name;
        this.outfit = outfit;
    }
    //Inject dependency thông qua phương thức setter
    public void setOutfit(IOutfit outfit){
        this.outfit = outfit;
    }
    public void showOutfit(){
        System.out.println("Co gai: " +this.name);
        outfit.wear();
    }
    
}
