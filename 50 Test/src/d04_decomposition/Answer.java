package d04_decomposition;
/* ��n���зֽ���������Ӧ���ҵ�һ����С������k
 * (1)����������ǡ����n��
 * ��˵���ֽ��������Ĺ����Ѿ���������ӡ�����ɡ�
   (2)���n<>k����n�ܱ�k������
         ��Ӧ��ӡ��k��ֵ������n����k����,��Ϊ�µ�������n,�ظ�ִ�е�һ����
    (3)���n���ܱ�k������
          ����k+1��Ϊk��ֵ,�ظ�ִ�е�һ����

 * */
public class Answer {
	public static void main(String[] args){
		int n = 101;
		decompose(n);
	}
	private static void decompose(int n){
		System.out.print(n+"=");
		for(int i=2;i<n+1;i++){
			while(n%i==0 && n!=i){
				n/=i;
				System.out.print(i+"*");
			}
			if(n==i){
				System.out.println(i);
				break;
			}
		}
	}

}