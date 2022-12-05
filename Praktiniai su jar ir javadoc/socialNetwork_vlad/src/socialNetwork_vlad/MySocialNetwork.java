package socialNetwork_vlad;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

import lt.infobalt.itakademija.javalang.exam.socialnetwork.Friend;
import lt.infobalt.itakademija.javalang.exam.socialnetwork.FriendNotFoundException;
import lt.infobalt.itakademija.javalang.exam.socialnetwork.SocialNetwork;

public class MySocialNetwork implements SocialNetwork {
	Collection<Friend> friends;

	public MySocialNetwork() {
		super();
		this.friends = new ArrayList<>();
	}

	@Override
	public void addFriend(Friend friend) {
		
		if (friend != null) {
			if (!friends.contains(friend)) {
				friends.add(friend);
			}
			
		} else {
			throw new IllegalArgumentException();
		}

	}

	@Override
	public Collection<Friend> findByCity(String city) {
		Collection<Friend> sameCity = new ArrayList();

		if (city != null) {

			for (Friend friend : friends) {
				if (friend.getCity().equals(city)) {
					sameCity.add(friend);
				}
			}
		} else {
			throw new IllegalArgumentException();
		}

		if (sameCity.size()>0) {
				return sameCity;
			} else {
				return sameCity;
			
			}
	}

	@Override
	public Friend findFriend(String firstname, String lastname) throws FriendNotFoundException {
		if(firstname!= null && lastname!=null){
	        return friends.stream()
	                .filter(friend -> (firstname.equals(friend.getFirstName())) && lastname.equals(friend.getLastName()))
	                .findAny()
	                .orElseThrow(()->new FriendNotFoundException(firstname,lastname));}
	       throw new IllegalArgumentException();
	

	}

	@Override
	public int getNumberOfFriends() {
		return friends.size();	
	}

	@Override
	public Collection<Friend> getOrderedFriends() {
		List<Friend> orderedFriends = new ArrayList<>();
		
        if(friends!=null && friends.size()!=0){
            orderedFriends = new ArrayList<>(friends.stream()
                    .sorted(Comparator.comparing(Friend::getCity)
                    .thenComparing(Friend::getLastName)
                    .thenComparing(Friend::getFirstName)).toList());
        }
        return orderedFriends;
	}

}
