package studentsScore;
import java.util.Scanner;
public class Clint {
    static {
        System.out.println("欢迎使用学生成绩管理系统");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        method me = new method();
        String yn = "";
        // 程序开始
        do {
            method.menu();
            int a = input.nextInt();
            switch (a) {
                case 0:
                    yn = "n";
                    break;
                case 1:
                    me.method();
                    break;
                case 2:
                    me.method1();
                    break;
                case 3:
                    me.method2();
                    break;
                case 4:
                    me.method4();
                    break;
                case 5:
                    me.method5();
                    break;
                case 6:
                    me.method6();
                    break;
                case 7:
                    me.method7();
                    break;
                default:
                    System.out.println("输入错误请重新输入");
                    continue;
            }
            if (yn.equals("n")) {
                break;
            } else {
                System.out.println("是否继续使用系统？（y/n）");
                yn = input.next();
            }
        } while (!yn.equals("n"));
        // 程序结束
        System.out.println("退出系统，感谢使用！");
        input.close();



    }



}
