package studentsScore;
import java.util.Scanner;
public class Clint {
    static {
        System.out.println("��ӭʹ��ѧ���ɼ�����ϵͳ");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        method me = new method();
        String yn = "";
        // ����ʼ
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
                    System.out.println("�����������������");
                    continue;
            }
            if (yn.equals("n")) {
                break;
            } else {
                System.out.println("�Ƿ����ʹ��ϵͳ����y/n��");
                yn = input.next();
            }
        } while (!yn.equals("n"));
        // �������
        System.out.println("�˳�ϵͳ����лʹ�ã�");
        input.close();



    }



}
