# KodlamaIO_JavaKamp_2Gun_Odev1
# Object Oriented Programming temel alınarak örnek bir Java projesidir.

Kodlama.io sitesinde Kurs ve Öğrenci 2 temel sınıf ele alındı
CourseManager adında bir operasyon sınıfı oluşturuldu ve bir öğrencinin kursa kayıt olması, kursun start edilmesi ve kursun tamamlama aşaması operasyonları yazıldı.

Student sınıfı ve örnek bir constructor method yazıldı

public class Student {

    int id;
    String name;
    String surname;
    String email;
    String nationalID;
    String birthDate;
    String courseName;
    int courseCompletePercentage;

    public Student(
            int id,
            String name,
            String surname,
            String email,
            String nationalID,
            String birthDate,
            String courseName,
            int courseCompletePercentage){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.nationalID = nationalID;
        this.birthDate = birthDate;
        this.courseCompletePercentage = courseCompletePercentage;
        this.courseName = courseName;
    };

    public Student() {

    }

    public void setCourse(Course course) {
        this.courseName = course.courseName;
    }
}
