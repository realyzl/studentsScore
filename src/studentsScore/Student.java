package studentsScore;

public class Student {
        private String StudentNumber; // ѧ��
        private String name; // ����
        private String sex; // �Ա�
        private double MathCJ; // ��ѧ�ɼ�
        private double EnglishCJ; // Ӣ��ɼ�
        private double javaCJ; // Java�ɼ�
         // �����ܳɼ�����
        public double getSum() {

            return MathCJ + EnglishCJ + javaCJ;

        }

        // ����ƽ���ɼ�����
        public double getAve() {

            return getSum() / 3;

        }
        // ��Ա��Ϣ��ʾ����
        public void display() {

            System.out.println("ѧ����Ϣ:ѧ��:" + StudentNumber + ",����:" + name + ",�Ա�:" + sex + "��ѧ�ɼ�:" + MathCJ + "Ӣ��ɼ�:" + EnglishCJ + "Java�ɼ�:" + javaCJ + "�ܳɼ�:" + getSum() + "ƽ���ɼ�:" + getAve());
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

            if (!(sex.equals("��")) && !(sex.equals("Ů"))) {
                //Ĭ����
                this.sex = "��";
            }
            this.sex = sex;
        }
        public double getMathCJ() {
            return MathCJ;
        }
        public void setMathCJ(double mathCJ) {

            if (mathCJ < 0 || mathCJ > 100) {
                //Ĭ��60
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
                //Ĭ��60
                javaCJ = 60;

            }
            this.javaCJ = javaCJ;

        }
    }

