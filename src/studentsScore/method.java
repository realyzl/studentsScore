package studentsScore;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.ArrayList;


public class method {
    ArrayList<Student> stulist = new ArrayList<Student>();

    Scanner input = new Scanner(System.in);
    //�˵�
    public static void menu() {
        System.out.println("��������0 �˳�ϵͳ");
        System.out.println("��������1 ¼��ѧ����Ϣ�����ѧ����Ϣ");
        System.out.println("��������2 ����ÿ��ѧ������ Ӣ�� java�γ̵��ܳɼ���ƽ���ɼ���������ſγ̵��ܳɼ���ƽ���ɼ�");
        System.out.println("��������3 ����ѧ�����ܳɼ�����������");
        System.out.println("��������4 �ֱ����������Ӣ�Java�γ̲�����ѧ����������������ѧ������Ϣ");
        System.out.println("��������5 ���ݸ���ѧ�������������Ҹ�ѧ���������ѧ������Ϣ");
        System.out.println("��������6 ɾ������ѧ��ѧ������Ϣ�������ɾ����Ľ��");
        System.out.println("��������7 �������������������ݺ��·ݣ�����̨��ʾ��ǰ�µ����������ڶ���");
        System.out.println("��ѡ��:");
    }
    // ����1 ¼��������ѧ����Ϣ�����ѧ����Ϣ
    public void method() {

        System.out.print("������Ҫ¼��ѧ����Ϣ�ĸ�����");

        int InputStudentNumber = input.nextInt();

        for (int i = 0; i < InputStudentNumber; i++) {

            Student student = new Student();
            System.out.print("��¼���" + (i + 1) + "��ѧ����ѧ�ţ�");
            student.setStudentNumber(input.next());
            System.out.print("��¼���" + (i + 1) + "��ѧ����������");
            student.setName(input.next());
            System.out.print("��¼���" + (i + 1) + "��ѧ�����Ա�");
            student.getSex(input.next());
            System.out.print("��¼���" + (i + 1) + "��ѧ������ѧ�ɼ���");
            student.setMathCJ(input.nextDouble());
            System.out.print("��¼���" + (i + 1) + "��ѧ����Ӣ��ɼ���");
            student.setEnglishCJ(input.nextDouble());
            System.out.print("��¼���" + (i + 1) + "��ѧ����java�ɼ���");
            student.setJavaCJ(input.nextDouble());

            stulist.add(student);

        }
        System.out.println("¼�����");

        for (int i = 0; i < stulist.size(); i++) {

            stulist.get(i).display();
        }

    }

    // ����2 ����ÿ��ѧ������ Ӣ�� java�γ̵��ܳɼ���ƽ���ɼ��������������ſγ̵��ܳɼ���ƽ���ɼ������
    public void method1() {
        if (stulist.size() == 0) {

            System.out.println("����Ϊ��,����¼��ѧ����Ϣ");
        } else {

            // ����ÿ��ѧ������ Ӣ�� java�γ̵��ܳɼ�ƽ���ɼ�

            long startTime = System.currentTimeMillis();

            for (int i = 0; i < stulist.size(); i++) {

                System.out.println("��" + (i + 1) + "��ѧ��" + stulist.get(i).getName() + "���ܳɼ��ǣ�" + stulist.get(i).getSum() + "��ƽ���ɼ��ǣ�" + stulist.get(i).getAve());

            }

            // ������ſγ̵��ܳɼ���ƽ���ɼ�

            System.out.println("������ſγ̵��ܳɼ���ƽ���ɼ������");
            double mathSum = 0;
            double EnglishSum = 0;
            double JavaSum = 0;



            for (int i = 0; i < stulist.size(); i++) {

                mathSum += stulist.get(i).getMathCJ();

                EnglishSum += stulist.get(i).getEnglishCJ();

                JavaSum += stulist.get(i).getJavaCJ();

            }



            System.out.println("�����γ̵��ܳɼ��ǣ�" + mathSum + "ƽ���ɼ��ǣ�" + mathSum/stulist.size());

            System.out.println("Ӣ��γ̵��ܳɼ��ǣ�" + EnglishSum + "ƽ���ɼ��ǣ�" + EnglishSum / stulist.size());

            System.out.println("Java�γ̵��ܳɼ��ǣ�" + JavaSum + "ƽ���ɼ��ǣ�" + JavaSum / stulist.size());

            long endTime = System.currentTimeMillis();

            System.out.println("��������ʱ�䣺" + (endTime - startTime) + "ms");

        }

    }



    // ����3 ���򣬸���ѧ�����ܳɼ����������У�����������Ľ��

    public void method2() {

        if (stulist.size() == 0) {
            System.out.println("����Ϊ��,����¼��ѧ����Ϣ");
        } else {
            // ����ѧ�����ܳɼ�����������

            long startTime = System.currentTimeMillis();
            Collections.sort(stulist, new Comparator<Student>() {
                @Override

                public int compare(Student o1, Student o2) {

                    // ע��������Ĵ��ںź�С�ں�

                    if (o1.getSum() < o2.getSum()) {
                        return 1;
                    }
                    // ��Ȳ�ִ�н���

                    if (o1.getSum() == o2.getSum()) {
                        return 0;
                    }
                    return -1;
                }
            });
            // �������ѧ����Ϣ���ܳɼ�
            System.out.println("�������ѧ���������ܳɼ�");

            for (int i = 0; i < stulist.size(); i++) {

                System.out.println("ѧ��������" + stulist.get(i).getName() + "���ܳɼ���" + stulist.get(i).getSum());
            }
            long endTime = System.currentTimeMillis();
            System.out.println("��������ʱ�䣺" + (endTime - startTime) + "ms");
        }
    }
    // ����4 �ֱ����������Ӣ�Java�γ̲�����ѧ����������������ѧ������Ϣ
    public void method4() {

        if (stulist.size() == 0) {

            System.out.println("����Ϊ��,����¼��ѧ����Ϣ");

        } else {

            // ����������

            int gaoShuBuJiGe = 0;

            int yingYuBuJiGe = 0;

            int JavaBuJiGe = 0;

            StringBuffer gaoShuStringBuffer = new StringBuffer("");

            StringBuffer yingYuStringBuffer = new StringBuffer("");

            StringBuffer JavaStringBuffer = new StringBuffer("");

            long startTime = System.currentTimeMillis();

            for (int i = 0; i < stulist.size(); i++) {

                // �жϸ����ɼ�
                if (stulist.get(i).getMathCJ() < 60) {
                    gaoShuBuJiGe++;
                    gaoShuStringBuffer.append(stulist.get(i).getName() + ",");
                }
                // �ж�Ӣ��ɼ�

                if (stulist.get(i).getEnglishCJ() < 60) {

                    yingYuBuJiGe++;

                    yingYuStringBuffer.append(stulist.get(i).getName() + ",");

                }

                // �ж�Java�ɼ�

                if (stulist.get(i).getJavaCJ() < 60) {

                    JavaBuJiGe++;

                    JavaStringBuffer.append(stulist.get(i).getName() + ",");

                }

            }

            if (gaoShuBuJiGe != 0) {

                System.out.println("�����������ѧ���У�" + gaoShuStringBuffer);

                System.out.println("�����������ѧ�����У�" + gaoShuBuJiGe + "����");

            } else {

                System.out.println("����û�в������ѧ����");

            }

            if (yingYuBuJiGe != 0) {

                System.out.println("Ӣ�ﲻ�����ѧ���У�" + yingYuStringBuffer);

                System.out.println("Ӣ�ﲻ�����ѧ�����У�" + yingYuBuJiGe + "����");

            } else {

                System.out.println("Ӣ��û�в������ѧ����");

            }

            if (JavaBuJiGe != 0) {

                System.out.println("Java�������ѧ���У�" + JavaStringBuffer);

                System.out.println("java�������ѧ�����У�" + JavaBuJiGe + "����");

            } else {

                System.out.println("Javaû�в������ѧ����");

            }

            long endTime = System.currentTimeMillis();

            System.out.println("��������ʱ�䣺" + (endTime - startTime) + "ms");

        }



    }



    // ����5 ���ݸ���ѧ�������������Ҹ�ѧ���������ѧ������Ϣ

    public void method5() {



        if (stulist.size() == 0) {

            System.out.println("����Ϊ��,����¼��ѧ����Ϣ");

        } else {

            boolean chaXunJG = false;

            System.out.print("������Ҫ��ѯ��ѧ������:");

            String JxingMing = input.next();

            long startTime = System.currentTimeMillis();

            for (int i = 0; i < stulist.size(); i++) {

                // ע��Ϊ�˼���ѭ������break���������������ֻ�ܲ鵽��һ����

                if (JxingMing.equals(stulist.get(i).getName())) {

                    System.out.println("��ѯ������Ϊ��" + JxingMing + "��ѧ��");

                    chaXunJG = true;

                    stulist.get(i).display();

                    break;

                }



            }

            if (!chaXunJG) {

                System.out.println("���޴��ˣ���ѯʧ�ܣ�");

            }

            long endTime = System.currentTimeMillis();

            System.out.println("��������ʱ�䣺" + (endTime - startTime) + "ms");

        }



    }



    // ����6 ɾ������ѧ��ѧ������Ϣ�������ɾ����Ľ��

    public void method6() {

        System.out.println("ɾ��ǰ");

        for (int i = 0; i < stulist.size(); i++) {

            stulist.get(i).display();

        }

        boolean chaXunJG = false;





        if (stulist.size() == 0) {

            System.out.println("����Ϊ��,����¼��ѧ����Ϣ");

        } else {

            System.out.print("������Ҫɾ����ѧ��ѧ��:");

            String JxueHao = input.next();

            long startTime = System.currentTimeMillis();

            for (int i = 0; i < stulist.size(); i++) {

                // ע��Ϊ�˼���ѭ������break���������������ֻ��ɾ����һ����

                if (JxueHao.equals(stulist.get(i).getStudentNumber())) {
                    // ɾ������
                    System.out.println("��ɾ��ѧ��Ϊ:" + JxueHao + "��ѧ��");
                    stulist.remove(i);
                    chaXunJG = true;
                    break;
                }
            }
            if (!chaXunJG) {
                System.out.println("���޴��ˣ�ɾ��ʧ�ܣ�");
            }
            System.out.println("ɾ����");
            if (stulist.size() == 0) {
                System.out.println("����Ϊ�գ��������");
            } else {
                for (int i = 0; i < stulist.size(); i++) {
                    stulist.get(i).display();
                }
            }
            long endTime = System.currentTimeMillis();
            System.out.println("��������ʱ�䣺" + (endTime - startTime) + "ms");
        }

    }

    // ����7 �������������������ݺ��·ݣ�����̨��ʾ��ǰ�µ����������ڶ���

    public void method7() {
        int Jyear = 1900; // ���

        int Jmonth = 1; // �·�

        int Jday = 0; // 1900�����³���������

        int Jmonthday = 0;

        // ��������ж�

        do {

            System.out.print("������Ҫ��ѯ�����");

            Jyear = input.nextInt();

            if (Jyear < 1900) {

                System.out.println("����������С��1900�꣬����������");

                continue;
            }
        } while (Jyear < 1900);
        // �·������ж�
        do {
            System.out.print("������Ҫ��ѯ���·�");

            Jmonth = input.nextInt();

            if (Jmonth < 1 || Jmonth > 12) {

                System.out.println("�����������������������");

                continue;
            }
        } while (Jmonth < 1 || Jmonth > 12);
        long startTime = System.currentTimeMillis();
        // �ۼ��������
        for (int a = 1900; a <= Jyear - 1; a++) {
            if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0) {
                Jday += 366;
            } else {
                Jday += 365;
            }

        }
        // �ۼ��·�����
        for (int i = 1; i <= Jmonth - 1; i++) {
            if (i == 2) {
                if (Jyear % 4 == 0 && Jyear % 100 != 0 || Jyear % 400 == 0) {
                    Jday = Jday + 29;
                } else {
                    Jday = Jday + 28;
                }
            } else {
                if (i == 4 || i == 6 || i == 9 || i == 11) {
                    Jday = Jday + 30;
                } else {
                    Jday = Jday + 31;
                }
            }
        }
        // ��1%7����1�����ܼ�
        Jday += 1;
        int wekday = Jday % 7;
        // ��������м���
        if (Jmonth == 2) {
            if (Jyear % 4 == 0 && Jyear % 100 != 0 || Jyear % 400 == 0) {
                Jmonthday = 29;
            } else {
                Jmonthday = 28;
            }
        } else if (Jmonth == 4 || Jmonth == 6 || Jmonth == 9 || Jmonth == 11) {
            Jmonthday = 30;
        } else {
            Jmonthday = 31;
        }
        // ����ʽ���
        System.out.println("��\tһ\t��\t��\t��\t��\t��");
        for (int j = 1; j <= wekday; j++) {
            // ����������ո�
            System.out.print("\t");
        }
        for (int i = 1; i <= Jmonthday; i++) {
            if (Jday % 7 == 6) {
                // �������������
                System.out.print(i + "\n");
            } else {
                System.out.print(i + "\t");
            }
            Jday++;
        }
        System.out.println("");
        long endTime = System.currentTimeMillis();
        System.out.println("��������ʱ�䣺" + (endTime - startTime) + "ms");

    }

}


