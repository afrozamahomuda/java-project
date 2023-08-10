class BasicCalculator implements Calculation{
    double Value1,Value2;
    BasicCalculator(){
        System.out.println("Default constructor");
    }
    BasicCalculator(double V1,double V2){
    this.Value1=V1;
    this.Value2=V2;
    }
    public double getValue1() {
        return Value1;
    }

    public void setValue1(double V1) {
        this.Value1 = V1;
    }

    public double getValue2() {
        return Value2;
    }

    public void setValue2(double V2) {
        this.Value2 = V2;
    }
   
    public double add(){
        return Value1+Value2;
        }
   
    public double subtract(){
        return Value1-Value2;
    } 
  
    public double multiply(){
        return Value1*Value2;
    }
   
    public double divide(){
        return Value1/Value2;   
    }

    
    }