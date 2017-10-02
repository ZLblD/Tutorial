package Shild.Class;

public class ChkNum {
//  вернуть логическое значение true
//  если х содержит четное число
    boolean isEven(int x){
        if(x%2==0) {
            return true;
        } else {
            return false;
        }
    }
}

class ParmDemo {
    public static void main(String[] args) {
        ChkNum e = new ChkNum();

        if(e.isEven(10)) System.out.println("10 - четное число");
        if(e.isEven(9)) System.out.println("9 - нечетное число");
        if(e.isEven(8)) System.out.println("8 - четное число");
        if(e.isEven(6)) System.out.println(e.isEven(4)+ " - четное число");
    }
}
