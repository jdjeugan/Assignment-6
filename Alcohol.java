public class Alcohol extends Beverage{
private boolean isWeekend;
private final double wPrice = .6;
  

public Alcohol(String n, Size s, boolean iw) {
super(n, Type.ALCOHOL, s);
isWeekend = iw;
}
public String toString() {
String s = getBevName() +", " +getBeverageSize();
  
if (isWeekend) {
s += " Weekend";
}
s += ", $" +calcPrice();
return s;
}
public boolean equals(Alcohol a) {
if (super.equals(a) && isWeekend == a.getIsWeekend()) {
return true;
}
else {
return false;
}
}

  


public boolean getIsWeekend() {
return isWeekend;
}
public double getWeekendFee() {
return wPrice;
}
  

public void setIsWeekend(boolean is) {
isWeekend = is;
}


@Override
public double calcPrice() {
	double price = super.getBasePrice();
	  
	if (super.getBeverageSize() == Size.MEDIUM) {
	price += super.getSizePrice();
	}
	else if (super.getBeverageSize() == Size.LARGE) {
	price += 2 * super.getSizePrice();
}
	if (isWeekend) {
		price += wPrice;
		}
	return price;
}

}