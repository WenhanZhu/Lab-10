class Cookie{
 int NumCookie;
 int Temperature;
 int Minutes;
 boolean Bake;

Cookie(){
NumCookie=0;
Temperature=0;
Minutes=0;
Bake= false;
}

Cookie(int number, int bakeTemp, int bakeTime, boolean isReady){
NumCookie=number;
Temperature= bakeTemp;
Minutes=bakeTime;
Bake= isReady;
}


boolean getBake(){
  return Bake;
}

void setNumCookie (int TheNumCookie){
  NumCookie=TheNumCookie;
}

void setTemperature (int TheTemperature){
  Temperature=TheTemperature;
}

void setMinutes (int TheMinutes){
  Minutes=TheMinutes;
}

void print() {System.out.println( NumCookie+ "cookies were baked at "+Temperature + "degrees F for" +Minutes +"minutes");}
}

