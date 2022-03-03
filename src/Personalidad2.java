import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Personalidad2 {
//estoy intentando GUIT
    private int numberOfQuestions;  //this is the fields beloow
    private String[][] questions;//esto es para el array
   // private int[][] answers;
   // private int[] scores;

    public Personalidad2() {
       // numberOfQuestions = 9;
        questions = new String[10][];

        //FIRST BOUNCH OF QUESTIONS
        questions[0] = new String[4];
        questions[0][0] = "te gusta la autoridad";//el segundo array es como el id de la pregungta  que se puede sumar
        questions[0][1] = "eres entusiate";
        questions[0][2] = "Eres sentimental";
        questions[0][3] = "te gusta de la instruccion";

        //SECOND BOUND OF QUESTIONS
        questions[1] = new String[4];
        questions[1][0] = "Te gusta tomar el cargo";
        questions[1][1] = "You take the riks";
        questions[1][2] = "Loyal";
        questions[1][3] = "Accurate in every step of the life ";

        //THIRD BOUNCH OF QUESTIONS
        questions[2] = new String[4];
        questions[2][0] = "Deterministic guy,straigth to the point";
        questions[2][1] = "Entrepreneur";
        questions[2][2] = "Calm, paceful";
        questions[2][3] = "Consistent...you just go for it";

        //FOURTH BOUNCH OF QUESTIONS
        questions[3] = new String[4];
        questions[3][0] = "You like the authority";
        questions[3][1] = "You are entusiastic";
        questions[3][2] = "You are a sentimental person";
        questions[3][3] = "You like the instructions";

        //FIFTH BOUNCH OF QUESTIONS
        questions[4] = new String[4];
        questions[4][0] = "You like the authority";
        questions[4][1] = "You are entusiastic";
        questions[4][2] = "You are a sentimental person";
        questions[4][3] = "You like the instructions";

        //SIXTH BOUND OF QUESTIONS
        questions[5] = new String[4];
        questions[5][0] = "Take the charge";
        questions[5][1] = "You take the riks";
        questions[5][2] = "Loyal";
        questions[5][3] = "Accurate in every step of the life ";

        //SEVETH BOUNCH OF QUESTIONS
        questions[6] = new String[4];
        questions[6][0] = "Deterministic guy,straigth to the point";
        questions[6][1] = "Entrepreneur";
        questions[6][2] = "Calm, paceful";
        questions[6][3] = "Consistent...you just go for it";

        //EIGTH BOUNCH OF QUESTIONS
        questions[7] = new String[4];
        questions[7][0] = "You like the authority";
        questions[7][1] = "You are entusiastic";
        questions[7][2] = "You are a sentimental person";
        questions[7][3] = "You like the instructions";

        //NINETH BOUNCH OF QUESTIONS
        questions[8] = new String[4];
        questions[8][0] = "You like the authority";
        questions[8][1] = "You are entusiastic";
        questions[8][2] = "You are a sentimental person";
        questions[8][3] = "You like the instructions";
//
        //TENTH BOUND OF QUESTIONS
        questions[9] = new String[4];
        questions[9][0] = "Take the charge";
        questions[9][1] = "You take the riks";
        questions[9][2] = "Loyal";
        questions[9][3] = "Accurate in every step of the life ";
        
      

//        answers = new int[4][];
//        answers[0] = new int[4];
//        answers[1] = new int[4];
//        answers[2] = new int[4];
//        answers[3] = new int[4];

    }

    public String askQuestions() {
        int total = 0;
        int count,total1=0,total2=0,total3=0,total4=0;
        Scanner sc = new Scanner(System.in);
        
        for (int q = 0; q < questions.length; q++) {
            System.out.println("Please select the answer answer that describes you bes");//change

            System.out.println("1. " + questions[q][0]);
            System.out.println("2. " + questions[q][1]);
            System.out.println("3. " + questions[q][2]);
            System.out.println("4. " + questions[q][3]);
            // .... wait for answer, read it, store it in answers
            count = 0;
            List<Integer> validate = new ArrayList<>();
            while (count <= 2) { 
                String s = sc.nextLine();
                try{
                    int n = Integer.parseInt(s);
                } catch(Exception e){
                    System.out.println("Invalid answer. ");
                    continue;
                }
               int n = Integer.parseInt(s); 
                System.out.println("n="+n);
               if (n > 0
                        && n < 5 && !validate.contains(n)) {
                    //total+=n;/// change total
                   validate.add(n);
                   //aqui va ell if de validacion n
                     switch(count){
                         case(0):
                      total1 +=n;
                      break;       
                      case(1):
                          total2 +=n;
                          break;
                          case(2):
                              total3 +=n;
                              break;       
                              case(3):
                                  total4 +=n;
                     }
                     count++;

                } else {
                    System.out.println("invalid answer");
                }
             
//aeargc what number is not in the list                
            }
           
            System.out.println("total1= "+ total1);
            System.out.println("total2= "+total2);
            System.out.println("total3= "+total3);
            
            System.out.println("total4= "+total4);
        }
        
        return evaluate(total1, total2, total3, total4);
    }

    // this is the area of the output results
    public String evaluate(int total1, int total2, int total3, int total4) {
        if (total1 > Math.max(Math.max(total2,total3), total4)) {
            return "Personality Type 1";
        }
        else if (total2 > Math.max(Math.max(total1,total3), total4)) {
            return "Personality Type 2";
        }
        else if (total3 > Math.max(Math.max(total2,total1), total4)) {
            return "Personality Type 3";
        }
        else {
            return "Personality Type 4";
        }

    }

    public static void main(String[] args) {
        Personalidad2 pt = new Personalidad2();
        //pt.askQuestions();
        System.out.println(pt.askQuestions());
    }
}