package studentsScore;

public class Student {
        private String StudentNumber; // 学号
        private String name; // 姓名
        private String sex; // 性别
        private double MathCJ; // 数学成绩
        private double EnglishCJ; // 英语成绩
        private double javaCJ; // Java成绩
         // 计算总成绩方法
        public double getSum() {

            return MathCJ + EnglishCJ + javaCJ;

        }

        // 计算平均成绩方法
        public double getAve() {

            return getSum() / 3;

        }
        // 成员信息显示方法
        public void display() {

            System.out.println("学生信息:学号:" + StudentNumber + ",姓名:" + name + ",性别:" + sex + "数学成绩:" + MathCJ + "英语成绩:" + EnglishCJ + "Java成绩:" + javaCJ + "总成绩:" + getSum() + "平均成绩:" + getAve());
        }

        public String getStudentNumber() {
            return StudentNumber;
        }

        public void setStudentNumber(String studentNumber) {

            this.StudentNumber = studentNumber;

        }

        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getSex(String next) {

            return sex;
        }
        public void setSex(String sex) {

            if (!(sex.equals("男")) && !(sex.equals("女"))) {
                //默认男
                this.sex = "男";
            }
            this.sex = sex;
        }
        public double getMathCJ() {
            return MathCJ;
        }
        public void setMathCJ(double mathCJ) {

            if (mathCJ < 0 || mathCJ > 100) {
                //默认60
                mathCJ = 60;
            }
            this.MathCJ = mathCJ;

        }
        public double getEnglishCJ() {

            return EnglishCJ;

        }
        public void setEnglishCJ(double EnglishCJ) {
            if (EnglishCJ < 0 || EnglishCJ > 100) {
                EnglishCJ = 60;
            }
            this.EnglishCJ = EnglishCJ;
        }
        public double getJavaCJ() {
            return javaCJ;
        }
        public void setJavaCJ(double javaCJ) {

            if (javaCJ < 0 || javaCJ > 100) {
                //默认60
                javaCJ = 60;

            }
            this.javaCJ = javaCJ;

        }
    }

