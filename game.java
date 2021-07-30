import java.util.Scanner;
public class game{
public static void main(String[] args){
	Scanner scanner=new Scanner(System.in);
	System.out.println("*****************");
	System.out.println("戦艦ゲーム");
	System.out.println("*****************");
	System.out.println("---------[ターン1]---------");
	System.out.println("船1:生きている");
	System.out.println("船2:生きている");
	System.out.println("船3:生きている");
	System.out.println("爆弾のX座標を入力してください(1-5)");
	int ship=scanner.nextInt();
	System.out.println(ship);
	System.out.println("爆弾のY座標を入力してください(1-5)");
	int ship1=scanner.nextInt();
	System.out.println(ship1);	
	System.out.println("---------[ターン2]---------");
	System.out.println("船1:生きている");
	System.out.println("船2:生きている");
	System.out.println("船3:生きている");
	System.out.println("爆弾のX座標を入力してください(1-5)");
	int ship2=scanner.nextInt();
	System.out.println(ship2);
	System.out.println("爆弾のY座標を入力してください(1-5)");
	int ship3=scanner.nextInt();
	System.out.println(ship3);	
}
}
