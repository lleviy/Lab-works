package lab2.task1;

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
	    Phone phone1 = new Phone(), phone2 = new Phone(), phone3 = new Phone();
	    phone1.number = BigInteger.valueOf(843872347);
	    phone2.number = BigInteger.valueOf(836278903);
	    phone3.number = BigInteger.valueOf(823638300);
        System.out.printf("Phone1: %d,\nPhone2: %d,\nPhone3: %d\n", phone1.number, phone2.number, phone3.number);
		System.out.printf("Phone1: %d,\nPhone2: %d,\nPhone3: %d\n", phone1.getNumber(), phone2.getNumber(), phone3.getNumber());
		phone1.receiveCall("John");
		phone2.receiveCall("Tom");
		phone3.receiveCall("Jack");
		phone3.receiveCall("Sam", BigInteger.valueOf(843872347));
		phone1.sendMessage(BigInteger.valueOf(836278903), BigInteger.valueOf(823638300));
    }
}
