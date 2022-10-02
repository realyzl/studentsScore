package studentsScore;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.ArrayList;


public class method {
    ArrayList<Student> stulist = new ArrayList<Student>();

    Scanner input = new Scanner(System.in);
    //菜单
    public static void menu() {
        System.out.println("输入数字0 退出系统");
        System.out.println("输入数字1 录入学生信息、输出学生信息");
        System.out.println("输入数字2 计算每个学生高数 英语 java课程的总成绩和平均成绩、计算各门课程的总成绩和平均成绩");
        System.out.println("输入数字3 根据学生的总成绩按降序排列");
        System.out.println("输入数字4 分别输出高数、英语、Java课程不及格学生的人数、不及格学生的信息");
        System.out.println("输入数字5 根据给定学生的姓名，查找该学生并输出该学生的信息");
        System.out.println("输入数字6 删除给定学号学生的信息，并输出删除后的结果");
        System.out.println("输入数字7 万年历，输入任意的年份和月份，控制台显示当前月的日期与星期对照");
        System.out.println("请选择:");
    }
    // 功能1 录入任意多个学生信息、输出学生信息
    public void method() {

        System.out.print("请输入要录入学生信息的个数：");

        int InputStudentNumber = input.nextInt();

        for (int i = 0; i < InputStudentNumber; i++) {

            Student student = new Student();
            System.out.print("请录入第" + (i + 1) + "个学生的学号：");
            student.setStudentNumber(input.next());
            System.out.print("请录入第" + (i + 1) + "个学生的姓名：");
            student.setName(input.next());
            System.out.print("请录入第" + (i + 1) + "个学生的性别：");
            student.getSex(input.next());
            System.out.print("请录入第" + (i + 1) + "个学生的数学成绩：");
            student.setMathCJ(input.nextDouble());
            System.out.print("请录入第" + (i + 1) + "个学生的英语成绩：");
            student.setEnglishCJ(input.nextDouble());
            System.out.print("请录入第" + (i + 1) + "个学生的java成绩：");
            student.setJavaCJ(input.nextDouble());

            stulist.add(student);

        }
        System.out.println("录入完毕");

        for (int i = 0; i < stulist.size(); i++) {

            stulist.get(i).display();
        }

    }

    // 功能2 计算每个学生高数 英语 java课程的总成绩和平均成绩并输出、计算各门课程的总成绩和平均成绩并输出
    public void method1() {
        if (stulist.size() == 0) {

            System.out.println("集合为空,请先录入学生信息");
        } else {

            // 计算每个学生高数 英语 java课程的总成绩平均成绩

            long startTime = System.currentTimeMillis();

            for (int i = 0; i < stulist.size(); i++) {

                System.out.println("第" + (i + 1) + "个学生" + stulist.get(i).getName() + "的总成绩是：" + stulist.get(i).getSum() + "，平均成绩是：" + stulist.get(i).getAve());

            }

            // 计算各门课程的总成绩和平均成绩

            System.out.println("计算各门课程的总成绩和平均成绩并输出");
            double mathSum = 0;
            double EnglishSum = 0;
            double JavaSum = 0;



            for (int i = 0; i < stulist.size(); i++) {

                mathSum += stulist.get(i).getMathCJ();

                EnglishSum += stulist.get(i).getEnglishCJ();

                JavaSum += stulist.get(i).getJavaCJ();

            }



            System.out.println("高数课程的总成绩是：" + mathSum + "平均成绩是：" + mathSum/stulist.size());

            System.out.println("英语课程的总成绩是：" + EnglishSum + "平均成绩是：" + EnglishSum / stulist.size());

            System.out.println("Java课程的总成绩是：" + JavaSum + "平均成绩是：" + JavaSum / stulist.size());

            long endTime = System.currentTimeMillis();

            System.out.println("程序运行时间：" + (endTime - startTime) + "ms");

        }

    }



    // 功能3 排序，根据学生的总成绩按降序排列，并输出排序后的结果

    public void method2() {

        if (stulist.size() == 0) {
            System.out.println("集合为空,请先录入学生信息");
        } else {
            // 根据学生的总成绩按降序排列

            long startTime = System.currentTimeMillis();
            Collections.sort(stulist, new Comparator<Student>() {
                @Override

                public int compare(Student o1, Student o2) {

                    // 注意升序降序改大于号和小于号

                    if (o1.getSum() < o2.getSum()) {
                        return 1;
                    }
                    // 相等不执行交换

                    if (o1.getSum() == o2.getSum()) {
                        return 0;
                    }
                    return -1;
                }
            });
            // 输出所有学生信息和总成绩
            System.out.println("输出所有学生姓名和总成绩");

            for (int i = 0; i < stulist.size(); i++) {

                System.out.println("学生姓名：" + stulist.get(i).getName() + "，总成绩是" + stulist.get(i).getSum());
            }
            long endTime = System.currentTimeMillis();
            System.out.println("程序运行时间：" + (endTime - startTime) + "ms");
        }
    }
    // 功能4 分别输出高数、英语、Java课程不及格学生的人数、不及格学生的信息
    public void method4() {

        if (stulist.size() == 0) {

            System.out.println("集合为空,请先录入学生信息");

        } else {

            // 高数不及格

            int gaoShuBuJiGe = 0;

            int yingYuBuJiGe = 0;

            int JavaBuJiGe = 0;

            StringBuffer gaoShuStringBuffer = new StringBuffer("");

            StringBuffer yingYuStringBuffer = new StringBuffer("");

            StringBuffer JavaStringBuffer = new StringBuffer("");

            long startTime = System.currentTimeMillis();

            for (int i = 0; i < stulist.size(); i++) {

                // 判断高数成绩
                if (stulist.get(i).getMathCJ() < 60) {
                    gaoShuBuJiGe++;
                    gaoShuStringBuffer.append(stulist.get(i).getName() + ",");
                }
                // 判断英语成绩

                if (stulist.get(i).getEnglishCJ() < 60) {

                    yingYuBuJiGe++;

                    yingYuStringBuffer.append(stulist.get(i).getName() + ",");

                }

                // 判断Java成绩

                if (stulist.get(i).getJavaCJ() < 60) {

                    JavaBuJiGe++;

                    JavaStringBuffer.append(stulist.get(i).getName() + ",");

                }

            }

            if (gaoShuBuJiGe != 0) {

                System.out.println("高数不及格的学生有：" + gaoShuStringBuffer);

                System.out.println("高数不及格的学生共有：" + gaoShuBuJiGe + "个。");

            } else {

                System.out.println("高数没有不及格的学生。");

            }

            if (yingYuBuJiGe != 0) {

                System.out.println("英语不及格的学生有：" + yingYuStringBuffer);

                System.out.println("英语不及格的学生共有：" + yingYuBuJiGe + "个。");

            } else {

                System.out.println("英语没有不及格的学生。");

            }

            if (JavaBuJiGe != 0) {

                System.out.println("Java不及格的学生有：" + JavaStringBuffer);

                System.out.println("java不及格的学生共有：" + JavaBuJiGe + "个。");

            } else {

                System.out.println("Java没有不及格的学生。");

            }

            long endTime = System.currentTimeMillis();

            System.out.println("程序运行时间：" + (endTime - startTime) + "ms");

        }



    }



    // 功能5 根据给定学生的姓名，查找该学生并输出该学生的信息

    public void method5() {



        if (stulist.size() == 0) {

            System.out.println("集合为空,请先录入学生信息");

        } else {

            boolean chaXunJG = false;

            System.out.print("请输入要查询的学生姓名:");

            String JxingMing = input.next();

            long startTime = System.currentTimeMillis();

            for (int i = 0; i < stulist.size(); i++) {

                // 注意为了加速循环加了break但是如果重名，则只能查到第一个！

                if (JxingMing.equals(stulist.get(i).getName())) {

                    System.out.println("查询到姓名为：" + JxingMing + "的学生");

                    chaXunJG = true;

                    stulist.get(i).display();

                    break;

                }



            }

            if (!chaXunJG) {

                System.out.println("查无此人，查询失败！");

            }

            long endTime = System.currentTimeMillis();

            System.out.println("程序运行时间：" + (endTime - startTime) + "ms");

        }



    }



    // 功能6 删除给定学号学生的信息，并输出删除后的结果

    public void method6() {

        System.out.println("删除前");

        for (int i = 0; i < stulist.size(); i++) {

            stulist.get(i).display();

        }

        boolean chaXunJG = false;





        if (stulist.size() == 0) {

            System.out.println("集合为空,请先录入学生信息");

        } else {

            System.out.print("请输入要删除的学生学号:");

            String JxueHao = input.next();

            long startTime = System.currentTimeMillis();

            for (int i = 0; i < stulist.size(); i++) {

                // 注意为了加速循环加了break但是如果重名，则只能删除第一个！

                if (JxueHao.equals(stulist.get(i).getStudentNumber())) {
                    // 删除操作
                    System.out.println("已删除学号为:" + JxueHao + "的学生");
                    stulist.remove(i);
                    chaXunJG = true;
                    break;
                }
            }
            if (!chaXunJG) {
                System.out.println("查无此人，删除失败！");
            }
            System.out.println("删除后");
            if (stulist.size() == 0) {
                System.out.println("集合为空，无需输出");
            } else {
                for (int i = 0; i < stulist.size(); i++) {
                    stulist.get(i).display();
                }
            }
            long endTime = System.currentTimeMillis();
            System.out.println("程序运行时间：" + (endTime - startTime) + "ms");
        }

    }

    // 功能7 万年历，输入任意的年份和月份，控制台显示当前月的日期与星期对照

    public void method7() {
        int Jyear = 1900; // 年份

        int Jmonth = 1; // 月份

        int Jday = 0; // 1900年至月初的总天数

        int Jmonthday = 0;

        // 年份条件判断

        do {

            System.out.print("请输入要查询的年份");

            Jyear = input.nextInt();

            if (Jyear < 1900) {

                System.out.println("您输入的年份小于1900年，请重新输入");

                continue;
            }
        } while (Jyear < 1900);
        // 月份条件判断
        do {
            System.out.print("请输入要查询的月份");

            Jmonth = input.nextInt();

            if (Jmonth < 1 || Jmonth > 12) {

                System.out.println("您输入的月有误，请重新输入");

                continue;
            }
        } while (Jmonth < 1 || Jmonth > 12);
        long startTime = System.currentTimeMillis();
        // 累加年份天数
        for (int a = 1900; a <= Jyear - 1; a++) {
            if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0) {
                Jday += 366;
            } else {
                Jday += 365;
            }

        }
        // 累加月份天数
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
        // 加1%7计算1号是周几
        Jday += 1;
        int wekday = Jday % 7;
        // 计算该月有几天
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
        // 按格式输出
        System.out.println("日\t一\t二\t三\t四\t五\t六");
        for (int j = 1; j <= wekday; j++) {
            // 不换行输出空格
            System.out.print("\t");
        }
        for (int i = 1; i <= Jmonthday; i++) {
            if (Jday % 7 == 6) {
                // 输出周六并换行
                System.out.print(i + "\n");
            } else {
                System.out.print(i + "\t");
            }
            Jday++;
        }
        System.out.println("");
        long endTime = System.currentTimeMillis();
        System.out.println("程序运行时间：" + (endTime - startTime) + "ms");

    }

}


