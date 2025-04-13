/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ovenstack;
import java.util.*;
/**
 *
 * @author zzano
 */
public class OvenStacks implements OvenInterface {
    private ArrayList<String> theStack;
    public OvenStacks(){
        theStack = new ArrayList<String>();
    }
    public boolean isEmpty(){
        return theStack.isEmpty();
    }
    public boolean isFull(){
        return theStack.size()>=5;
    }
    public Object pop(){
        if (!(theStack.isEmpty())){
            return theStack.remove(0);
        }else{
            return null;
        }
    }
    public void push(Object newItem){
        theStack.add(0, (String)newItem);
    }
    public void emptyStack(){
        while (! theStack.isEmpty()){
            pop();
        }
    }
    public String displayStack(){
        Iterator it;
        String str = new String();
        it = theStack.iterator();
        if(theStack.isEmpty()) return "Stack is empty\n";
        str = ("Top Cake is: \n" + theStack.get(0) + "\n Other cakes in the stack: \n");
        for (int i = 1; i < theStack.size(); i++) {
        str += theStack.get(i) + "\n";
    }
    return str.toString();
}
}
