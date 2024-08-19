import java.util.*;
public class rockpaperscissor {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String cm[]={"rock","paper","scissor"};
        System.out.println(" scissor press s " +
                "paper press p "+"rock press r");
        System.out.println("if u want end game press e");
        System.out.println("your turn enter ");
        int pp=0,cp=0;
        char e=sc.next().charAt(0);
        int k=0;
        while(e!='e'){
            k=k%3;
            System.out.println("pc out");
            String c=cm[k];
            System.out.println(cm[k]);

            if(cm[k]=="scissor"&& e=='s'){
                System.out.println("tie");
            }
            if(cm[k]=="scissor"&& e=='r'){
                System.out.println("you win");
                pp++;
            }
            if(cm[k]=="scissor"&& e=='p'){
                System.out.println("pc win");
                cp++;
            }
            if(cm[k]=="rock"&& e=='s'){
                System.out.println("pc win");
                cp++;
            }
            if(cm[k]=="rock"&& e=='p'){
                System.out.println("you win");
                pp++;
            }
            if(cm[k]=="rock"&& e=='r'){
                System.out.println("tie");
            }
            if(cm[k]=="paper"&& e=='s'){
                System.out.println("you win");
                pp++;
            }
            if(cm[k]=="paper"&& e=='p'){
                System.out.println("tie");
            }
            if(cm[k]=="paper"&& e=='r'){
                System.out.println("pc win");
                cp++;
            }
            k++;
            System.out.println("your turn enter ");
            e=sc.next().charAt(0);


        }
        System.out.println("game over");
        if(cp>pp){
            System.out.println("compuet wins"+cp+" "+pp);
        }
        else if(cp==pp){
            System.out.println("tie by "+pp+" "+cp);
        }
        else{
            System.out.println("you win by "+pp+" "+cp);
        }

    }
}

