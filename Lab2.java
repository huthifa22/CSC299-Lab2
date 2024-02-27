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
      
        
        System.out.println("2024(to base 2): " + baseConvert(2024, 2, hexMap, new StringBuilder()));
        System.out.println("2024(to base 8): "+baseConvert(2024,8, hexMap, new StringBuilder()));
        System.out.println("2024(to base 16): "+baseConvert(2024,16, hexMap, new StringBuilder()));
        System.out.println("1024(to base 12): "+baseConvert(1024,12, hexMap, new StringBuilder()));
        System.out.println("-155(to base 4): "+baseConvert(-155,4, hexMap, new StringBuilder()));
        System.out.println("250(to base 18): "+baseConvert(250,18, hexMap, new StringBuilder()));
        System.out.println("2023(to base 8): "+baseConvert(2023,8, hexMap, new StringBuilder()));
        System.out.println("8921(to base 16): "+baseConvert(8921,16, hexMap, new StringBuilder()));
        System.out.println("5003(to base 16): "+baseConvert(5003,16, hexMap, new StringBuilder()));     
        System.out.println("5003(to base 5): "+baseConvert(5003,5, hexMap, new StringBuilder())); 
        System.out.println("5003(to base 20): "+baseConvert(5003,20, hexMap, new StringBuilder()));        
        System.out.println("4003(to base 7): "+baseConvert(4003,7, hexMap, new StringBuilder()));     
        
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