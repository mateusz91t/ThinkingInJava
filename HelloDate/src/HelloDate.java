import java.util.Date;
import java.util.Scanner;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util.println;
import static java.lang.System.*;

/**
 * Description of class Hello Date
 *
 * @author Bruce Eckel
 * @author Matt rewrite
 * @version 4.1
 */
public class HelloDate {
    /**
     * The point of an entrance to the class
     *
     * @param args table of argument strings
     *             //     * @throws exceptions is not throws of exceptions
     *             Some words <em>in HTML tags</em> are interested feature.
     *             For example there is an list with regions of the content in the class:
     *             <ol>
     *                 <li>System.properties</li>
     *                 <li>TylkoDaneClass</li>
     *                 <li>StaticFunClass</li>
     *                 <li>AutoPackingClass</li>
     *                 <li>FromCommandLine</li>
     *             </ol>
     */

    public static void main(String[] args) {

        //region System.properties
//        System.out.println("Witaj, dziś jest:");
//        System.out.println(new Date());
//        System.out.println(System.getProperty("user.name"));
//        System.out.println(System.getProperty("java.library.path"));
//        System.getProperties().list(System.out);
//        System.out.println(System.getProperty("java.runtime.name"));
        //endregion
        //region TylkoDaneClass
//        TylkoDane td1 = new TylkoDane();
//        td1.bool = true;
//        td1.name = "Mateusz";
//        td1.number = 30;
//        System.out.println(td1.wielkosc());
//        System.out.println(TylkoDane.wielkosc(td1.name));
        //endregion
        //region StaticFunClass
//        StaticFun sf1 = new StaticFun();
//        System.out.println(sf1.howMany);
//        StaticFun.incr();
//        StaticFun.incr();
//        StaticFun.incr();
//        StaticFun stf2 = new StaticFun();
//        System.out.println(sf1.howMany);
//        System.out.println(stf2.howMany);
        //endregion
        //region AutoPackingClass
//        AutoPacking ap1 = new AutoPacking();
//        ap1.printValues();
//        ap1.setValues();
//        ap1.printValues();
        //endregion
        //region FromCommandLine
        Scanner sc1 = new Scanner(System.in);
        println("Twoje imię? [text] Twój wiek? [number] Czy masz prawko? [true/false]");
        GetValFromCM gvfCM1 = new GetValFromCM(sc1.next(), sc1.nextByte(), sc1.nextBoolean());
        gvfCM1.printValues();
        //endregion

        println("abc");
        println("abc");
        println("abc");
        /* Every regions have other output.
         * There are some test from the book.
         *///:~
    }
}

class TylkoDane {
    String name;
    int number;
    boolean bool;

    int wielkosc() {
        return this.name.length() * 2;
    }

    static int wielkosc(String str) {
        return str.length() * 2;
    }
}

class StaticFun {
    static int howMany;

    static void incr() {
        howMany++;
    }
}

class AutoPacking {
    boolean bool;
    Boolean Bool;
    char ch;
    Character Ch;
    byte by;
    Byte By;
    short sh;
    Short Sh;
    int in;
    Integer In;
    long lo;
    Long Lo;
    float fl;
    Float Fl;
    double d;
    Double D;

    void setValues() {
        bool = true;
        Bool = true;
        ch = '#';
        Ch = '@';
        by = Byte.MAX_VALUE;
        By = Byte.MIN_VALUE;
        sh = Short.MAX_VALUE;
        Sh = Short.MIN_VALUE;
        in = Integer.MAX_VALUE;
        In = Integer.MIN_VALUE;
        lo = Long.MAX_VALUE;
        Lo = Long.MIN_VALUE;
        fl = Float.MAX_VALUE;
        Fl = Float.MIN_VALUE;
        d = Double.MAX_VALUE;
        D = Double.MIN_VALUE;
    }

    Void BoolToFalse() {
        Bool = false;
        return BoolToFalse();
    }

    void printValues() {
        System.out.println(bool);
        System.out.println(Bool);
        System.out.println(ch);
        System.out.println(Ch);
        System.out.println(by);
        System.out.println(By);
        System.out.println(sh);
        System.out.println(Sh);
        System.out.println(in);
        System.out.println(In);
        System.out.println(lo);
        System.out.println(Lo);
        System.out.println(fl);
        System.out.println(Fl);
        System.out.println(d);
        System.out.println(D);
    }
}

class GetValFromCM {
    String name;
    byte age;
    boolean driverLicense;

    public GetValFromCM(String name, byte age, boolean driverLicense) {
        this.age = age;
        this.name = name;
        this.driverLicense = driverLicense;
    }

    void printValues() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(driverLicense);
    }
}