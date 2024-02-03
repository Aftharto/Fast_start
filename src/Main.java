import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String term = scanner.nextLine();
        System.out.println(calc(term));
    }
    public static String calc(String input) {
        String[] massiv = input.split(" ");
        if(massiv.length != 3) {
            try {
                throw new IOException("throws Exception");
            } catch (IOException e) {
                return e.getMessage();
            }
        }
        String firstNumber = massiv[0];
        String lastNumber = massiv[2];
        List<String> RomanNumbers = new ArrayList<>();
        RomanNumbers.add("I");
        RomanNumbers.add("II");
        RomanNumbers.add("III");
        RomanNumbers.add("IV");
        RomanNumbers.add("V");
        RomanNumbers.add("VI");
        RomanNumbers.add("VII");
        RomanNumbers.add("VIII");
        RomanNumbers.add("IX");
        RomanNumbers.add("X");
        RomanNumbers.add("XI");
        RomanNumbers.add("XII");
        RomanNumbers.add("XIII");
        RomanNumbers.add("XIV");
        RomanNumbers.add("XV");
        RomanNumbers.add("XVI");
        RomanNumbers.add("XVII");
        RomanNumbers.add("XVIII");
        RomanNumbers.add("XIX");
        RomanNumbers.add("XX");
        RomanNumbers.add("XXI");
        RomanNumbers.add("XXII");
        RomanNumbers.add("XXIII");
        RomanNumbers.add("XXIV");
        RomanNumbers.add("XXV");
        RomanNumbers.add("XXVI");
        RomanNumbers.add("XXVII");
        RomanNumbers.add("XXVIII");
        RomanNumbers.add("XXIX");
        RomanNumbers.add("XXX");
        RomanNumbers.add("XXXI");
        RomanNumbers.add("XXXII");
        RomanNumbers.add("XXXIII");
        RomanNumbers.add("XXXIV");
        RomanNumbers.add("XXXV");
        RomanNumbers.add("XXXVI");
        RomanNumbers.add("XXXVII");
        RomanNumbers.add("XXXVIII");
        RomanNumbers.add("XXXIX");
        RomanNumbers.add("XL");
        RomanNumbers.add("XLI");
        RomanNumbers.add("XLII");
        RomanNumbers.add("XLIII");
        RomanNumbers.add("XLIV");
        RomanNumbers.add("XLV");
        RomanNumbers.add("XLVI");
        RomanNumbers.add("XLVII");
        RomanNumbers.add("XLVIII");
        RomanNumbers.add("XLIX");
        RomanNumbers.add("L");
        RomanNumbers.add("LI");
        RomanNumbers.add("LII");
        RomanNumbers.add("LIII");
        RomanNumbers.add("LIV");
        RomanNumbers.add("LV");
        RomanNumbers.add("LVI");
        RomanNumbers.add("LVII");
        RomanNumbers.add("LVIII");
        RomanNumbers.add("LIX");
        RomanNumbers.add("LX");
        RomanNumbers.add("LXI");
        RomanNumbers.add("LXII");
        RomanNumbers.add("LXIII");
        RomanNumbers.add("LXIV");
        RomanNumbers.add("LXV");
        RomanNumbers.add("LXVI");
        RomanNumbers.add("LXVII");
        RomanNumbers.add("LXVIII");
        RomanNumbers.add("LXIX");
        RomanNumbers.add("LXX");
        RomanNumbers.add("LXXI");
        RomanNumbers.add("LXXII");
        RomanNumbers.add("LXXIII");
        RomanNumbers.add("LXXIV");
        RomanNumbers.add("LXXV");
        RomanNumbers.add("LXXVI");
        RomanNumbers.add("LXXVII");
        RomanNumbers.add("LXXVIII");
        RomanNumbers.add("LXXIX");
        RomanNumbers.add("LXXX");
        RomanNumbers.add("LXXXI");
        RomanNumbers.add("LXXXII");
        RomanNumbers.add("LXXXIII");
        RomanNumbers.add("LXXXIV");
        RomanNumbers.add("LXXXV");
        RomanNumbers.add("LXXXVI");
        RomanNumbers.add("LXXXVII");
        RomanNumbers.add("LXXXVIII");
        RomanNumbers.add("LXXXIX");
        RomanNumbers.add("XC");
        RomanNumbers.add("XCI");
        RomanNumbers.add("XCII");
        RomanNumbers.add("XCIII");
        RomanNumbers.add("XCIV");
        RomanNumbers.add("XCV");
        RomanNumbers.add("XCVI");
        RomanNumbers.add("XCVII");
        RomanNumbers.add("XCVIII");
        RomanNumbers.add("XCIX");
        RomanNumbers.add("C");
        List<String> RomanNumbersBefore10 = new ArrayList<>();
        RomanNumbersBefore10.add("I");
        RomanNumbersBefore10.add("II");
        RomanNumbersBefore10.add("III");
        RomanNumbersBefore10.add("IV");
        RomanNumbersBefore10.add("V");
        RomanNumbersBefore10.add("VI");
        RomanNumbersBefore10.add("VII");
        RomanNumbersBefore10.add("VIII");
        RomanNumbersBefore10.add("IX");
        RomanNumbersBefore10.add("X");
            int result;
            if(RomanNumbersBefore10.contains(massiv[0])  && RomanNumbersBefore10.contains(massiv[2]))
            {
                switch (massiv[1])
                {
                    case "+":
                        result = (RomanNumbers.indexOf(massiv[0]) ) +  (RomanNumbers.indexOf(massiv[2]) );
                        return RomanNumbers.get(result + 1);

                    case "-":
                            result = (RomanNumbers.indexOf(massiv[0])) -  (RomanNumbers.indexOf(massiv[2]) );
                            if (result <= 0)
                            {
                            try
                                {
                                    throw new IOException("throws Exception");
                                    }
                                catch (IOException e)
                                {
                                return e.getMessage();
                                }
                            }
                            else
                            {
                                return RomanNumbers.get(result - 1);
                            }


                        case "*": result = (RomanNumbers.indexOf(massiv[0]) + 1) *  (RomanNumbers.indexOf(massiv[2]) + 1);
                            return RomanNumbers.get(result - 1);


                        case "/": result = (RomanNumbers.indexOf(massiv[0]) + 1 ) /  (RomanNumbers.indexOf(massiv[2] ) + 1);
                            return RomanNumbers.get(result - 1);


                     default:
                         try
                         {
                        throw new IOException("throws Exception");
                         }
                         catch (IOException e)
                         {
                             return e.getMessage();
                         }
                }
            }
            if(RomanNumbersBefore10.contains(massiv[0]) && !RomanNumbersBefore10.contains(massiv[2]))
            {
                try {
                    throw new IOException("throws Exception");
                } catch (IOException e) {
                    return e.getMessage();
                }
            }
            if(!RomanNumbersBefore10.contains(massiv[0]) && RomanNumbersBefore10.contains(massiv[2]))
            {
                try {
                    throw new IOException("throws Exception");
                } catch (IOException e) {
                    return e.getMessage();
                }
            }

        if(!RomanNumbersBefore10.contains(massiv[0]) && !RomanNumbersBefore10.contains(massiv[2]) && massiv.length == 3)
        {
            if((Integer.valueOf(firstNumber)) >= 1 && ((Integer.valueOf(firstNumber)) <= 10) && (Integer.valueOf(lastNumber)) >= 1 && (Integer.valueOf(lastNumber)) <= 10)
            {
                switch (massiv[1])
                {
                    case "+":
                       result = Integer.valueOf(firstNumber) + Integer.valueOf(lastNumber);
                        return String.valueOf(result);

                    case "-":
                        result = Integer.valueOf(firstNumber) - Integer.valueOf(lastNumber);
                        return String.valueOf(result);

                    case "*":
                        result = Integer.valueOf(firstNumber) * Integer.valueOf(lastNumber);
                        return String.valueOf(result);

                    case "/":
                        result = Integer.valueOf(firstNumber) / Integer.valueOf(lastNumber);
                        return String.valueOf(result);
                    default:
                        try {
                            throw new IOException("throws Exception");
                        } catch (IOException e) {
                            return e.getMessage();
                        }

                }
            }
            else
            {
                try {
                    throw new IOException("throws Exception");
                } catch (IOException e) {
                    return e.getMessage();
                }
            }

        }

        return "Ошибка";
    }

}