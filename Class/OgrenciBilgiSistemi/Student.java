package Class.OgrenciBilgiSistemi;

public class Student {
    Course mat;
    Course fizik;
    Course kimya;
    String name; 
    String stuNo;
    int classes;
    double avarage;
    boolean isPass;

    Student(String name, int classes, String stuNo, Course mat, Course fizik, Course kimya){
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass =false;
    }

    public void addBulkExamNote(int mat,int sMat, int fizik, int sFizik, int kimya, int sKimya){
        if(mat>=0 && mat<=100){
            this.mat.note = mat;
        }
        if(sMat>=0 && sMat<=100){
            this.mat.sNote = sMat;
        }

        if(fizik>=0 && fizik<=100){
            this.fizik.note = fizik;
        }
        if(sFizik>=0 && sFizik<=100){
            this.fizik.sNote = sFizik;
        }

        if(kimya>=0 && kimya<=100){
            this.kimya.note = kimya;
        }
        if(sKimya>=0 && sKimya<=100){
            this.kimya.sNote = sKimya;
        }
    }

    public void isPass(){
        if(this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0 ){
            System.out.println("Notlar tam olarak girilmemiş");
        }else{
            this.isPass= isCheckPass();
            printNote();
            System.out.println("Ortalama : " +this.avarage);
            if(this.isPass){
                System.out.println("Sınıfı Geçti.");
            }else{
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void calcAvarage(){
        this.avarage = (((this.mat.note * 0.8) + (this.mat.sNote *0.2)) + 
                        ((this.fizik.note * 0.8) + (this.fizik.sNote * 0.2)) + 
                        ((this.kimya.note * 0.8) + (this.kimya.sNote * 0.2))) /3.0;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note + "\t Matematik Sözlü Notu : " + this.mat.sNote);
        System.out.println("Fizik Notu : " + this.fizik.note + "\t\t Fizik Sözlü Notu : " + this.fizik.sNote);
        System.out.println("Kimya Notu : " + this.kimya.note + "\t\t Kimya Sözlü Notu : " + this.kimya.sNote);
    }
}
