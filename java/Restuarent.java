import java.util.Scanner;

class Bill_receipt {
	String name,method;
	float Platecost;
	int distance;
	int t=9000;
	char type;

	Bill_receipt(String name,float Platecost,int distance,String method,char type ){
		this.name=name;
		this.Platecost=Platecost;
		this.distance=distance;
		this.method=method;
		this.type=type;
}
    public void printdata(){
		System.out.println("------------------------------------------------------");
		System.out.println("\t\tCustomer name: "+name);
		System.out.println("\t\tCustomer id:ABXS "+ ++t);
		System.out.println("------------------------------------------------------");
		if (type=='N')
		System.out.println("\nFood type: "+ "Nonveg");
		else
		System.out.println("\nFood type: "+ "Veg");
		System.out.print("Cost per plate: "); System.out.println("\t\t Nonveg:15$  Veg:12$");
		System.out.println("Foodcost= "+Platecost+"$");
		System.out.println("Dilevery cost= "+distance+"$");
		System.out.println("Total: "+ (Platecost+distance)+"$");
		System.out.println("Payment method: "+method);
		System.out.println("                        Paid/-");
		System.out.println("------------------------------------------------------");
	}
}


class Restuarent {
	// method to calculate amount per distance
	public static int Dis_cost(int distance) {
		if (distance <= 3)
			return 0;
		else if (distance >= 3 && distance <= 6)
			return 1;
		else
			return 2;

	}

	public static void main(String[] args) {

		Scanner x = new Scanner(System.in);
		System.out.println("ENTER V for veg N for Nonveg:");
		int Dcost,Pcost;
		String method;
		char k = x.next().charAt(0); // added charAt(0) also changed type of k to char
		System.out.println(k);
		if (k == 'V') // "N" changed to 'N'
		{ 
			System.out.print("QUANTITY :");
			int Quantity = x.nextInt();
			Pcost = 12 * Quantity;
			System.out.print("DISTANCE (in KMs):");
			int distance = x.nextInt();
			Dcost = Dis_cost(distance);
			int Total_cost = Pcost + Dcost;
			System.out.println("TOTAL:" + Total_cost + "$");

		} else {
			
			System.out.print("QUANTITY :");
			int Quantity = x.nextInt();
			Pcost = 15 * Quantity;
			System.out.print("DISTANCE (in KMs):");
			int distance = x.nextInt();
			Dcost = Dis_cost(distance);
			int Total_cost = Pcost + Dcost;
			System.out.println("TOTAL:" + Total_cost + "$");

		}
		System.out.print("Pay:"); System.out.println("click: 1.PayTM 2.Paypal 3.CreditCARD 4.DebitCARD");
		int t=x.nextInt();
		switch(t){
			case 1:
			method="PayTM";
			break;
			case 2:
			method="Paypal";
			break;
			case 3:
			method="CreditCARD";
			break;
			default:
			method="DebitCARD";
			break;
		}
		System.out.println("___________________ORDER RECIEPT:_____________________");

        Bill_receipt r=new Bill_receipt("vipul",Pcost,Dcost,method,k);
        r.printdata();

		x.close();
	}
}