class Interest

{  private int p,t;
 
  private double r;
 
   public void setPrinciple(int p )
  
  {
      
  this.p=p ;
 
   }
 
   public void setRate(double r)
 
   {
      
  this.r=r;

    }
  
  public void setTime(int t)
 
   {
     
   this.t=t;

    }
 
   public int getPrinciple()
 
   {

        return this.p;
   
 }

    public double getRate()
  
  {

        return this.r;

    }

    public int getTime()
 
   {

        return this.t;

    }

    public double simpleIntrest()

    {

        return ((this.p)*(this.r)*(this.t))/100;
   
    }

    public double compoundInterest()

    {
 
       return this.p*(Math.pow((1+this.r),this.t)-1);
    
    }

}
