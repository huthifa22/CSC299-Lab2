import java.util.HashMap;
import java.util.Map;

public class Lab2{
    public static void main(String[] args) {
        
        Map<Integer, Character> hexMap = new HashMap<>();
        hexMap.put(10,'A');
        hexMap.put(11,'B');
        hexMap.put(12,'C');
        hexMap.put(13,'D');
        hexMap.put(14,'E');
        hexMap.put(15,'F');
      
        
        System.out.printf("The equivalent base-2 value of decimal 2024 is: %s\n", baseConvert(2024, 2, hexMap, new StringBuilder()));
        System.out.printf("The equivalent base-8 value of decimal 2024 is: %s\n", baseConvert(2024,8, hexMap, new StringBuilder()));
        System.out.printf("The equivalent base-16 value of decimal 2024 is: %s\n", baseConvert(2024,16, hexMap, new StringBuilder()));
        System.out.printf("The equivalent base-12 value of decimal 1024 is: %s\n", baseConvert(1024,12, hexMap, new StringBuilder()));
        System.out.printf("The equivalent base-4 value of decimal -155 is: %s\n", baseConvert(-155,4, hexMap, new StringBuilder()));
        System.out.printf("The equivalent base-18 value of decimal 250 is: %s\n", baseConvert(250,18, hexMap, new StringBuilder()));
        System.out.printf("The equivalent base-8 value of decimal 2023 is: %s\n", baseConvert(2023,8, hexMap, new StringBuilder()));
        System.out.printf("The equivalent base-16 value of decimal 8921 is: %s\n", baseConvert(8921,16, hexMap, new StringBuilder()));
        System.out.printf("The equivalent base-16 value of decimal 5003 is: %s\n", baseConvert(5003,16, hexMap, new StringBuilder()));     
        System.out.printf("The equivalent base-5 value of decimal 5003 is: %s\n", baseConvert(5003,5, hexMap, new StringBuilder())); 
        System.out.printf("The equivalent base-20 value of decimal 5003 is: %s\n", baseConvert(5003,20, hexMap, new StringBuilder()));        
        System.out.printf("The equivalent base-7 value of decimal 4003 is: %s\n", baseConvert(4003,7, hexMap, new StringBuilder()));   
        
    }
    public static StringBuilder baseConvert(int input, int base,  Map<Integer, Character> hexMap, StringBuilder result){
        if(input < 0){
            return result.append("Invalid, Input should be unsigned"); 
        }else if(base < 2 || base > 16){
            return result.append("Invalid, should be in the range 2 - 16"); 
        }

        // Hex Conversion
        if(base == 16){
            while(input > 0){
                if(input % base >= 10){
                    char val = hexMap.get(input % base);
                    result.append(val);
                }else{
                    result.append(input % base);
                }
                input = input / base;
            }

        // All other Bases
        }else{
            while(input > 0){
                result.append(input % base);
                input = input / base;
            }
        }
        return result.reverse();
    }
}