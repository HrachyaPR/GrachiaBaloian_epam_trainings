package lesson2;

public class SeasonsHomework {

    /**
     * Ունեք թվերի մասիվ, որոնք պետք է ունենան 1-12 արժեքներ
     * int[] months = {1, 3, 6, 9, 12};
     *
     * Գրեք կոդի հատված, որը կտպի մասիվի ԲՈԼՈՐ թվերին համապատասխան ամիսների անունները
     *
     * Օրինակ՝ մասիվի մեջ ունենալով 3 թիվը, պետք է ակնկալել Մարտ ամիսը ․․․
     * Խնդիրը լուծել 2 եղանակով՝
     *
     * Լուծում 1:
     * for-i , if-else if
     *
     * Լուծում 2:
     * foreach, switch
     */
    public static void main(String[] args) {
        int[] months = {1,2, 3,4,5 ,6,7,8, 9,10,11, 12};
        String[] monthsName= {"January","February","March","April","May","June","July","August","September","October","November","December"};

        for (int i = 0; i < months.length; i++) {
            // System.out.println(monthsName[months[i]-1]); urish tarberak


            if(months[i]==1){
                System.out.println(monthsName[0]);
            }
            else if(months[i]==3){
                System.out.println(monthsName[2]);
            }

        }
        System.out.println("////");
          for (int month : months){
             // System.out.println(monthsName[month-1]);
              switch (month){
                  case 1:
                      System.out.println(monthsName[0]);
                      break;
                  case 2:
                      System.out.println(monthsName[1]);
                      break;
                  case 3:
                      System.out.println(monthsName[2]);
                      break;
              }

          }







    }
}
