class Suger extends Cookie{
private String Shape;
private boolean  Decorated;


Suger(){
Shape="";
Decorated=false;
}

Suger(String aShape,boolean aDecorated){
  aDecorated=false;
  Shape=aShape;
  Decorated=aDecorated;
  
}

String getShape(){
  return Shape;
}

void setShape (String TheShape){
  Shape=TheShape;
}




void print() 
{System.out.println( NumCookie+ " cookies were cut into " +Shape);
if (Bake=true){
Decorated=true;
System.out.println( "The cookies were decorated");}
else {System.out.println( "Make sure to bake the cookies first");}
} 


void decorate() {
  if(getBake()==true){
    Decorated=true;
    System.out.println("The cookies were decorated");}
    else{
      System.out.println("Make sure to bake the cookies first");
    }

  }
  }
