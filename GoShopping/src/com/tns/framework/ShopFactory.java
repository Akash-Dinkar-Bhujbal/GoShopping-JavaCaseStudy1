package com.tns.framework;

public abstract class ShopFactory {
//	Abstract methods: As per PDF
//	public abstract PrimeAcc getNewPrimeAccount(int accNo, String accNm, float charges, boolean isPrime);
//	public abstract NormalAcc getNewNormalAccount(int accNo, String accNm, float charges, float deliveryCharges);

	public abstract PrimeAcc getNewPrimeAccount(int accNo, String accNm, float charges, boolean isPrime);

	public abstract NormalAcc getNewNormalAccount(int accNo, String accNm, float charges, boolean isPrime);
}
