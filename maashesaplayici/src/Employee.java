public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    // Kurucu Metot
    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    // Uygulanacak vergi için metot
    public double tax() {
        double taxrate;
        if(salary > 0 && salary <= 1000) {
            taxrate = 0;
        } else {
            taxrate = salary * 0.03;
        }
        return taxrate;
    }

    // Ekstra ücret için metot
    public double bonus() {
        double bonusprice;
        if(workHours > 40) {
            bonusprice = (workHours - 40) * 30;
        } else {
            bonusprice = 0;
        }
        return bonusprice;
    }

    // Başlangıç yılına göre maaş hesabı için metot
    public double raiseSalary() {
        int year;
        double raise = 0;
        year = 2021 - hireYear;
        if(year < 10) {
            raise = salary * 0.05;
        } else if (year >= 10 && year < 20) {
            raise = salary * 0.1;
        } else if (year >= 20){
            raise = salary * 0.15;
        } else {
            System.out.print("Hatalı tuşalama yaptınız!");
        }
         return raise;

    }

    // Çalışan bilgilerini bastırmak için metot
    public void tostring() {
        System.out.println("Ad: " + name);
        System.out.println("Maaşı: " + salary);
        System.out.println("Çalışma saati: " + workHours);
        System.out.println("Başlangıç yılı: " + hireYear);
        System.out.println("Vergi: " + tax());
        System.out.println("Bonus: " + bonus());
        System.out.println("Maaş Artışı: " + raiseSalary());
        System.out.println("Vergi ve Bonuslar ile Birlikte Maaş: " + (salary+bonus()-tax()));
        System.out.println("Toplam Maaş: " + (salary+raiseSalary()));
    }
}
