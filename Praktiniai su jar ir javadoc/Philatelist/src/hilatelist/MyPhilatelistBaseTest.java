package hilatelist;

import philatelist.Philatelist;
import philatelist.PhilatelistBaseTest;

public class MyPhilatelistBaseTest extends PhilatelistBaseTest{

	@Override
	protected Philatelist getPhilatelist() {
		// TODO Auto-generated method stub
		return new MyPhilatelist();
	}

}
