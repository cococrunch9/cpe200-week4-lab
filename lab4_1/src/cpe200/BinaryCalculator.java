package cpe200;


public class BinaryCalculator {
    private Operand firstOperand;
    private Operand secondOperand;

    public BinaryCalculator()
    {
    }

    public void setFirstOperand(Operand operand)
    {
        this.firstOperand = operand;
    }


    public void setSecondOperand(Operand operand)
    {
        this.secondOperand = operand;
    }

    public String add()
    {
        double num1,num2,hold;
        String ans;
        num1 = Double.parseDouble(firstOperand.getOperand());
        num2 = Double.parseDouble(secondOperand.getOperand());
        hold = num1 + num2;
        hold = (double)Math.round(hold * 100000d) / 100000d;
        if(hold*10%10 == 0)
        {
            int hold2 = ((int) hold);
            ans = Integer.toString(hold2);
        }
        else ans = Double.toString(hold);
        return ans;
    }

    public String subtract()
    {
        double num1,num2,hold;
        String ans;
        num1 = Double.parseDouble(firstOperand.getOperand());
        num2 = Double.parseDouble(secondOperand.getOperand());
        hold = num1 - num2;
        hold = (double)Math.round(hold * 100000d) / 100000d;
        if(hold*10%10 == 0)
        {
            int hold2 = ((int) hold);
            ans = Integer.toString(hold2);
        }
        else ans = Double.toString(hold);
        return ans;
    }

    public String multiply()
    {
        double num1,num2,hold;
        String ans;
        num1 = Double.parseDouble(firstOperand.getOperand());
        num2 = Double.parseDouble(secondOperand.getOperand());
        hold = num1 * num2;
        hold = (double)Math.round(hold * 100000d) / 100000d;
        if(hold*10%10 == 0)
        {
            int hold2 = ((int) hold);
            ans = Integer.toString(hold2);
        }
        else ans = Double.toString(hold);
        return ans;
    }

    /* This method should throw an exception when divide by zero */
    public String division() throws ArithmeticException
    {
        double num1,num2,hold;
        String ans;
        num1 = Double.parseDouble(firstOperand.getOperand());
        num2 = Double.parseDouble(secondOperand.getOperand());
        if(num2 == 0)
        {
            throw new ArithmeticException();
        }
        hold = num1/num2;
        hold = (double)Math.round(hold * 100000d) / 100000d;
        if(hold*10%10 == 0)
        {
            int hold2 = ((int) hold);
            ans = Integer.toString(hold2);
        }
        else ans = Double.toString(hold);
        return ans;
    }

    public String power()
    {
        double num1,num2,hold;
        String ans;
        num1 = Double.parseDouble(firstOperand.getOperand());
        num2 = Double.parseDouble(secondOperand.getOperand());
        hold = Math.pow(num1,num2);
        hold = (double)Math.round(hold * 100000d) / 100000d;
        if(hold*10%10 == 0)
        {
            int hold2 = ((int) hold);
            ans = Integer.toString(hold2);
        }
        else ans = Double.toString(hold);
        return ans;
    }

}
