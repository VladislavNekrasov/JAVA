package hilatelist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.PriorityQueue;

import philatelist.Philatelist;
import philatelist.PostStamp;

public class MyPhilatelist implements Philatelist {
	ArrayList<PostStamp> postStamps;
	
	public MyPhilatelist(){
		postStamps = new ArrayList<>();
	}

	@Override
	public void addToCollection(PostStamp stamp) {
		if ( stamp != null && stamp.getName() != null && !stamp.getName().isEmpty()) {
			if( !postStamps.contains(stamp)) {
				this.postStamps.add(stamp);
			}
		} else {
			throw new IllegalArgumentException();
		}
		

	}

	@Override
	public double getAveragePostStampPrice() {
		double sum = 0;
		for(PostStamp stampp : postStamps) {
			sum += stampp.getMarketPrice();
		}
		return sum / getNumberOfPostStampsInCollection();
	}

	@Override
	public int getNumberOfPostStampsInCollection() {
		// TODO Auto-generated method stub
		return postStamps.size();
	}

	@Override
	public PostStamp getTheMostExpensivePostStamByMarketValue() {
		// TODO Auto-generated method stub
		double maxPrice = 0.0;
		PostStamp Expensive = null;
		for(PostStamp stamp : postStamps) {
			if(maxPrice< stamp.getMarketPrice()) {
				maxPrice = stamp.getMarketPrice();
				Expensive = stamp;
			}
		}
		return Expensive;
	}

}
