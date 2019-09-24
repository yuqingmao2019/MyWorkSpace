package test;


import java.util.*;//引入;*号代表所以包
public class PK {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int HP1=0;//玩家①的血量1
		int ATN1=0;//玩家①的攻击力
		int HP2=0;//玩家②的血量
		int ATN2=0;//玩家②的攻击力
		int Hero1=0;//玩家①的英雄
		int Hero2=0;//玩家②的英雄
		System.out.println("角色：1.不知火舞（均衡）  2.橘右君（高血量） 3.娜可露露（高攻击）");
		System.out.println("玩家①选择角色 ：");
		Scanner sc1=new Scanner(System.in);//输入语句：玩家①选择角色；
		Hero1=sc1.nextInt();//转化为整形
		System.out.println("玩家②选择：");
		Scanner sc2=new Scanner(System.in);//输入语句：玩家②选择角色；
		Hero2=sc2.nextInt();//转化为整形
		for(int i=1;i<4;i++){
			if(Hero1==1){//判断英雄并且随机赋值属性
				HP1=1000+5*(int)(Math.random()*100);
				ATN1=200+1*(int)(Math.random()*100);
				}
			if(Hero1==2){
				HP1=1000+15*(int)(Math.random()*100);
				ATN1=200;
				}
			if(Hero1==3){
				HP1=1000;
				ATN1=200+3*(int)(Math.random()*100);
				}
			if(Hero2==1){
				HP2=1000+5*(int)(Math.random()*100);
				ATN2=200+1*(int)(Math.random()*100);
				}
			if(Hero2==2){
				HP2=1000+15*(int)(Math.random()*100);
				ATN2=200;
				}
			if(Hero2==3){
				HP2=1000;
				ATN2=200+3*(int)(Math.random()*100);
				}
			System.out.println("------------------------------");
			System.out.println("第"+i+"回合玩家①HP："+HP1);
			System.out.println("      ATN："+ATN1);
			System.out.println("------------------------------");
			System.out.println("第"+i+"回合玩家②HP："+HP2);
			System.out.println("      ATN："+ATN2);
			Thread.sleep(1000);//延时一秒
			System.out.println("------------------------------");
			while(HP1>0&HP2>0){
				HP1-=ATN2;
			System.out.println("玩家②向玩家①发起攻击---玩家①剩余HP:"+HP1);
				HP2-=ATN1;
			System.out.println("玩家①向玩家②发起攻击---玩家②剩余HP:"+HP2);
			System.out.println("------------------------------");
			Thread.sleep(1000);//延时一秒
			if(HP1>0&HP2<=0){
				System.out.println("第"+i+"回合玩家①胜出！");
				Thread.sleep(2000);//延时两秒
				}
			if(HP2>0&HP1<=0){
				System.out.println("第"+i+"回合玩家②胜出！");
				Thread.sleep(2000);//延时两秒
				}
			if(HP1<=0&HP2<=0){
				System.out.println("第"+i+"回合平局！");
				Thread.sleep(2000);//延时两秒
				}
			}
		}
	 }

}
