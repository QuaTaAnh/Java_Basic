package training;

public class Lesson1 {
    public static void testString(){
        String a = "123";
        String b = "123456";
        System.out.println(a+"|"+ a.hashCode());
        System.out.println(b+"|"+ b.hashCode());
        a += "456";
        System.out.println(a+"|"+ a.hashCode());
        System.out.println(b+"|"+ b.hashCode());
    }
    public static void testStringBuilde() {
        StringBuilder a = new StringBuilder("123");
        StringBuilder b = new StringBuilder("123");
        System.out.println(a+"|"+ a.hashCode());
        System.out.println(b+"|"+ b.hashCode());
        a.append("456");
        System.out.println(a+"|"+ a.hashCode());
        System.out.println(b+"|"+ b.hashCode());
    }
    public static void performance() {
        String a = "123";
        StringBuilder strA = new StringBuilder("123");
    }

    public static void testFoo() {
        Foo f1 = new Foo();
        f1.setValue("123");
        Foo f2 = new Foo();

    }
}

class Foo{
    private String value;
    public void setValue(String value){
        this.value = value;
    }
    public String getValue(){
        return this.value;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return (Foo)super.clone();
    }
}