package lib;

public class PasswordValidator {

    /**
     * ตรวจสอบหาความปลอดภัยของรหัสผ่าน
     * เพื่ออธิบายกฎการทำงานของเมธอด
     * @param password string ที่ต้องการตรวจสอบ ต้องไม่ต่ำกว่า 8 ตัว และไม่เป็นช่องว่าง
     * @return PasswordStrength Invalid อื่นๆ 
     */
    // TODO: แก้ไข return type ของเมธอดนี้ให้ถูกต้อง
    public static PasswordStrength validate(String password) { // Function Type ให้เป็น PasswordStrength 
        int minLength = 8 ;
        // ส่วนของ Implementation ที่คุณต้องเขียน
        // ...
        if(password.length() < minLength || password == null ){
            return PasswordStrength.INVALID ;
        }
        
        boolean lower = false ;
        boolean Digit = false ; 
        boolean upper = false ;
        boolean speci = false ;
        
        for (char c : password.toCharArray()){
            if(Character.isDigit(c))
            Digit =  true ; 

            else if(Character.isUpperCase(c))
            upper = true ; 

            else if(!Character.isLowerCase(c))
            lower = true ;
            else speci = true ; 
        }

        if (Digit && upper && speci && lower ){
            return PasswordStrength.STRONG;
        } else if ((Digit && upper) || (Digit && speci) || (Digit && lower) || (upper && speci) || (upper && lower) || (speci && lower)){
            return PasswordStrength.MEDIUM;
        }else if (!Digit || !upper || !lower || !speci ){
            return PasswordStrength.WEAK;}


         // TODO: มีอะไรขาดหายไปที่บรรทัดนี้?
        
        return PasswordStrength.INVALID ; // TODO: การคืนค่านี้ถูกต้องหรือไม่?
    }
}