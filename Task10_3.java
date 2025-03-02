
/*
Разобраться с двумя вариантами работы switch в Джаве: switch statement и switch expression.
Используя их, написать два разных метода приведения оценок к старорежимной системе:
плохо
неудовлетворительно
удовлетворительно
хорошо
отлично
Один метод должен принимать цифровую оценку от 1 до 5 и возвращать соответствующую строку
из вышеприведенного списка. Второй — принимать “американскую” оценку в виде символа F, C, B, A.
Один метод должен использовать switch statement, другой — switch expression.

 */

public class Task10_3 {
    public static void main(String[] args) {
        System.out.println(whatGrade(5));
        System.out.println(whatAmGrade('B'));


    }

    static String whatGrade (int grade){
        switch (grade){
            case 5: return "отлично";
            case 4: return "хорошо";
            case 3: return "удовлетворительно";
            case 2: return "неудовлетворительно";
            case 1: return "плохо";
            default:
                throw new IllegalStateException("Unexpected value: " + grade);
        }
    }

    static String whatAmGrade (char grade){
        String result = switch (grade){
            case 'A': yield "отлично";
            case 'B': yield "хорошо";
            case 'C': yield "удовлетворительно";
            case 'F': yield "плохо";
            default:
                throw new IllegalStateException("Unexpected value: " + grade);
        };
        return result;
    }
}
