class Bill{
    private static int counter=9000;
    private String method;
    private String BillID;
    
    public Bill(String method)
    {
        this.method=method;
        this.BillID="B"+ ++counter;
    }
    public String getBillId(){
       return BillID; 
    }
    public String getPaymentMode(){
        return this.method;
    }
}
class Billmethod{
    public static void main(String[] args) {

        Bill bill1 = new Bill("DebitCard");
        Bill bill2 = new Bill("PayPal");
        Bill bill3= new Bill ("DebitCard");
        
        //Create more objects and add them to the bills array for testing your code
              
        Bill[] bills = { bill1, bill2, bill3 };
              
        for (Bill bill : bills) {
            System.out.println("Bill Details");
            System.out.println("Bill Id: " + bill.getBillId());
            System.out.println("Payment method: " + bill.getPaymentMode());
            System.out.println();
       }
    }
}