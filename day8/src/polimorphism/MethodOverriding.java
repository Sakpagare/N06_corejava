package polimorphism;
class ChiefMinister
{
	static void corruption(String str1,float amount)
	{
		System.out.println(str1+"corrupted the amount of  "+ amount);
	}
}
class MLA extends ChiefMinister
{
	static void corruption(String str2,float amount2)
	{
		ChiefMinister.corruption("Eknath Shinde", 5757.90f);
		System.out.println(str2+"corrupted the amount of  "+ amount2);
	}

}

public class MethodOverriding {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MLA.corruption("Banwarillal Purohit", 5463.00f);

	}

}
