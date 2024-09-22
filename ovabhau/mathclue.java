package ovabhau;

public interface mathclue {
    void aoc(int r);


}

class code implements mathclue{

    @Override

    public void aoc(int r) {
        System.out.println("area of circle is"+r*r*r);

    }
}
class exicuter implements mathclue{
    @Override
    public void aoc(int r) {
        System.out.println(r+2+r);
    }
}
class sumit implements mathclue{
    @Override
    public void aoc(int r) {
        System.out.println("the number sumit of runnable is="+r);
    }
}
class run{
    public static void main(String[] args) {
        mathclue a=new exicuter();
        mathclue c=new sumit();
        c.aoc(25);
        a.aoc(12);
        mathclue b=new code();
        b.aoc(25);
    }
}
