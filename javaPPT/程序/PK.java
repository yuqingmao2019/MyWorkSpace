package test;


import java.util.*;//����;*�Ŵ������԰�
public class PK {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int HP1=0;//��Ңٵ�Ѫ��1
		int ATN1=0;//��ҢٵĹ�����
		int HP2=0;//��Ңڵ�Ѫ��
		int ATN2=0;//��ҢڵĹ�����
		int Hero1=0;//��Ңٵ�Ӣ��
		int Hero2=0;//��Ңڵ�Ӣ��
		System.out.println("��ɫ��1.��֪���裨���⣩  2.���Ҿ�����Ѫ���� 3.�ȿ�¶¶���߹�����");
		System.out.println("��Ң�ѡ���ɫ ��");
		Scanner sc1=new Scanner(System.in);//������䣺��Ң�ѡ���ɫ��
		Hero1=sc1.nextInt();//ת��Ϊ����
		System.out.println("��Ң�ѡ��");
		Scanner sc2=new Scanner(System.in);//������䣺��Ң�ѡ���ɫ��
		Hero2=sc2.nextInt();//ת��Ϊ����
		for(int i=1;i<4;i++){
			if(Hero1==1){//�ж�Ӣ�۲��������ֵ����
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
			System.out.println("��"+i+"�غ���Ң�HP��"+HP1);
			System.out.println("      ATN��"+ATN1);
			System.out.println("------------------------------");
			System.out.println("��"+i+"�غ���Ң�HP��"+HP2);
			System.out.println("      ATN��"+ATN2);
			Thread.sleep(1000);//��ʱһ��
			System.out.println("------------------------------");
			while(HP1>0&HP2>0){
				HP1-=ATN2;
			System.out.println("��Ң�����Ңٷ��𹥻�---��Ң�ʣ��HP:"+HP1);
				HP2-=ATN1;
			System.out.println("��Ң�����Ңڷ��𹥻�---��Ң�ʣ��HP:"+HP2);
			System.out.println("------------------------------");
			Thread.sleep(1000);//��ʱһ��
			if(HP1>0&HP2<=0){
				System.out.println("��"+i+"�غ���Ң�ʤ����");
				Thread.sleep(2000);//��ʱ����
				}
			if(HP2>0&HP1<=0){
				System.out.println("��"+i+"�غ���Ң�ʤ����");
				Thread.sleep(2000);//��ʱ����
				}
			if(HP1<=0&HP2<=0){
				System.out.println("��"+i+"�غ�ƽ�֣�");
				Thread.sleep(2000);//��ʱ����
				}
			}
		}
	 }

}
