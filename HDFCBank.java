interface Bank{

public void credit(int depAmt); // these are abstarct method abstract methods doesnt have a body and this new cange

public void debit(int wAmt);    // if we put {} instead of ; at end it will give error that interface method cannot have body

}

interface RBI{ // defining multiple interface

public void interest(int iAmt);

}

class WorldBank {

public void loan(){
System.out.println("In loan method");
}
}

class HDFCBank extends WorldBank implements Bank, RBI{  //calling multiple interface

int currentBal = 500;

public void debit(int wAmt){

currentBal = currentBal - wAmt;
System.out.println(currentBal);

}

public void credit(int depAmt){

currentBal = currentBal + depAmt;
System.out.println(currentBal);
}

public void interest(int iAmt){

currentBal = currentBal +iAmt;
System.out.println(currentBal);
}

public static void main (String[] args){

HDFCBank d= new HDFCBank();
d.debit(100);
d.credit(200);
d.interest(10);
d.loan();
System.out.println("Code complete");
}

}
