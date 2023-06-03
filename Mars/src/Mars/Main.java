package Mars;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int flag;
        Scanner scanner = new Scanner(System.in);
        PriceMovement priceMovement = new PriceMovement();
        Random r = new Random();
        Coin BTC=new Bitcoin();
        Coin ETH=new Ethereum();
        Coin DOGE=new Doge();
        Coin LUNA=new Luna();
        Coin WEMIX=new Wemix();
        ShowPrice showPrice = new ShowPrice();
        Add_User add_user = new Add_User();
        //while (true){
        //    System.out.println("================================");
        //    System.out.println("1. 회원가입    2. 로그인    0. 종료");
        //    flag=scanner.nextInt();
        //    add_user.sign_in();
        // }
        
        
        
        
    }
}