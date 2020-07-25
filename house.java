class Area

{

    private double s;

    private double a;
 
   public void setSqfeet(double s)

    {

        this.s=s;

    }

    public double getSqfeet(double s)

    {

        return this.s;
  
  }

    public void setArea(double a)

    {

        this.a=a;
 
   }

    public double getArea()
 
   {

        if(this.s==1200)
   
     {

            return (this.a)/(1200*this.s);
 
       }
 
       else if(this.s==1500)
   
     {
 
           return (this.a)/(1500*this.s);

        }
    
    else if(this.s==1800)
    
    {
     
       return (this.a)/(1800*this.s);
  
      }

        else 
   
     {
     
      return (this.a)/(2500*this.s);
 
        }
 
   }

}

public class Main

{
	
public static void main(String[] args)

{

Area a=new Area();
  
      a.setSqfeet(1500);

        a.setArea(2589000);
 
       System.out.println(a.getArea());
 
       //System.out.println(a.getSqfeet());
	
}

}
