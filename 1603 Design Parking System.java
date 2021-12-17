class ParkingSystem {
         int[] lots=new int[3];

    public ParkingSystem(int big, int medium, int small) {
   
        lots[0]=big;
        lots[1]=medium;
        lots[2]=small;
    }
    
    public boolean addCar(int carType) {
         if(lots[carType-1]>0) {
            lots[carType-1]--;
            return true;}
        else return false;
    }
}