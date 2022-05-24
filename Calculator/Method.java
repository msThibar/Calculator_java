/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculator;

import java.util.Stack;

/**
 *
 * @author Nguyen V Toan
 */
public class Method {
    public static Double calculator(String infix){
        Stack<Character> stack= new Stack<>();
        String postfix= "";
        String tmp="";
        for(int i=0; i< infix.length(); i++){
            char c= infix.charAt(i);
            if(!init.isNum(c)) {
                postfix+= tmp+" ";
                tmp= "";
                if(c=='(')  stack.push(c);
                else if(c==')'){
                    char j= stack.pop();
                    while(j!='('){
                        postfix+= j+" ";
                        j= stack.pop();
                    }
                }else if(!stack.empty()){
                    char j= stack.pop();
                    if(init.isNhanChia(j)!=0 && (init.isNhanChia(c)==1 || init.isNhanChia(j)==2)){
                        postfix+= j+" ";
                    }else   stack.push(j);
                    stack.push(c);
                }else   stack.push(c);

            }else{
                tmp+= c;
            }
        }
        postfix+= tmp+" ";
        while(!stack.empty()){
            char j= stack.pop();
            postfix+= j+" ";
        }
        Stack<Double> t= new Stack<>();
        t.push((double)0);
        String[] out= postfix.trim().replaceAll("\\s+", " ").split(" ");
        for(String index : out){
            if(!init.isNum(index.charAt(0))){
                char d= index.charAt(0);
                double a= t.pop();
                double b= t.pop();
                double c = 0;
                switch (d){
                    case '+':
                        c= a+b;
                        break;
                    case '-':
                        c= b-a;
                        break;
                    case '*':
                        c= b*a;
                        break;
                    case '/':
                        c= b/a;
                        break;
                }   
                t.push(c);
            }else {
                t.push(Double.parseDouble(index));
            }
        }
        return t.pop();
    }
}
