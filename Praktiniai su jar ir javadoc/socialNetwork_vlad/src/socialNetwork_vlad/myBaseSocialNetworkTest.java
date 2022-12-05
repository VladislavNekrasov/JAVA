package socialNetwork_vlad;

import lt.infobalt.itakademija.javalang.exam.socialnetwork.BaseSocialNetworkTest;
import lt.infobalt.itakademija.javalang.exam.socialnetwork.SocialNetwork;

public class myBaseSocialNetworkTest extends BaseSocialNetworkTest{

	@Override
	protected SocialNetwork getSocialNetwork() {
		MySocialNetwork network = new MySocialNetwork();
		return network;
	}
	

}
