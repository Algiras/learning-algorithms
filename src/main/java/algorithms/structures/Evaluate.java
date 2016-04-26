package algorithms.structures;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Evaluate {

    public static void main(String[] args){
        Stack<String> ops = new StackOf<String>();
        Stack<Double> vals = new StackOf<Double>();

        while (!StdIn.isEmpty()){
            String s = StdIn.readString();
            if(s.equals("(")) ;
            else if (s.equals("+") ||
                    s.equals("-")||
                    s.equals("*")||
                    s.equals("/")||
                    s.equals("sqrt")) ops.push(s);
            else if (s.equals(")")){
                String op = ops.pop();
                double v = vals.pop();

                if(op.equals("+")) v = vals.pop() + v;
                else if(op.equals("-")) v = vals.pop() - v;
                else if(op.equals("*")) v = vals.pop() * v;
                else if(op.equals("/")) v = vals.pop() / v;
                else if(op.equals("sqrt")) v = Math.sqrt(v);
                vals.push(v);
            } else {
                vals.push(Double.parseDouble(s));
            }
        }
        StdOut.println(vals.pop());
    }
}
