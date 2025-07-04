package lib;

public class PasswordValidatorTest{
    
    public static void run() {
        System.out.println("--- Running Password Validator Tests ---");
        
        String pw = "123";
        // Test Case 1: รหัสผ่านสั้นควรจะ INVALID
        PasswordStrength result1 = PasswordValidator.validate(pw);
        if (result1 == PasswordStrength.INVALID) {
            System.out.println("Test Case 1 Passed:" + pw + " Short password is INVALID.");
        } else {
            System.out.println("Test Case 1 FAILED: Expected INVALID but got " + result1);
        }
        //Test Case 2 : รหัสผ่านแข็งแรง มีทั้งตัวเล็ก ตัวใหญ่ ตัวเลข และ อักษรพิเศษ 
        String st = "LnwPepperP0@" ; 
        PasswordStrength result2 = PasswordValidator.validate(st);
        if (result2 == PasswordStrength.STRONG) {
            System.out.println("Test Case 2 Passed:" + st + " password is strong.");
        } else {
            System.out.println("Test Case 2 FAILED: Password is't" + result2);
        }

        // Test Case 3 : รหัสปานกลาง มีตัวเลข ตัวใหญ่ , ตัวเลข ตัวเล็ก , ตัวเลข อักษรพิเศษ , ตัวใหญ่ อักษรพิเศษ
        String md = "PPPP[DDD]" ; 
        PasswordStrength result3 = PasswordValidator.validate(md);
        if (result3 == PasswordStrength.MEDIUM) {
            System.out.println("Test Case 3 Passed:" + md + " password is medium.");
        } else {
            System.out.println("Test Case 3 FAILED:Password is't " + result2);
        }

        //Test Case 4 : รหัสผ่านอ่อน เป็นตัวเล็กทั้งหมด 
        String wk = "abcdefg" ; 
        PasswordStrength result4 = PasswordValidator.validate(wk);
        if (result4 == PasswordStrength.INVALID){
            System.out.println("Test Case 4 Passed:" + wk + " password is weak .");
        } else {
            System.out.println("Test Case 4 FAILED: Password is't " + result2);
        }
        // --- เขียน Test Case อื่นๆ ต่อ ---

        System.out.println("--------------------------------");
    }
}
