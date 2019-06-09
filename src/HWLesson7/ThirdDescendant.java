package HWLesson7;

public class ThirdDescendant extends Primary {
    public int version;
    public ThirdDescendant(int a, int b, int version){
        super(a,b);
        this.version = version;
    }


    @Override
    public void select(){
        System.out.println("SomeVersion");
    }
}
