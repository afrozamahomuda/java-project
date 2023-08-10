class ScientificCalculator extends BasicCalculator implements ScientificCalculation{
   
    public void DoubletoThePow(){
        int base = 3, exponent = 4;
        double result = Math.pow(base, exponent);

        System.out.println("Answer = " + result);
        
    }

    
    

    

    public ScientificCalculator(double V1, double V2) {//parameterized constructor
        super(V1, V2);
        System.out.println("Adding value:"+super.add());
        System.out.println("Multiplying two value:"+super.multiply());
        System.out.println("Divide:"+super.divide());
        System.out.println("Substraction:"+super.subtract());
    }
    public ScientificCalculator(){
        System.out.println("Empty constructor");
    }

    
    } 
 