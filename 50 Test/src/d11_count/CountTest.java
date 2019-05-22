package d11_count;

/*有1、2、3、4个数字，
 * 能组成多少个互不相同且无重复数字的三位数？
 * 都是多少？
程序分析：可填在百位、十位、个位的数字都是1、2、3、4。
组成所有的排列后再去 掉不满足条件的排列。
*/
public class CountTest {
	public static void main(String[] args) {
		int count = 0;
		int sum = 0;
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j < 5; j++) {
				if (i == j) {
					continue;
				}

				for (int k = 1; k < 5; k++) {
					if (!(i == k) && !(j == k)) {
						sum = i * 100 + j * 10 + k;
						System.out.print(sum+" ");
						if((++count)%5==0) {
							//if判断也改变了count的值
							System.out.println();
						}
					}
				}
			}
		}
		System.out.println("共"+count+"个");
	}
}
