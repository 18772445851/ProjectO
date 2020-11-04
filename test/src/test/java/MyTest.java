import org.junit.Test;
import sun.misc.Launcher;

public class MyTest {
    ThreadLocal<Long> longLocal = new ThreadLocal<>();
    public void set() {
        longLocal.set(Thread.currentThread().getId());
    }
    public Long getLong() {
        return longLocal.get();
    }
    public static void main(String[] args) {
        String s1="a";
        String s2="b";
        String s3=s1+s2;
        ThreadLocal<Object> threadLocal = new ThreadLocal<>();
        System.out.println(threadLocal.get());


            MyTest test = new MyTest();
            //注意:没有set之前，直接get，报null异常了
            System.out.println("-------threadLocal value-------" + test.getLong());

    }

    @Test
    public void test(){
        A a1=new A();
        A a2=new B();
        B b=new B();
        C c=new C();
        D d=new D();
        System.out.println(a1.show(b));
        System.out.println(a1.show(c));
        System.out.println(a1.show(d));
        System.out.println(a2.show(b));
        System.out.println(a2.show(c));
        System.out.println(a2.show(d));
        System.out.println(b.show(b));
        System.out.println(b.show(c));
        System.out.println(b.show(d));
    }

    //有一对兔子，从出生后第3个月起每个月都生一对兔子，
    // 小兔子长到第三个月后每个月又生一对兔子，
    // 假如兔子都不死，问每个月的兔子总数为多少？
    @Test
    public void test01(){
        int newt1=2;
        int newt2=0;
        int oldt=0;
        int num=0;
        System.out.println("第" + 1 + "个月兔子总数为" + newt1);
        for (int H=2;H<=12;H++) {

            oldt=newt2+oldt;
            newt2=newt1;
            newt1=oldt;
            num=newt1+newt2+oldt;
            System.out.println("第" + H + "个月兔子总数为" + num);
        }
    }




}
