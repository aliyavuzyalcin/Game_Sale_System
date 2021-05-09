package gameSalesSystem.business.concrete;

import gameSalesSystem.business.abstracts.CampaignService;
import gameSalesSystem.entity.concrete.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println("New campaign added successfully! Details : " + "\nCampaign Code : " + campaign.getCode() + "\nCampaign Time : " + campaign.getDuration() + 
				"\nCampaign Name : " + campaign.getName() + "\nCampaign Type : " + campaign.getType());
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Campaign updated successfully! Details : " + "\nCampaign Code : " + campaign.getCode() + "\nCampaign Time : " + campaign.getDuration() + 
				"\nCampaign Name : " + campaign.getName() + "\nCampaign Type : " + campaign.getType());
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Campaign deleted successfully! Details : " + "\nCampaign Code : " + campaign.getCode() + "\nCampaign Time : " + campaign.getDuration() + 
				"\nCampaign Name : " + campaign.getName() + "\nCampaign Type : " + campaign.getType());
		
	}

}
