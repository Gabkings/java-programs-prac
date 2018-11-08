/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasoftwaredesigns;

/**
 *
 * @author developer
 */
public class JavaSoftwareDesigns {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        RiddleProgram riddle = new RiddleProgram("What is black and what red all over the country","New paper");
        riddle.getQuestion();
        riddle.getAnswer();
        System.out.println("Quizz: "+riddle.getQuestion()+"\n Answer: "+ riddle.getAnswer());
        String s = " ing ";
System.out.println("The s"  + s + s + " k" + s + " . " ) ;
        
    }
    
}
