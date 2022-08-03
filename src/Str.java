public class Str {
    public static void main(String[] args) {
        //Qwest 1
       String firstName = "Ivanov" ;
       String middleName = "Ivan" ;
       String  lastName = "Ivanovich";
        String fullName =  firstName + ' '+ middleName +' '+ lastName ;
        System.out.println( "ФИО сотрудника — "+fullName);

        //Qwest 2
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());
        //Qwest 3
        String fullName1 = "Иванов Семён Семёнович";
        fullName1 = fullName1.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " +fullName1 );

    }
}
