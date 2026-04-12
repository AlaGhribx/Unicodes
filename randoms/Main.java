package randoms;
import java.util.Scanner; // 1. استيراد المكتبة

public class Main {
    public static void main(String[] args) {
        
        // 2. إنشاء كائن Scanner للقراءة من لوحة المفاتيح (System.in)
        Scanner inpu = new Scanner(System.in);

        
        System.out.print("أدخل اسمك: ");
        String name = inpu.nextLine(); // قراءة نص (سطر كامل)
        
        System.out.print("أدخل عمرك: ");
        int age = inpu.nextInt(); // قراءة رقم صحيح
        
        // طباعة النتيجة
        System.out.println("مرحباً " + name + "، عمرك هو " + age);
        
        inpu.close(); // إغلاق السكانر (ممارسة برمجية جيدة)
    }
}