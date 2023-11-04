public class Main_M2_10_14{
    public static void main(String[] args) {
        MYDATE myDate1 = new MYDATE();
        MYDATE myDate2 = new MYDATE(34355555133101L);
        MYDATE myDate3 = new MYDATE(561555550000L);

        System.out.println("MyDate1:\n year=" + myDate1.getYear() + "\n month=" + myDate1.getMonth() + "\n day=" + myDate1.getDay());
        System.out.println("MyDate2:\n year=" + myDate2.getYear() + "\n month=" + myDate2.getMonth() + "\n day=" + myDate2.getDay());
        System.out.println("MyDate3:\n year=" + myDate3.getYear() + "\n month=" + myDate3.getMonth() + "\n day=" + myDate3.getDay());
    }
}