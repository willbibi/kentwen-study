package lambda;

import java.text.DecimalFormat;
import java.util.function.Function;

/**
 * Created by 毕文 on 2018/6/10.
 */
//interface IMoneyFormat {
//    String format(int i);
//}

class MyMoney {
    private final int money;

    public MyMoney(int money) {
        this.money = money;
    }

    public void printMoney(Function<Integer, String> moneyFormat) {
        System.out.println("我的存款：" + moneyFormat.apply(this.money));
    }
}

public class MoneyDemo {
    public static void main(String[] args) {
        MyMoney myMoney = new MyMoney(999999999);
        Function<Integer, String> function = i -> new DecimalFormat("#,###").format(i);

        // 函数接口链式操作
        myMoney.printMoney(function.andThen(s -> "人民币" + s));
    }
}
